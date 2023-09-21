import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import MenuItem from '@mui/material/MenuItem';
import Select from '@mui/material/Select';
import Stack from '@mui/material/Stack';
import Snackbar from '@mui/material/Snackbar';
import { Alert, Input } from '@mui/material';
import Navbar from './Navbar';
import axios from 'axios';
import { useState } from 'react';
import { parseString } from 'xml2js';
import { useEffect } from 'react';


const initialState = {
  firstName: '',
  lastName: '',
  dateOfBirth: '',
  landlineNo: '',
  mobileNo: '',
  tempAddr: '',
  permAddr: '',
  pincode: '',
  occupation: '',
  pancardNo: '',
  aadharNo: '',
};

export default function AddOwner() {
  const [gender, setGender] = React.useState('');
  const [data, setData] = React.useState(initialState);
  const [openSnackbar, setOpenSnackbar] = React.useState(false);
  const [alertMessage, setAlertMessage] = React.useState('');

  const handleChange = (event) => {
    setGender(event.target.value);
  };

  const { firstName, lastName, dateOfBirth, landlineNo, mobileNo, tempAddr, permAddr, pincode, occupation, pancardNo, aadharNo } = data;

  // XML state
  const [selectedFile, setSelectedFile] = useState(null);
  const [importedData, setImportedData] = useState(null);

  const onChange = e => {
    setData({ ...data, [e.target.name]: e.target.value })
  }

  const onSubmitClickHandler = e => {
    // e.preventDefault();
    // Validate the required fields
    if (!isFormValid()) {
      return; // Exit the function if any required field is empty
    }

    const owner = { firstName: firstName, lastName: lastName, dateOfBirth: dateOfBirth, gender: gender, landlineNo: landlineNo, mobileNo: mobileNo, tempAddr: tempAddr, permAddr: permAddr, pincode: pincode, occupation: occupation, pancardNo: pancardNo, aadharNo: aadharNo }
    ownerDetails(owner).then((resp) => {
      console.log(resp);
    }).catch((error) => {
      console.log(error);
    })

    setAlertMessage(`${firstName} details added successfully`);
    console.log(data)
    setOpenSnackbar(true);
    setData(initialState); // Reset the form
    setGender('');
  }

  const ownerDetails = (owner) => {
    return axios.post("http://localhost:8093/owners/addOwner", owner, {
      headers: {
        "Content-Type": "application/json",
        "Accept": "application/json",
      }
    })
      .then((response) => response.data)
  }

  const handleCloseSnackbar = () => {
    setOpenSnackbar(false);
  };

  const panCardRegex = /^[A-Z]{5}[0-9]{4}[A-Z]{1}$/;
  const aadhaarCardRegex = /^\d{4}\s\d{4}\s\d{4}$/;

  const isPANCardValid = panCardRegex.test(pancardNo);
  const isAadhaarCardValid = aadhaarCardRegex.test(aadharNo);

  const validatepancardNo = (value) => {
    return panCardRegex.test(value);
  };

  const validateAadhaarCardNumber = (value) => {
    return aadhaarCardRegex.test(value);
  };

  const handleFileSelection = (event) => {
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
    const fields= ['firstName', 'lastName', 'birthdate', 'landlineNo', 'mobileNo', 'gender', 'temporaryAddress', 'permanentAddress', 'pincode', 'occupation', 'pancardNumber', 'aadharNumber'];
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

      reader.readAsText(selectedFile);
      // setSelectedFile(file);
    }
  }


  const isFormValid = () => {
    // Check if all required fields are filled

    return (
      firstName !== '' &&
      lastName !== '' &&
      dateOfBirth !== '' &&
      landlineNo !== '' &&
      mobileNo !== '' &&
      gender !== '' &&
      tempAddr !== '' &&
      permAddr !== '' &&
      pincode !== '' &&
      occupation !== '' &&
      pancardNo !== '' &&
      isPANCardValid &&
      aadharNo !== '' &&
      isAadhaarCardValid
    );
  };

  const resetHandler = e => {
    // e.preventDefault();
    setData(initialState);
    setGender('');
  }

  // Function to handle validation and set max date for date picker
  const handleDateChange = (event) => {
    const { name, value } = event.target;

    // Limit the date picker to past dates
    const currentDate = new Date().toISOString().split('T')[0];
    if (name === 'dateOfBirth' && value > currentDate) {
      setData({ ...data, dateOfBirth: currentDate });
    } else {
      setData({ ...data, [name]: value });
    }
  };

  // useEffect hook to automatically fill the text fields after importing the data
  useEffect(() => {
    if (importedData) {
      setData({
        firstName: importedData.firstName ? importedData.firstName[0] : '',
        lastName: importedData.lastName ? importedData.lastName[0] : '',
        dateOfBirth: importedData.dateOfBirth ? importedData.dateOfBirth[0] : '',
        landlineNo: importedData.landlineNo ? importedData.landlineNo[0] : '',
        mobileNo: importedData.mobileNo ? importedData.mobileNo[0] : '',
        gender: importedData.gender ? importedData.gender[0] : '',
        tempAddr: importedData.tempAddr ? importedData.tempAddr[0] : '',
        permAddr: importedData.permAddr ? importedData.permAddr[0] : '',
        pincode: importedData.pincode ? importedData.pincode[0] : '',
        occupation: importedData.occupation ? importedData.occupation[0] : '',
        pancardNo: importedData.pancardNo ? importedData.pancardNo[0] : '',
        aadharNo: importedData.aadharNo ? importedData.aadharNo[0] : '',
      });
      setGender(importedData.gender ? importedData.gender[0] : '');
      
    }
  }, [importedData]);

  const formatAadharNumber = (value) => {
    // Remove any non-digit characters from the input
    const cleanedValue = value.replace(/\D/g, '');

    // Format the cleaned value in "xxxx xxxx xxxx" format
    const formattedValue = cleanedValue.replace(/(\d{4})(?=\d)/g, '$1 ');

    return formattedValue;
  };

  const handleAadharNumberChange = (event) => {
    const { value } = event.target;
    const formattedAadharNumber = formatAadharNumber(value);
    setData({ ...data, aadharNo: formattedAadharNumber });
  };

  return (
    <React.Fragment>
      <Navbar></Navbar>
      <Container component="main" maxWidth="md">

        <Box
          boxShadow={'5px 5px 10px grey'}
          sx={{
            margin: 8,
            display: 'flex',
            flexDirection: 'column',
            alignItems: 'center',
          }}
        >
          <Typography component="h1" variant="h5" mt={3}>
            Add Owner Details
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
                  variant="contained"
                  onClick={importButton}
                  sx={{ width: 100, mt: 1, mb: 2, marginLeft: 'auto', marginRight: 'auto' }}
                  component="label">
                  Import
                </Button>
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  name="firstName"
                  required
                  fullWidth
                  id="firstName"
                  label="First Name"
                  autoFocus
                  onChange={onChange}
                  value={firstName}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="lastName"
                  id="lastName"
                  label="Last Name"
                  onChange={onChange}
                  value={lastName}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="dateOfBirth"
                  id="dateOfBirth"
                  type='date'
                  helperText="Date of Birth"
                  onChange={handleDateChange}
                  value={dateOfBirth}
                  // Add the max attribute to allow only past dates
                  max={new Date().toISOString().split("T")[0]}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="landlineNo"
                  id="landlineNo"
                  label="Landline Number"
                  onChange={onChange}
                  value={landlineNo}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="mobileNo"
                  id="mobileNo"
                  label="Mobile Number"
                  onChange={onChange}
                  value={mobileNo}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <Select
                  name="gender"
                  id="gender"
                  value={gender}
                  displayEmpty
                  fullWidth
                  onChange={handleChange}
                >
                  <MenuItem value=''>Gender</MenuItem>
                  <MenuItem value={'M'}>Male</MenuItem>
                  <MenuItem value={'F'}>Female</MenuItem>
                  <MenuItem value={'O'}>Other</MenuItem>
                </Select>
              </Grid>

              <Grid item xs={12}>
                <TextField
                  required
                  name="tempAddr"
                  fullWidth
                  id="tempAddr"
                  label="Temporary Address"
                  onChange={onChange}
                  value={tempAddr}
                />
              </Grid>

              <Grid item xs={12}>
                <TextField
                  required
                  fullWidth
                  name="permAddr"
                  id="permAddr"
                  label="Permanent Address"
                  onChange={onChange}
                  value={permAddr}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="pincode"
                  id="pincode"
                  label="Pincode"
                  onChange={onChange}
                  value={pincode}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="occupation"
                  id="occupation"
                  label="Occupation"
                  onChange={onChange}
                  value={occupation}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="pancardNo"
                  id="pancardNo"
                  label="Pancard Number"
                  onChange={onChange}
                  value={pancardNo}
                  inputProps={{
                    maxLength: 10, // Limit the input to 14 characters (including spaces)
                  }}
                  error={pancardNo !== '' && !validatepancardNo(pancardNo)}
                  helperText={pancardNo !== '' && !validatepancardNo(pancardNo) ? 'ABCDE1234A' : ''}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="aadharNo"
                  id="aadharNo"
                  label="Aadhar Number"
                  onChange={handleAadharNumberChange}
                  value={aadharNo}
                  inputProps={{
                    maxLength: 14, // Limit the input to 14 characters (including spaces)
                  }}
                  error={aadharNo !== '' && !validateAadhaarCardNumber(aadharNo)}
                  helperText={aadharNo !== '' && !validateAadhaarCardNumber(aadharNo) ? '1234 5678 9012' : ''}
                />
              </Grid>
            </Grid>

            <Stack spacing={2} direction="row" justifyContent='center' alignItems='center'>
              <Button
                type="reset"
                variant="contained"
                sx={{ mt: 2, mb: 2, mr: 4 }}
                onClick={resetHandler}
              >
                Reset
              </Button>
              <Button
                type="submit"
                variant="contained"
                sx={{ mt: 3, mb: 2, ml: 4 }}
                onClick={onSubmitClickHandler}
              >
                Add Owner
              </Button>
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
