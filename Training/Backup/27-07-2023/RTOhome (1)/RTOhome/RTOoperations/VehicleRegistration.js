import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Container from '@mui/material/Container';
import Stack from '@mui/material/Stack';
import Dialog from '@mui/material/Dialog';
import ListItemText from '@mui/material/ListItemText';
import ListItem from '@mui/material/ListItem';
import List from '@mui/material/List';
import Divider from '@mui/material/Divider';
import AppBar from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import IconButton from '@mui/material/IconButton';
import Typography from '@mui/material/Typography';
import CloseIcon from '@mui/icons-material/Close';
import Slide from '@mui/material/Slide';
import Snackbar from '@mui/material/Snackbar';
import { Alert } from '@mui/material';
import Navbar from './Navbar';
import axios from 'axios';


const regexPattern = /^[A-Z]{2}\d{2}[A-Z]{1,2}\d{4}$/;

const Transition = React.forwardRef(function Transition(props, ref) {
  return <Slide direction="up" ref={ref} {...props} />;
});

const ownerTransition = React.forwardRef(function Transition(props, ref) {
  return <Slide direction="up" ref={ref} {...props} />;
});

const initialState = {
  vehicleNumber: '',
  vId: '',
  ownerId: '',
  distributerName: '',
  dateOfPurchase: '',
};

const addReg = (details) => {
  return axios.post("http://localhost:8092/registration/addRegistration", details, {
    headers: {
      "Content-Type": "application/json",
      "Accept": "application/json",
    }
  })
    .then((response) => response.data)
}

const vehicle = (vehId) => {
  return axios.get(`http://localhost:8091/vehicles/vehicleById/${vehId}`)
    .then((response) => response.data)
}

const owner = (ownerId) => {
  return axios.get(`http://localhost:8093/owners/showOwner/${ownerId}`)
    .then((response) => response.data)
}

const vehicleIds = () => {
  return axios.get("http://localhost:8091/vehicles/allVehicleIds")
    .then((response) => response.data)
}

const ownerIds = () => {
  return axios.get("http://localhost:8093/owners/allOwnerIds")
    .then((response) => response.data)
}

var vehicleDetails = [];
var ownerDetails = [];
var vehicleIdArray = [];
var ownerIdArray = [];

