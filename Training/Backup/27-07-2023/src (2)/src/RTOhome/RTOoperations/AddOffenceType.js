import * as React from 'react';
import { Button, TextField, Grid, Box, Typography, Container, Snackbar, Alert, MenuItem, Select } from '@mui/material';
import Stack from '@mui/material/Stack';
import Navbar from './Navbar';
import axios from 'axios';

const addOffenceType = (offence) => {
  return axios.post("http://localhost:8094/add-offence", offence, { headers: { "Content-Type": "application/json", "Accept": "application/json", } }).
    then((response) => response.data).catch((error) => {
      console.log(error);
      throw error;
    })
}

export default function AddOffenceType() {
  const [vehicleType, setVehicleType] = React.useState('');
  const [isFormValid, setIsFormValid] = React.useState(false);
  const [data, setData] = React.useState({
    offenceType: '',
    penalty: ''
  });
  const [openSnackbar, setOpenSnackbar] = React.useState(false);
  const [alertMessage, setAlertMessage] = React.useState('');
  const { offenceType, penalty } = data;

  const handleChange = (e) => {
    setData({ ...data, [e.target.name]: e.target.value });
  };

  const handleVehicleChange = (event) => {
    setVehicleType(event.target.value);
  };


  const resetForm = () => {
    setData({
      offenceType: '',
      penalty: '',
    });
    setVehicleType('');
  };

  React.useEffect(() => {
    setIsFormValid(offenceType !== '' && penalty !== '' && vehicleType !== '');
  }, [offenceType, penalty, vehicleType]);

  const handleSubmit = (e) => {

    if (isFormValid) {
      const offence = { offenceType: offenceType, penalty: penalty, vehicleType: vehicleType }
      addOffenceType(offence).then((resp) => {
        console.log(resp);
      }).catch((error) => {
        console.log(error);
      })
      setAlertMessage(`${offenceType} added successfully`);
      setOpenSnackbar(true);
      resetForm();
    } else {
      return;
    }
  };

  const handleSnackbarClose = () => {
    setOpenSnackbar(false);
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
            Add Offence Type
          </Typography>
          <Box component="form" sx={{ m: 3 }}>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={6}>
                <TextField
                  name="offenceType"
                  required
                  fullWidth
                  id="offenceType"
                  label="Offence Description"
                  autoFocus
                  onChange={handleChange}
                  value={offenceType}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  name="penalty"
                  id="penalty"
                  label="Penalty"
                  onChange={handleChange}
                  value={penalty}
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <Select
                  id="vehicleType"
                  value={vehicleType}
                  displayEmpty
                  fullWidth
                  onChange={handleVehicleChange}
                >
                  <MenuItem value="">Select Vehicle Type</MenuItem>
                  <MenuItem value={'All Vehicles'}>All Vehicles</MenuItem>
                  <MenuItem value={'Two Wheeler'}>Two Wheeler</MenuItem>
                  <MenuItem value={'Three Wheeler'}>Three Wheeler</MenuItem>
                  <MenuItem value={'Four Wheeler'}>Four Wheeler</MenuItem>
                </Select>
              </Grid>
            </Grid>
            <Stack spacing={2} direction="row" justifyContent="center" alignItems="center">
              <Button
                type="reset"
                variant="contained"
                sx={{ mt: 2, mb: 2, mr: 4 }}
                onClick={resetForm}
              >
                Reset
              </Button>
              <Button
                type="submit"
                variant="contained"
                sx={{ mt: 3, mb: 2, ml: 4 }}
                onClick={handleSubmit}
              >
                Add Offence
              </Button>
            </Stack>
          </Box>
        </Box>
        <Snackbar open={openSnackbar} autoHideDuration={3000} onClose={handleSnackbarClose} anchorOrigin={{ vertical: 'top', horizontal: 'right' }}>
          <Alert onClose={handleSnackbarClose} severity="success">
            {alertMessage}
          </Alert>
        </Snackbar>
      </Container>
    </React.Fragment>
  );
}

