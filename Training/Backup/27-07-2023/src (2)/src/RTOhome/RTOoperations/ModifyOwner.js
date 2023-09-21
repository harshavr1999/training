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
import { Alert } from '@mui/material';
import Navbar from './Navbar';
import axios from 'axios';

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

const ownerDetails = (vehicleNumber) => {
  return axios.get(`http://localhost:8093/owners/ownerByVehicleNo/${vehicleNumber}`)
    .then((response) => response.data)
}

const ownerId = (vehicleNumber) => {
  return axios.get(`http://localhost:8093/owners/ownerByVehicleNo/${vehicleNumber}`)
    .then((response) => response.data.ownerId)
}

const updateOwner = (owner) => {
  return axios.put("http://localhost:8093/owners/updateOwner", owner, {
    headers: {
      "Content-Type": "application/json",
      "Accept": "application/json",
    }
  })
    .then((response) => response.data)
}

const deleteOwner = (ownerId) => {
  return axios.delete(`http://localhost:8093/owners/deleteOwner/${ownerId}`)
    .then((response) => response.data)
}

const vehicleNumbers = () => {
  return axios.get("http://localhost:8092/registration/allVehicleNumbers")
    .then((response) => response.data)
}

var vehicleNumberArray = [];

export default function ModifyOwner() {
  const [gender, setGender] = React.useState('');
  const [data, setData] = React.useState(initialState);
  const [openSnackbar, setOpenSnackbar] = React.useState(false);
  const [alertMessage, setAlertMessage] = React.useState('');
  var [disableField, setDisableField] = React.useState(true);
  const [vehicleNumber, setVehicleNumber] = React.useState('');
  // const [ownerId, setOwnerId] = React.useState('');
  const [error, setError] = React.useState(false);

  const regexPattern = /^[A-Z]{2}\d{2}[A-Z]{1,2}\d{4}$/;

  const handleChange = (event) => {
    setGender(event.target.value);
  };

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

  const { firstName, lastName, dateOfBirth, landlineNo, mobileNo, tempAddr, permAddr, pincode, occupation, pancardNo, aadharNo } = data;

  const onChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };



  const onClickSearch = () => {

    vehicleNumberArray.forEach((item, index) => {
      if (item === vehicleNumber) {
        setDisableField(false);
        disableField = false;

        ownerDetails(vehicleNumber).then((resp) => {

          const dummyData = {
            firstName: resp.firstName,
            lastName: resp.lastName,
            dateOfBirth: resp.dateOfBirth,
            landlineNo: resp.landlineNo,
            mobileNo: resp.mobileNo,
            tempAddr: resp.tempAddr,
            permAddr: resp.permAddr,
            pincode: resp.pincode,
            occupation: resp.occupation,
            pancardNo: resp.pancardNo,
            aadharNo: resp.aadharNo
          };
          console.log(dummyData);
          setData(dummyData);
          setGender(resp.gender);
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
    if (!isFormValid()) {
      return;
    }

    ownerId(vehicleNumber).then((resp) => {
      ownId = resp;
      console.log(ownId);
      const updateDetails = { ownerId: ownId, firstName: firstName, lastName: lastName, dateOfBirth: dateOfBirth, landlineNo: landlineNo, mobileNo: mobileNo, tempAddr: tempAddr, permAddr: permAddr, pincode: pincode, occupation: occupation, pancardNo: pancardNo, aadharNo: aadharNo, gender: gender }

      updateOwner(updateDetails).then((resp) => {
        console.log(resp);
      }).catch((error) => {
        console.log(error);
      })
    }).catch((error) => {
      console.log(error);
    })

    setAlertMessage(`${firstName} details updated successfully`);
    console.log('UPDATED');
    console.log(data);
    setOpenSnackbar(true);
    setData(initialState);
    setGender('');
    setVehicleNumber('');
  };



  const onClickDelete = () => {
    if (!isFormValid()) {
      return;
    }

    ownerId(vehicleNumber).then((resp) => {
      ownId = resp;
      console.log(ownId);

      deleteOwner(ownId).then((resp) => {
        console.log(resp);
      }).catch((error) => {
        console.log(error);
      })

    }).catch((error) => {
      console.log(error);
    })


    setAlertMessage(`${firstName} details deleted successfully`);
    console.log('DELETED');
    console.log(data);
    setOpenSnackbar(true);
    setData(initialState);
    setGender('');
    setVehicleNumber('');
  };

  const handleCloseSnackbar = () => {
    setOpenSnackbar(false);
  };

  var ownId = '';

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


  const isFormValid = () => {
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
      isAadhaarCardValid &&
      vehicleNumber !== ''
    );
  };

  const handleReset = () => {
    setData(initialState);
    setGender('');
    setVehicleNumber('');
  };

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
            Modify Owner Details
          </Typography>
          <Box component="form" sx={{ m: 3 }}>
            <Grid container spacing={2}>
              <Grid item xs={8} sm={8}>
                <TextField
                  required
                  fullWidth
                  name="vehicleNumber"
                  id="vehicleNumber"
                  label="Vehicle Number"
                  autoFocus
                  value={vehicleNumber}
                  onChange={vehicleNumberHandleChange}
                  error={error}
                  helperText={error ? 'AB12AB1234' : ''}
                />
              </Grid>
              <Grid item xs={4} sm={4}>
                <Button variant="contained" type="button" sx={{ mt: 1, mb: 1, ml: 2 }} onClick={onClickSearch}>
                  Search
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
                  disabled={disableField}
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
                  disabled={disableField}
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
                  type="date"
                  helperText="Date of Birth"
                  disabled={disableField}
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
                  disabled={disableField}
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
                  disabled={disableField}
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
                  disabled={disableField}
                  onChange={handleChange}
                >
                  <MenuItem value="">Gender</MenuItem>
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
                  disabled={disableField}
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
                  disabled={disableField}
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
                  disabled={disableField}
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
                  disabled={disableField}
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
                  disabled={disableField}
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
                  disabled={disableField}
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

            <Stack spacing={5} direction="row" justifyContent="center" alignItems="center" sx={{ mt: 2, mb: 2, ml: 2 }}>
              <Button type="reset" variant="contained" onClick={handleReset}>
                Reset
              </Button>
              <Button type="submit" variant="contained" disabled={!isFormValid()} onClick={onClickUpdate}>
                Update
              </Button>
              <Button type="submit" variant="contained" disabled={!isFormValid()} onClick={onClickDelete}>
                Delete
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
