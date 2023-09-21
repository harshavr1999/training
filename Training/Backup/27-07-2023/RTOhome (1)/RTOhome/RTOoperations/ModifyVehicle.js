import * as React from 'react';
import { Button, TextField, Grid, Box, Typography, Container, Stack, Snackbar, Alert } from '@mui/material';
import Navbar from './Navbar';
import axios from 'axios';

const vehicleId = '';
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

//Axios
const getvehicleId = (vehicleNum) => {
  return axios.get("http://localhost:8092/registration/vehicleIdByNumber/" + vehicleNum)
    .then((response) => response.data)
}

const vehicleNumbers = () => {
  return axios.get("http://localhost:8092/registration/allVehicleNumbers")
    .then((response) => response.data)
}

const vehicle = (vehId) => {
  return axios.get(`http://localhost:8091/vehicles/vehicleById/${vehId}`)
    .then((response) => response.data)
}

const updateVehicle = (vehicle) => {
  return axios.put("http://localhost:8091/vehicles/updateVehicle", vehicle, {
    headers: {
      "Content-Type": "application/json",
      "Accept": "application/json",
    }
  })
    .then((response) => response.data)
}

const deletevehicle = (vehId) => {
  return axios.delete(`http://localhost:8091/vehicles/deleteVehicle/${vehId}`)
    .then((response) => response.data)
}

var vehicleNumberArray = [];

