import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import Stack from '@mui/material/Stack';

export default function AddVehicle() {
  

  return (
    <Container component="main" maxWidth="md">
      <Box boxShadow={'5px 5px 10px grey'} sx={{margin: 8, display: 'flex', flexDirection: 'column', alignItems: 'center',}}>

        <Typography component="h1" variant="h5" mt={3}>Add Vehicle Details</Typography>
        <Box component="form" sx={{ m: 3 }}>
          <Grid container spacing={2}>
            <Grid item xs={12} sm={6}>
              <TextField name="vehicleType" required fullWidth id="vehicleType" label="Vehicle Type" autoFocus/>
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="vehicleName" label="Vehicle Name"/>
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="modelNumber" label="Model Number"/>
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="vehicleColor" label="Vehicle Color"/>
            </Grid>

            <Grid item xs={6}>
              <TextField required fullWidth id="engineNumber" label="Engine Number"/>
            </Grid>

            <Grid item xs={6}>
              <TextField required fullWidth id="chasisNumber" label="Chasis Number"/>
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="manufacturerName" label="Manufacturer Name"/>
            </Grid>

            
            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="dateOfManufacture" type='date' helperText="Date of Manufacture"/>
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="cubicCapacity" label="Cubic Capacity"/>
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="fuelUsed" label="Fuel Used"/>
            </Grid>
          </Grid>
          <Stack spacing={2} direction="row" justifyContent='center' alignItems='center'>
          <Button
            type="reset"
            variant="contained"
            sx={{ mt: 2, mb: 2, mr: 4 }}
          >
            Reset
          </Button>
          <Button
            type="submit"
            variant="contained"
            sx={{ mt: 3, mb: 2, ml: 4 }}
          >
            Add Owner
          </Button>
          </Stack>

        </Box>
      </Box>

    </Container>
  );
}