export default function VehicleRegistration() {
  const [vehicleNumber, setVehicleNumber] = React.useState('');
  const [open, setOpen] = React.useState(false);
  const [open2, setOpen2] = React.useState(false);
  const [data, setData] = React.useState(initialState);
  const [openSnackbar, setOpenSnackbar] = React.useState(false);
  const [alertMessage, setAlertMessage] = React.useState('');
  const [error, setError] = React.useState(false);
  var [disableField, setDisableField] = React.useState(true);
  const [vId, setVId] = React.useState('');
  const [ownerId, setOwnerId] = React.useState('');

  const vehicleIdHandleChange = (event) => {
    const { value } = event.target;
    setVId(value);
    vehicleIds().then((resp) => {
      vehicleIdArray = resp;
      console.log(vehicleIdArray);
    }).catch((error) => {
      console.log(error);
    })
  }

  const ownerIdHandleChange = (event) => {
    const { value } = event.target;
    setOwnerId(value);
    ownerIds().then((resp) => {
      ownerIdArray = resp;
      console.log(ownerIdArray);
    }).catch((error) => {
      console.log(error);
    })
  }

  const handleClickOpen = () => {

    const isVIdValid = vehicleIdArray.some((item) => item == vId);

    if (isVIdValid) {
      vehicle(vId).then((resp) => {
        vehicleDetails = [
          {
            vehicleLabel: "Vehicle Type",
            vehicleValue: resp.vehicleType
          },
          {
            vehicleLabel: "Vehicle Name",
            vehicleValue: resp.vehicleName
          },
          {
            vehicleLabel: "Model Number",
            vehicleValue: resp.modelNumber
          },
          {
            vehicleLabel: "Vehicle Color",
            vehicleValue: resp.vehicleColor
          },
          {
            vehicleLabel: "Engine Number",
            vehicleValue: resp.engineNumber
          },
          {
            vehicleLabel: "No Of Cylinders",
            vehicleValue: resp.noOfCylinders
          },
          {
            vehicleLabel: "Manufacture Name",
            vehicleValue: resp.manufacturerName
          },
          {
            vehicleLabel: "Date of Manufacture",
            vehicleValue: resp.dateOfManufacture
          },
          {
            vehicleLabel: "Cubic Capacity",
            vehicleValue: resp.cubicCapacity
          },
          {
            vehicleLabel: "Fuel Used",
            vehicleValue: resp.fuelUsed
          }
        ];
        setOpen(true);
      }).catch((error) => {
        console.log(error);
      });
    } else {
      alert("Vehicle Id Not Found")
    }

  };

  const handleClose = () => {
    setOpen(false);
  };

  const ownerHandleClickOpen = () => {
    const isOwnerIdValid = ownerIdArray.some((item) => item == ownerId);

    if (isOwnerIdValid) {
      owner(ownerId).then((resp) => {
        ownerDetails = [
          {
            ownerLabel: "Owner Id",
            ownerValue: resp.ownerId
          },
          {
            ownerLabel: "First Name",
            ownerValue: resp.firstName
          },
          {
            ownerLabel: "Last Name",
            ownerValue: resp.lastName
          },
          {
            ownerLabel: "Date of Birth",
            ownerValue: resp.dateOfBirth
          },
          {
            ownerLabel: "Landline Number",
            ownerValue: resp.landlineNo
          },
          {
            ownerLabel: "Mobile Number",
            ownerValue: resp.mobileNo
          },
          {
            ownerLabel: "Gender",
            ownerValue: resp.gender
          },
          {
            ownerLabel: "Temporary Addrss",
            ownerValue: resp.tempAddr
          },
          {
            ownerLabel: "Permanent Address",
            ownerValue: resp.permAddr
          },
          {
            ownerLabel: "Pincode",
            ownerValue: resp.pincode
          },
          {
            ownerLabel: "Occupation",
            ownerValue: resp.occupation
          },
          {
            ownerLabel: "Pancard Number",
            ownerValue: resp.pancardNo
          },
          {
            ownerLabel: "Aadhar Number",
            ownerValue: resp.aadharNo
          }
        ];
        setOpen2(true);
      }).catch((error) => {
        console.log(error);
      });
    } else {
      alert("Owner Id Not Found")
    }
  };


  const ownerHandleClose = () => {
    setOpen2(false);
  };

  const { distributerName, dateOfPurchase } = data;

  const onChange = e => {
    e.preventDefault();
    setData({ ...data, [e.target.name]: [e.target.value] })
  }

  const onSubmitClickHandler = e => {
    // Validate the required fields
    if (!isFormValid()) {
      return; // Exit the function if any required field is empty
    }
    const regDetails = { vehicleNumber: vehicleNumber, vehicleId: vId, ownerId: ownerId, distributerName: distributerName[0], dateOfPurchase: dateOfPurchase[0] };
    console.log(regDetails);
    addReg(regDetails).then((resp) => {
      console.log(resp);
    }).catch((error) => {
      console.log(error);
    })
    setAlertMessage(`${vehicleNumber} registered successfully`);
    setOpenSnackbar(true);
    setData(initialState);
    setVId('');
    setOwnerId(''); // Reset the form
    setVehicleNumber('');

  }

  const handleCloseSnackbar = () => {
    setOpenSnackbar(false);
  };

  const vehicleNumberHandleChange = (event) => {
    const { value } = event.target;
    setVehicleNumber(value);
    setError(!validateVehicleNumber(value));
  };

  const validateVehicleNumber = (value) => {
    return regexPattern.test(value);
  };

  const isFormValid = () => {
    // Check if all required fields are filled
    return (
      vehicleNumber !== '' &&
      vId !== '' &&
      ownerId !== '' &&
      distributerName !== '' &&
      dateOfPurchase !== ''
    );
  };

  // Function to handle validation and set max date for date picker
  const handleDateChange = (event) => {
    const { name, value } = event.target;

    // Limit the date picker to past dates
    const currentDate = new Date().toISOString().split('T')[0];
    if (name === 'dateOfPurchase' && value > currentDate) {
      setData({ ...data, dateOfPurchase: currentDate });
    } else {
      setData({ ...data, [name]: value });
    }
  };



  return (
    <React.Fragment>
      <Navbar></Navbar>
      <Container component="main" maxWidth="md">
        <Box boxShadow={'5px 5px 10px grey'} sx={{ margin: 8, display: 'flex', flexDirection: 'column', alignItems: 'center', }}>

          <Typography component="h1" variant="h5" mt={3}>Vehicle Registration</Typography>
          <Box component="form" sx={{ m: 3 }}>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={8}>
                <TextField name="vehicleNumber" required fullWidth id="vehicleNumber" label="Vehicle Number" autoFocus value={vehicleNumber} onChange={vehicleNumberHandleChange} error={error}
                  helperText={error ? 'AB12AB1234' : ''} />
              </Grid>

              <Grid item xs={6}>
                <TextField required fullWidth name="vId" id="vId" label="Vehicle ID" onChange={vehicleIdHandleChange} value={vId} />
              </Grid>
              <Grid item xs={6}>
                <Button variant="contained" type='button' sx={{ mt: 1, mb: 1, ml: 2 }} onClick={handleClickOpen}>Show Details</Button>
              </Grid>
              <Dialog
                fullScreen
                open={open}
                onClose={handleClose}
                TransitionComponent={Transition}
              >
                <AppBar sx={{ position: 'relative' }}>
                  <Toolbar>
                    <IconButton
                      edge="start"
                      color="inherit"
                      onClick={handleClose}
                      aria-label="close"
                    >
                      <CloseIcon />
                    </IconButton>
                    <Typography sx={{ ml: 2, flex: 1 }} variant="h6" component="div">
                      Vehicle Details
                    </Typography>
                    <Button autoFocus color="inherit" onClick={handleClose}>
                      Done
                    </Button>
                  </Toolbar>
                </AppBar>
                {vehicleDetails.map((vehicleDetail, index) => (
                  <List key={index}>
                    <ListItem >
                      <ListItemText primary={vehicleDetail.vehicleLabel} secondary={vehicleDetail.vehicleValue} />
                    </ListItem>
                    <Divider />
                  </List>
                ))}

              </Dialog>

              <Grid item xs={6}>
                <TextField required fullWidth name="ownerId" id="ownerId" label="Owner ID" onChange={ownerIdHandleChange} value={ownerId} />
              </Grid>
              <Grid item xs={6}>
                <Button variant="contained" type='button' sx={{ mt: 1, mb: 1, ml: 2 }} onClick={ownerHandleClickOpen}>Show Details</Button>
              </Grid>
              <Dialog
                fullScreen
                open={open2}
                onClose={ownerHandleClose}
                TransitionComponent={ownerTransition}
              >
                <AppBar sx={{ position: 'relative' }}>
                  <Toolbar>
                    <IconButton
                      edge="start"
                      color="inherit"
                      onClick={ownerHandleClose}
                      aria-label="close"
                    >
                      <CloseIcon />
                    </IconButton>
                    <Typography sx={{ ml: 2, flex: 1 }} variant="h6" component="div">
                      Owner Details
                    </Typography>
                    <Button autoFocus color="inherit" onClick={ownerHandleClose}>
                      Done
                    </Button>
                  </Toolbar>
                </AppBar>
                {ownerDetails.map((details, index) => (
                  <List key={index}>
                    <ListItem >
                      <ListItemText primary={details.ownerLabel} secondary={details.ownerValue} />
                    </ListItem>
                    <Divider />
                  </List>
                ))}

              </Dialog>

              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="distributerName" id="distributerName" label="Manufacturer Name" onChange={onChange} value={distributerName} />
              </Grid>


              <Grid item xs={12} sm={6}>
                <TextField required fullWidth name="dateOfPurchase" id="dateOfPurchase" type='date' helperText="Date of Purchase" onChange={handleDateChange} max={new Date().toISOString().split("T")[0]} value={dateOfPurchase} />
              </Grid>

            </Grid>
            <Stack spacing={2} direction="row" justifyContent='center' alignItems='center'>
              <Button type="reset" variant="contained" sx={{ mt: 2, mb: 2, mr: 4 }} onClick={() => setData(initialState)}>
                Reset
              </Button>
              <Button
                type="submit"
                variant="contained"
                sx={{ mt: 1, mb: 2, ml: 4 }}
                onClick={onSubmitClickHandler}
              >
                Add Registration
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