import * as React from 'react';
import { Button, TextField, Grid, Box, Typography, Container, Snackbar, Alert, MenuItem, Select, FormLabel } from '@mui/material';
import Stack from '@mui/material/Stack';
import Navbar from './Navbar';
import axios from 'axios';
import { useState, useEffect } from 'react';

const updateOffenceType = (offence) => {
  return axios.put("http://localhost:8094/update-offence", offence, { headers: { "Content-Type": "application/json", "Accept": "application/json", } }).
    then((response) => response.data).catch((error) => {
      console.log(error);
      throw error;
    })
}

const offenceTypeIds = () => {
  return axios.get("http://localhost:8094/allOffenceTypeIds")
    .then((response) => response.data)
}




export default function ModifyOffenceType() {
  const [vehicleType, setVehicleType] = React.useState('');
  const [offenceId, setOffenceId] = React.useState('');
  const [alertMessage, setAlertMessage] = React.useState('');
  const [isFormValid, setIsFormValid] = React.useState(false);
  const [disableField, setDisableField] = React.useState(true);
  const [updatedAlertOpen, setUpdatedAlertOpen] = React.useState(false);
  const [noChangesAlertOpen, setNoChangesAlertOpen] = React.useState(false);

  const handleChange = (event) => {
    setVehicleType(event.target.value);
  };

  const [offenceDataList, setOffenceDataList] = useState([]);

  useEffect(() => {
    // Fetch owner details when the component mounts
    offenceTypeIds()
      .then((resp) => {
        setOffenceDataList(resp);
        console.log(resp);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  const offenceIdhandleChange = (event) => {
    const selectedOffenceId = event.target.value;
    setOffenceId(selectedOffenceId);

    if (selectedOffenceId) {
      // Call the backend endpoint to fetch offence details
      axios.get(`http://localhost:8094/findOffenceById/${selectedOffenceId}`)
        .then((response) => {
          const { offenceType, penalty, vehicleType } = response.data;
          setData({
            offenceType,
            penalty,
          });
          setVehicleType(vehicleType);
          setDisableField(false);
        })
        .catch((error) => {
          console.log("Error fetching offence details:", error);
          // Handle error, e.g., display a message to the user
        });
    } else {
      // setData({
      //   offenceType: '',
      //   penalty: '',
      // });
      // setVehicleType('');
      setDisableField(true);
    }
  };


  // const offenceIdhandleChange = (event) => {
  //   const selectedOffenceId = event.target.value;
  //   setOffenceId(selectedOffenceId);

  //   if (selectedOffenceId) {
  //     const offenceData = getOffenceData(selectedOffenceId); // Replace this with your logic to fetch offence data based on the ID
  //     if (offenceData) {
  //       const { offenceType, penalty, vehicleType } = offenceData;
  //       setData({
  //         offenceType,
  //         penalty,
  //       });
  //       setVehicleType(vehicleType);
  //       setDisableField(false);
  //     }
  //   } else {
  //     setData({
  //       offenceType: '',
  //       penalty: '',
  //     });
  //     setVehicleType('');
  //     setDisableField(true);
  //   }
  // };

  const [data, setData] = React.useState({
    offenceType: '',
    penalty: '',
  });

  const { offenceType, penalty } = data;

  const onChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };

  // Form Validating
  React.useEffect(() => {
    setIsFormValid(offenceType !== '' && penalty !== '' && vehicleType !== '');
  }, [offenceType, penalty, vehicleType]);

  const onUpdateClickHandler = () => {
    if (offenceType === data.offenceType && penalty === data.penalty && vehicleType === data.vehicleType) {
      setNoChangesAlertOpen(true);
    } else if (!isFormValid) {
      // Check if any field is empty
      alert('Please fill in all fields before updating.');
    } else {

      const offence = { offenceId: offenceId, offenceType: offenceType, penalty: penalty, vehicleType: vehicleType }
      updateOffenceType(offence).then((resp) => {
        console.log(resp);
      }).catch((error) => {
        console.log(error);
      })
      setAlertMessage(`${offenceId} details updated successfully`);
      console.log('Successfully updated the ' + offenceId);
      setUpdatedAlertOpen(true);
      resetFields();
    }
  };

  const onDeleteClickHandler = () => {
    if (!isFormValid) {
      // Check if any field is empty
      alert('Please fill in all fields before deleting.');
    } else {


      axios.delete(`http://localhost:8094/delete-offence/${offenceId}`)
        .then((response) => response.data).catch((error) => {
          console.log(error);
          throw error;
        })
      setAlertMessage(`${offenceId} details deleted successfully`);
      console.log('Successfully deleted the ' + offenceId);
      setUpdatedAlertOpen(true);
      resetFields();
    }
  };

  const resetFields = () => {
    setData({
      offenceType: '',
      penalty: '',
    });
    setOffenceId('');
    setVehicleType('');
    setDisableField(true);
  };

  const handleUpdatedAlertClose = () => {
    setUpdatedAlertOpen(false);
  };

  const handleNoChangesAlertClose = () => {
    setNoChangesAlertOpen(false);
  };

  return (
    <React.Fragment>
      <Navbar></Navbar>
      <Container component="main" maxWidth="md">

        <Box boxShadow={'5px 5px 10px grey'} sx={{ margin: 8, display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
          <Typography component="h1" variant="h5" mt={3}>
            Modify Offence Type
          </Typography>
          <Box component="form" sx={{ m: 3 }}>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={8}>
                <FormLabel //</Grid>title='Offence ID'
                >
                  <Select
                    name="offenceId"
                    required
                    fullWidth
                    displayEmpty
                    id="offenceId"
                    //label="Offence ID"
                    onChange={offenceIdhandleChange}
                    value={offenceId}
                    autoFocus
                  >
                    <MenuItem value="">Select Offence ID</MenuItem>
                    {offenceDataList.map((offenceData) => (
                      <MenuItem key={offenceData} value={offenceData}>
                        {offenceData}
                      </MenuItem>
                    ))}
                  </Select>
                  {/* <MenuItem value="">Select Offence ID</MenuItem>
                    <MenuItem value="1">1</MenuItem>
                    <MenuItem value="2">2</MenuItem>
                    <MenuItem value="11">11</MenuItem>
                    <MenuItem value="15">15</MenuItem>
                    <MenuItem value="16">16</MenuItem>
                  </Select> */}
                </FormLabel>
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  name="offenceType"
                  required
                  fullWidth
                  id="offenceType"
                  label="Offence Description"
                  onChange={onChange}
                  value={offenceType}
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="penalty"
                  id="penalty"
                  label="Penalty"
                  onChange={onChange}
                  value={penalty}
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <Select
                  id="vehicleType"
                  value={vehicleType}
                  displayEmpty
                  fullWidth
                  onChange={handleChange}
                  disabled={disableField}
                >
                  {/* <MenuItem value="">Select Vehicle Type</MenuItem>
                    {offenceDataList.map((offenceData) => (
                      <MenuItem key={offenceData.id} value={offenceData.id}>
                        {offenceData.id}
                      </MenuItem>
                    ))}
                  </Select> */}
                  <MenuItem value="">Select Vehicle Type</MenuItem>
                  <MenuItem value="All Vehicles">All Vehicles</MenuItem>
                  <MenuItem value="Two Wheeler">Two Wheeler</MenuItem>
                  <MenuItem value="Three Wheeler">Three Wheeler</MenuItem>
                  <MenuItem value="Four Wheeler">Four Wheeler</MenuItem>
                </Select>
              </Grid>
            </Grid>
            <Stack spacing={5} direction="row" justifyContent="center" alignItems="center" sx={{ mt: 2, mb: 2, ml: 2 }}>
              <Button
                type="reset"
                variant="contained"
                // sx={{ mt: 2, mb: 2, mr: 4 }}
                onClick={resetFields}
              >
                Reset
              </Button>
              <Button
                type="submit"
                variant="contained"
                // sx={{ mt: 3, mb: 2, ml: 4 }}
                onClick={onUpdateClickHandler}
                disabled={!offenceId}
              >
                Update
              </Button>
              <Button
                type="button"
                variant="contained"
                // sx={{ mt: 2, mb: 2, ml: 4 }}
                onClick={onDeleteClickHandler}
                disabled={!offenceId}
              >
                Delete
              </Button>
            </Stack>
          </Box>
        </Box>
        <Snackbar open={updatedAlertOpen} autoHideDuration={3000} onClose={handleUpdatedAlertClose} anchorOrigin={{ vertical: 'top', horizontal: 'right' }}>
          <Alert onClose={handleUpdatedAlertClose} severity="success">{alertMessage}</Alert>
        </Snackbar>
        <Snackbar open={noChangesAlertOpen} autoHideDuration={3000} onClose={handleNoChangesAlertClose} anchorOrigin={{ vertical: 'top', horizontal: 'right' }}>
          <Alert onClose={handleNoChangesAlertClose} severity="warning">No changes done.</Alert>
        </Snackbar>
      </Container>
    </React.Fragment>
  );
}

function getOffenceData(offenceId) {
  // Replace this function with your logic to fetch offence data based on the ID
  // Return an object with offenceType, penalty, and vehicleType properties
  // Example:
  if (offenceId === '1') {
    return {
      offenceType: 'No Helmet',
      penalty: '500',
      vehicleType: 'Two Wheeler',
    };
  } else if (offenceId === '2') {
    return {
      offenceType: 'Speeding',
      penalty: '1000',
      vehicleType: 'Four Wheeler',
    };
  } else if (offenceId === '3') {
    return {
      offenceType: 'Wrong Parking',
      penalty: '200',
      vehicleType: 'Two Wheeler',
    };
  } else {
    return null; // Return null or handle invalid offence ID as per your requirements
  }
}
