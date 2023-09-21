import React, { useState } from 'react';
import { Button, Snackbar, TextField, Alert } from '@mui/material';
import { Box, Container, Typography, Grid } from '@mui/material';
import Navbar from './Navbar';
import axios from 'axios';
import { parseString } from 'xml2js';
import { useEffect } from 'react';

const initialState = {
  vehicleType: '',
  vehicleName: '',
  modelNumber: '',
  vehicleColor: '',
  engineNumber: '',
  noOfCylinders: '',
  manufacturerName: '',
  dateOfManufacture: '',
  cubicCapacity: '',
  fuelUsed: '',
};

const vehicleDetails = (vehicle) => {
  return axios.post("http://localhost:8091/vehicles/addVehicle", vehicle, {
    headers: {
      "Content-Type": "application/json",
      "Accept": "application/json",
    }
  })
    .then((response) => response.data)
}

export default function AddVehicle() {
  const [openSnackbar, setOpenSnackbar] = useState(false);
  const [data, setData] = useState(initialState);
  const { vehicleType, engineNumber, modelNumber, vehicleName, vehicleColor, manufacturerName, dateOfManufacture, noOfCylinders, cubicCapacity, fuelUsed } = data;
  const [alertMessage, setAlertMessage] = useState('');

  // XML state
  const [selectedFile, setSelectedFile] = useState(null);
  const [importedData, setImportedData] = useState(null);

  const onChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };

  const onClickHandler = (e) => {
    // e.preventDefault();
    // Validate the required fields
    if (!isFormValid()) {
      return; // Exit the function if any required field is empty
    }

    console.log(data);
    vehicleDetails(data).then((resp) => {
      console.log(resp);
    }).catch((error) => {
      console.log(error);
      alert(error)
    })
    setAlertMessage(`${vehicleName} with model number ${modelNumber} added successfully`);
    setOpenSnackbar(true);
    setData(initialState); // Reset the form
  };

  const handleCloseSnackbar = () => {
    setOpenSnackbar(false);
  };

  const handleFileSelection = (event) => {
    // event.preventDefault()
    const file = event.target.files[0];

    if (!file) return; // No file selected

    // Check if the selected file is an XML file
    if (!file.type.startsWith('application/xml') && file.name.split('.').pop() !== 'xml') {
      alert('Please select only XML files.');
      event.target.value = ''; // Clear the file input value to reset the selection
      return;
    }

    setSelectedFile(file);


  };

  const importButton = () => {
   const fields= ['vehicleType', 'vehicleName', 'modelNumber', 'vehicleColor', 'engineNumber', 'noOfCylinders', 'manufacturerName', 'dateOfManufacture', 'cubicCapacity', 'fuelUsed'];
    if (selectedFile) {
      const reader = new FileReader();
      reader.onload = (event) => {
        const xmlString = event.target.result;
        
        // Parse the XML using xml2js
        parseString(xmlString, (err, json) => {
          if (err) {
            console.error('Error parsing XML:', err);
          } else {
            console.log(json.data);
            console.log(Object.keys(json.data));
            console.log();
            if(!fields.includes(Object.keys(json.data)[0])){
              alert('Error parsing XML file. Please make sure the XML file is correctly formatted.');
            }
            setImportedData(json.data);
          }
        });
      };
      
      console.log(importedData);
      reader.readAsText(selectedFile);
      // setSelectedFile(file);

    }

  }

  const isFormValid = () => {
    // Check if all required fields are filled
    return (
      vehicleType !== '' &&
      vehicleName !== '' &&
      modelNumber !== '' &&
      vehicleColor !== '' &&
      engineNumber !== '' &&
      noOfCylinders !== '' &&
      manufacturerName !== '' &&
      dateOfManufacture !== '' &&
      cubicCapacity !== '' &&
      fuelUsed !== ''
    );
  };

  const resetHandler = (e) => {
    e.preventDefault();
    setData(initialState);
  };

  // Function to handle validation and set max date for date picker
  const handleDateChange = (event) => {
    const { name, value } = event.target;

    // Limit the date picker to past dates
    const currentDate = new Date().toISOString().split('T')[0];
    if (name === 'dateOfManufacture' && value > currentDate) {
      setData({ ...data, dateOfManufacture: currentDate });
    } else {
      setData({ ...data, [name]: value });
    }
  };

  // useEffect hook to automatically fill the text fields after importing the data
  useEffect(() => {
    if (importedData) {
      setData({
        vehicleType: importedData.vehicleType ? importedData.vehicleType[0] : '',
        vehicleName: importedData.vehicleName ? importedData.vehicleName[0] : '',
        modelNumber: importedData.modelNumber ? importedData.modelNumber[0] : '',
        vehicleColor: importedData.vehicleColor ? importedData.vehicleColor[0] : '',
        engineNumber: importedData.engineNumber ? importedData.engineNumber[0] : '',
        noOfCylinders: importedData.noOfCylinders ? importedData.noOfCylinders[0] : '',
        manufacturerName: importedData.manufacturerName ? importedData.manufacturerName[0] : '',
        dateOfManufacture: importedData.dateOfManufacture ? importedData.dateOfManufacture[0] : '',
        cubicCapacity: importedData.cubicCapacity ? importedData.cubicCapacity[0] : '',
        fuelUsed: importedData.fuelUsed ? importedData.fuelUsed[0] : '',
      });
      
    }


  }, [importedData]);


  return (
    <React.Fragment>
      <Navbar></Navbar>
      <Container component="main" maxWidth="md">

        <Box boxShadow={'5px 5px 10px grey'} sx={{ margin: 8, display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
          <Typography component="h1" variant="h5" mt={3}>
            Add Vehicle Details
          </Typography>
          <Box component="form" sx={{ m: 3 }}>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={9}>
                <TextField
                  helperText="Choose XML File To Import"
                  type="file"
                  fullWidth
                  variant="outlined"
                  // accept=".xml"
                  accept="application/xml,.xml"
                  onChange={handleFileSelection}
                  InputLabelProps={{
                    shrink: true,
                  }}
                />
              </Grid>

              <Grid item xs={6} sm={3}>
                <Button
                  type="button"
                  // fullWidth
                  variant="contained"
                  onClick={importButton}
                  sx={{ width: 100, mt: 1, mb: 2, marginLeft: 'auto', marginRight: 'auto' }}
                  component="label">
                  Import
                </Button>
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField name="vehicleType" required fullWidth id="vehicleType" label="Vehicle Type" autoFocus onChange={onChange} value={vehicleType} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="vehicleName" id="vehicleName" label="Vehicle Name" onChange={onChange} value={vehicleName} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="modelNumber" id="modelNumber" label="Model Number" onChange={onChange} value={modelNumber} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="vehicleColor" id="vehicleColor" label="Vehicle Color" onChange={onChange} value={vehicleColor} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="engineNumber" id="engineNumber" label="Engine Number" onChange={onChange} value={engineNumber} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="noOfCylinders" id="noOfCylinders" label="No Of Cylinders" onChange={onChange} value={noOfCylinders} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="manufacturerName" id="manufacturerName" label="Manufacturer Name" onChange={onChange} value={manufacturerName} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="dateOfManufacture" id="dateOfManufacture" type="date" helperText="Date of Manufacture" onChange={handleDateChange} max={new Date().toISOString().split("T")[0]} value={dateOfManufacture} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="cubicCapacity" id="cubicCapacity" label="Cubic Capacity" onChange={onChange} value={cubicCapacity} />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="fuelUsed" id="fuelUsed" label="Fuel Used" onChange={onChange} value={fuelUsed} />
              </Grid>
            </Grid>

            <Button type="reset" variant="contained" sx={{ mt: 3, mb: 2, marginRight: 4 }} onClick={resetHandler}>
              Reset
            </Button>
            <Button type="submit" variant="contained" sx={{ mt: 3, mb: 2, marginLeft: 4 }} onClick={onClickHandler}>
              Add Vehicle
            </Button>
          </Box>
        </Box>
        <Snackbar open={openSnackbar} autoHideDuration={3000} onClose={handleCloseSnackbar} anchorOrigin={{ vertical: 'top', horizontal: 'right' }}>
          <Alert onClose={handleCloseSnackbar} severity="success">
            {alertMessage}
          </Alert>
        </Snackbar>
      </Container>
    </React.Fragment>
  );
}