export default function ModifyVehicle() {
  const [vehicleNumber, setVehicleNumber] = React.useState('');
  const [data, setData] = React.useState(initialState);
  const [openSnackbar, setOpenSnackbar] = React.useState(false);
  const [alertMessage, setAlertMessage] = React.useState('');
  var [disableField, setDisableField] = React.useState(true);
  const [error, setError] = React.useState(false);

  var vehId = '';

  const regexPattern = /^[A-Z]{2}\d{2}[A-Z]{1,2}\d{4}$/;

  const vehicleNumberHandleChange = (event) => {
    const { value } = event.target;
    setVehicleNumber(value);
    vehicleNumbers().then((resp) => {
      vehicleNumberArray = resp;
      // console.log(vehicleNumberArray);
    }).catch((error) => {
      console.log(error);
    })

    setError(!validateVehicleNumber(value));
  };

  const validateVehicleNumber = (value) => {
    return regexPattern.test(value);
  };

  const { vehicleType, engineNumber, modelNumber, vehicleName, vehicleColor, manufacturerName, dateOfManufacture, noOfCylinders, cubicCapacity, fuelUsed } = data;


  const onChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };

  const onClickReset = () => {
    setData(initialState);
    setVehicleNumber('');
  }
  const onClickSearch = () => {

    vehicleNumberArray.forEach((item, index) => {

      if (item === vehicleNumber) {
        setDisableField(false);
        disableField = false;
        // console.log(vehId);
        getvehicleId(vehicleNumber).then((resp) => {
          vehId = resp;
          // setVId(vehId);
          console.log(vehId);
          // console.log(vId);

          vehicle(vehId).then((resp) => {
            console.log(vehId);
            // vehicleId=vehId;
            // console.log(vehicleId);
            const dummyData = {
              vehicleType: resp.vehicleType,
              vehicleName: resp.vehicleName,
              modelNumber: resp.modelNumber,
              vehicleColor: resp.vehicleColor,
              engineNumber: resp.engineNumber,
              noOfCylinders: resp.noOfCylinders,
              manufacturerName: resp.manufacturerName,
              dateOfManufacture: resp.dateOfManufacture,
              cubicCapacity: resp.cubicCapacity,
              fuelUsed: resp.fuelUsed,
            };
            console.log(dummyData);
            setData(dummyData);
          }).catch((error) => {
            console.log(error);
          })

        }).catch((error) => {
          console.log(error);
        })

      }
    })
    if (disableField) {
      alert('Invalid Vehicle Number');
    }

  };

  const onClickUpdate = () => {

    // Validate the required fields
    if (!isFormValid()) {
      return; // Exit the function if any required field is empty
    }

    getvehicleId(vehicleNumber).then((resp) => {
      vehId = resp;
      // setVId(vehId);
      console.log(vehId);
      // console.log(vId);
      const updateDetails = { vehicleId: vehId, vehicleType: vehicleType, engineNumber: engineNumber, modelNumber: modelNumber, vehicleName: vehicleName, vehicleColor: vehicleColor, manufacturerName: manufacturerName, dateOfManufacture: dateOfManufacture, noOfCylinders: noOfCylinders, cubicCapacity: cubicCapacity, fuelUsed: fuelUsed }

      updateVehicle(updateDetails).then((resp) => {
        console.log(resp);
      }).catch((error) => {
        console.log(error);
      })

    }).catch((error) => {
      console.log(error);
    })

    console.log(data);
    setAlertMessage(`${vehicleName} updated successfully`);
    setOpenSnackbar(true);
    setData(initialState); // Reset the form
    setVehicleNumber('');
  };

  const onClickDelete = () => {
    // Validate the required fields
    if (!isFormValid()) {
      return; // Exit the function if any required field is empty
    }

    getvehicleId(vehicleNumber).then((resp) => {
      vehId = resp;
      // setVId(vehId);
      console.log(vehId);
      // console.log(vId);

      deletevehicle(vehId).then((resp) => {
        console.log(resp);
      }).catch((error) => {
        console.log(error);
      })

    }).catch((error) => {
      console.log(error);
    })

    console.log(data);
    setAlertMessage(`${vehicleName} deleted successfully`);
    setOpenSnackbar(true);
    setData(initialState); // Reset the form
    setVehicleNumber('');
  };

  const handleCloseSnackbar = () => {
    setOpenSnackbar(false);
  };

  const isFormValid = () => {
    // Check if all required fields are filled
    return (
      vehicleNumber !== '' &&
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

  return (
    <React.Fragment>
      <Navbar></Navbar>
      <Container component="main" maxWidth="md">

        <Box boxShadow={'5px 5px 10px grey'} sx={{ margin: 8, display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
          <Typography component="h1" variant="h5" mt={3}>Modify Vehicle Details</Typography>
          <Box component="form" sx={{ m: 3 }}>
            <Grid container spacing={2}>
              <Grid item xs={8}>
                <TextField required fullWidth id="vehicleNumber" name="vehicleNumber" label="Vehicle Number" autoFocus value={vehicleNumber} onChange={vehicleNumberHandleChange} error={error}
                  helperText={error ? 'AB12AB1234' : ''} />
              </Grid>
              <Grid item xs={4}>
                <Button variant="contained" type='button' sx={{ mt: 1, mb: 1, ml: 2 }} onClick={onClickSearch}>Search</Button>
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="vehicleType" name="vehicleType" label="Vehicle Type" value={vehicleType} onChange={onChange} disabled={disableField} />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="vehicleName" name="vehicleName" label="Vehicle Name" value={vehicleName} onChange={onChange} disabled={disableField} />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="modelNumber" name="modelNumber" label="Model Number" value={modelNumber} onChange={onChange} disabled={disableField} />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="vehicleColor" name="vehicleColor" label="Vehicle Color" value={vehicleColor} onChange={onChange} disabled={disableField} />
              </Grid>

              <Grid item xs={12}>
                <TextField required fullWidth id="engineNumber" name="engineNumber" label="Engine Number" value={engineNumber} onChange={onChange} disabled={disableField} />
              </Grid>

              <Grid item xs={12}>
                <TextField required fullWidth id="noOfCylinders" name="noOfCylinders" label="No Of Cylinders" value={noOfCylinders} onChange={onChange} disabled={disableField} />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="manufacturerName" name="manufacturerName" label="Manufacturer Name" value={manufacturerName} onChange={onChange} disabled={disableField} />
              </Grid>


              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="dateOfManufacture" name="dateOfManufacture" type='date' helperText="Date of Manufacture" value={dateOfManufacture} onChange={handleDateChange} max={new Date().toISOString().split("T")[0]} disabled={disableField} />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="cubicCapacity" name="cubicCapacity" label="Cubic Capacity" value={cubicCapacity} onChange={onChange} disabled={disableField} />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth id="fuelUsed" name="fuelUsed" label="Fuel Used" value={fuelUsed} onChange={onChange} disabled={disableField} />
              </Grid>
            </Grid>
            <br></br>
            <Stack spacing={5} direction="row" justifyContent='center' alignItems='center' sx={{ mt: 1, mb: 2, ml: 2 }}>
              <Button type="reset" variant="contained" onClick={onClickReset}>Reset</Button>
              <Button type="submit" variant="contained" disabled={!isFormValid()} onClick={onClickUpdate}>Update</Button>
              <Button type="submit" variant="contained" disabled={!isFormValid()} onClick={onClickDelete}>Delete</Button>
            </Stack>

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
