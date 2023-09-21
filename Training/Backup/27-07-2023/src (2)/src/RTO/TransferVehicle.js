
import * as React from "react";
import Button from "@mui/material/Button";
import TextField from "@mui/material/TextField";
import Grid from "@mui/material/Grid";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";
import Container from "@mui/material/Container";
import { Stack } from "@mui/material";
import axios from 'axios';
import Snackbar from '@mui/material/Snackbar';
import MuiAlert from '@mui/material/Alert';
import Header from "../Header";
import Navbar from "../RTOhome/RTOoperations/Navbar";
export default function TransferVehicle() {

  // Vehicle Details
  const [vehicleNumField, setVehicelNumField] = React.useState('');
  const [vehicleIdField1, setVehicleIdField] = React.useState('');
  const [VehicleTypeField, setVehicleType] = React.useState('');
  const [ModelNumberField, setModelNumber] = React.useState('');
  const [vehicleColourField, setVehicleColourField] = React.useState('');
  const [dateField, setDateField] = React.useState('');
  const [ManufactureField, setManufactureField] = React.useState('');

  //Current Owner Details
  const [currentOwnerId, setCurrentOwnerId] = React.useState('');
  const [currentOwnerFName, setCurrentOwnerFName] = React.useState('');
  const [currentOwnerLName, setCurrentOwnerLName] = React.useState('');
  const [currentOwnerTempAddress, setCurrentOwnertempAddress] = React.useState('');
  const [currentOwnerPermAddress, setCurrentOwnerPermAddress] = React.useState('');
  const [currentOwnerMobileNumber, setCurrentOwnerMobileNumber] = React.useState('');

  //New Owner Details
  const [newOwnerId, setNewOwnerId] = React.useState('');
  const [newOwnerFName, setNewOwnerFName] = React.useState('');
  const [newOwnerLName, setNewOwnerLname] = React.useState('');
  const [newOwnerTempAddress, setNewOwnerTempAddress] = React.useState('');
  const [newOwnerPermAddress, setnewOwnerpermAddress] = React.useState('');
  const [newOwnerMobileNum, setnewOwnerMobileNumber] = React.useState('');
  const [newOwnerPancard, setnewOwnerPanCard] = React.useState('');
  var [disableField, setDisabledField] = React.useState(true);
  const [isSnackbarOpen, setIsSnackbarOpen] = React.useState(false);

  const [SnackbarMessage, setSnackbarMessage] = React.useState('')

  const handleSnackbarClose = () => {
    setIsSnackbarOpen(false);
    window.location.reload(true)

  };
  const handleDisable = (event) => {
    setDisabledField(event.target.disabled);
  };
  console.log(handleDisable);
  const handleVehicleNumber = (event) => {
    setVehicelNumField(event.target.value);
  };
  const handleOwnerPanCard = (event) => {
    setnewOwnerPanCard(event.target.value);
  }

  const handleVehicleSearch = async (event) => {

    // Call Axios  API call to fectch the TransferDetails object data 
    //using http:localhost:8095\transfervehicle\VehicleId;
    if (vehicleNumField === "") {
      alert("Please enter vehicle Number")
      window.location.reload(true)
    }
    try {
      var response = await axios(
        {
          method: "GET",
          url: "http://localhost:8095/transfervehicle/" + vehicleNumField,
          headers: { "content-type": "application/json" },

        })
    }
    catch (e) {
      console.log(e);
    }
    if (!response) {
      alert("Server not started")
    }
    else if (response.status === 204) {
      window.location.reload(true)
      alert("Invalid vehicleNumber")

    }
    else if (response.status === 205) {
      window.location.reload(true)
      alert("Please clear the Pending challens to proceed")

    }
    else if (response.status === 200) {
      setDisabledField(false);
      // disableField = false;
      setVehicleIdField(response.data.vehicleId)
      setVehicleType(response.data.vehicleType)
      setModelNumber(response.data.modelNo)
      setVehicleColourField(response.data.vehicleColor)
      setDateField(response.data.dateOfManufacture)
      setManufactureField(response.data.manufactureName)
      setCurrentOwnerId(response.data.ownerId)
      setCurrentOwnerFName(response.data.firstName)
      setCurrentOwnerLName(response.data.lastName)
      setCurrentOwnertempAddress(response.data.tempAddress)
      setCurrentOwnerPermAddress(response.data.permAddress)
      setCurrentOwnerMobileNumber(response.data.mobileNumber)
    }



    // if(disableField){
    //   event.preventDefault();
    //   alert('Invalid Number');
    // }
  }

  const handleOwnerSearch = async (event) => {
    // Call Axios  API call to fectch the Owner Details object data 
    //using http:localhost:8095\transfervehicle\ownerpancard;
    try {
      console.log(newOwnerPancard);
      var OwnerResponse = await axios(
        {
          method: "GET",
          url: "http://localhost:8095/transfervehicle/owner/" + newOwnerPancard,
          headers: { "content-type": "application/json" }
        })
    }
    catch (e) {
      console.log(e);
    }
    if (OwnerResponse.status === 204) {
      alert("Invalid Owner")
      setNewOwnerId("")
      setNewOwnerFName("")
      setNewOwnerLname('')
      setNewOwnerTempAddress("")
      setnewOwnerpermAddress('')
      setnewOwnerMobileNumber('');
    }
    else if (OwnerResponse.status === 200) {
      setDisabledField(false);
      disableField = false;
      setNewOwnerId(OwnerResponse.data.ownerId)
      setNewOwnerFName(OwnerResponse.data.firstName)
      setNewOwnerLname(OwnerResponse.data.lastName)
      setNewOwnerTempAddress(OwnerResponse.data.tempAddr)
      setnewOwnerpermAddress(OwnerResponse.data.permAddr)
      setnewOwnerMobileNumber(OwnerResponse.data.mobileNo);

    }

  }
  const handleNewOwner = (event) => {
    //Navigate User to  Add Owner Page
  }

  const TransferDetails = async (event) => {
    console.log(currentOwnerId)
    if (currentOwnerId === newOwnerId) {
      alert("Current Owner is same as New owner")
      setnewOwnerPanCard('')
      setNewOwnerId("")
      setNewOwnerFName("")
      setNewOwnerLname('')
      setNewOwnerTempAddress("")
      setnewOwnerpermAddress('')
      setnewOwnerMobileNumber('');
    }

    else if (newOwnerId.length < 0) {
      alert("Plese enter new Owner Id")
    }
    else {
      console.log(newOwnerId)
      try {
        var saveResponse = await axios(
          {
            method: "GET",
            url: "http://localhost:8095/transfervehicle/owner/savedetails/" + newOwnerId,
            headers: { "content-type": "application/json" },

          })
      }
      catch (e) {
        console.log(e);
      }
      console.log(saveResponse)
      if (saveResponse.status === 200) {
        setSnackbarMessage('Vehicle Transfered  successfully');
        setIsSnackbarOpen(true);

      }

    }
  }


  return (
    <React.Fragment>
      <Navbar></Navbar>
      <Container component="main" maxWidth="lg" sx={{ display: "flex", alignItems: "center", justifyContent: "space-around" }}>
        <Box
          sx={{ marginTop: 8, display: "flex", flexDirection: "column", alignItems: "center", boxShadow: 4, p: 7 }}
          component='form'>
          <Typography component="h1" variant="h5">
            Transfer Vehicle
          </Typography>
          <Box component="form" sx={{ mt: 3 }}>
            <Grid item xs={10} >
              <Stack spacing={2} direction="row" alignItems="center" justifyContent="space-around" sx={{ display: 'flex', marginBottom: 3 }}>
                <TextField type="text" variant="outlined"
                  color="secondary"
                  label="vehicle Number"
                  value={vehicleNumField}
                  onChange={handleVehicleNumber}
                  required
                  sx={{ flex: 3 }}
                  autoFocus
                />
                <Button
                  variant="outlined"
                  color="secondary"
                  sx={{ flex: 1 }}
                  onClick={handleVehicleSearch}
                >
                  Search
                </Button>
              </Stack>
            </Grid>
            <Grid
              sx={{
                display: "flex",
                justifyContent: "flex-start",
                marginBottom: 1,
              }}
            >
              <Typography component="h6" variant="h6" >
                Vehicle Details
              </Typography>
            </Grid>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={6}>
                <TextField
                  name="VehicleId"
                  required
                  fullWidth
                  value={vehicleIdField1}
                  onChange={setVehicleIdField}
                  id="VehicleId"
                  label="Vehicle Id"
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="VehicleType"
                  label="Vehicle Type"
                  value={VehicleTypeField}
                  onChange={setVehicleType}
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="VehicleColor"
                  label="Vehicle color"
                  value={vehicleColourField}
                  onChange={setVehicleColourField}
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="ModelNumber"
                  label="ModelNumber"
                  value={ModelNumberField}
                  onChange={setModelNumber}
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="DOM"
                  type="date"
                  helperText="Date of Manufacture"
                  value={dateField}
                  onChange={setDateField}
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="Manufacture"
                  label="Manufacture Name"
                  value={ManufactureField}
                  onChange={setManufactureField}
                  disabled={disableField}
                />
              </Grid>
            </Grid>
            <Grid
              sx={{
                display: "flex",
                justifyContent: "flex-start",
                marginBottom: 1,
                marginTop: 2
              }}
            >
              <Typography component="h6" variant="h6" >
                Current Owner
              </Typography>
            </Grid>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={6}>
                <TextField
                  name="OwnerId"
                  required
                  fullWidth
                  value={currentOwnerId}
                  id="OwnerId"
                  label="Owner Id"
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={currentOwnerFName}
                  id="FirstName"
                  label="First Name"
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={currentOwnerLName}
                  id="LastName"
                  label="Last Name"
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={currentOwnerTempAddress}
                  id="TemporaryAddress"
                  label="Temporary Address"
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={currentOwnerPermAddress}
                  id="Permanent Address"
                  label="Permanent Address"
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={currentOwnerMobileNumber}
                  id="Mobile Number"
                  label="Mobile Number"
                  disabled={disableField}
                />
              </Grid>
            </Grid>


            {/* New Owner Details */}


            <Grid
              sx={{
                display: "flex",
                justifyContent: "flex-start",
                marginBottom: 1,
                marginTop: 2
              }}
            >
              <Typography component="h6" variant="h6" >
                New Owner
              </Typography>
            </Grid>
            <Grid item xs={10} >
              <Stack spacing={2} direction="row" alignItems="center" justifyContent="space-around" sx={{ display: 'flex', marginBottom: 3 }}>
                <TextField type="text" variant="outlined"
                  color="secondary"
                  label="Pan card No"
                  value={newOwnerPancard}
                  onChange={handleOwnerPanCard}
                  disabled={disableField}
                  required
                  sx={{ flex: 3 }}
                />
                <Button
                  variant="outlined"
                  color="secondary"
                  sx={{ flex: 1 }}
                  disabled={disableField}
                  onClick={handleOwnerSearch}
                >
                  Search
                </Button>
                <Button
                  variant="outlined"
                  color="secondary"
                  sx={{ flex: 1 }}
                  onClick={handleNewOwner}
                  disabled={disableField}
                >
                  Add New Owner
                </Button>
              </Stack>
            </Grid>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={6}>
                <TextField
                  name="OwnerId"
                  required
                  fullWidth
                  value={newOwnerId}
                  id="OwnerId"
                  label="Owner Id"
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={newOwnerFName}
                  id="FirstName"
                  label="First Name"
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="LastName"
                  value={newOwnerLName}
                  label="Last Name"
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={newOwnerTempAddress}
                  id="TemporaryAddress"
                  label="Temporary Address"
                  disabled={disableField}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="Permanent Address"
                  value={newOwnerPermAddress}
                  label="Permanent Address"
                  disabled={disableField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  value={newOwnerMobileNum}
                  id="Mobile Number"
                  label="Mobile Number"
                  disabled={disableField}
                />
              </Grid>
            </Grid>
            <Button type="reset" variant="contained" sx={{ mt: 3, mb: 2, mr: 4 }} onClick={() => { window.location.reload(true) }}>
              Reset
            </Button>
            <Button
              variant="contained"
              sx={{ mt: 3, mb: 2, ml: 4 }}
              disabled={disableField}
              onClick={TransferDetails}
            >
              Transfer Vehicle
            </Button>
          </Box>
        </Box>
      </Container>
      <Snackbar

        open={isSnackbarOpen}

        autoHideDuration={5000}

        onClose={handleSnackbarClose}

        anchorOrigin={{ vertical: 'top', horizontal: 'right' }}

      >

        <MuiAlert onClose={handleSnackbarClose} severity="success" sx={{ width: '100%' }}>

          {SnackbarMessage}

        </MuiAlert>

      </Snackbar>
    </React.Fragment>
  );
}
