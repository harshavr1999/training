import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import Stack from '@mui/material/Stack';

export default function VehicleRegistration() {
  

  return (
    <Container component="main" maxWidth="md">
      <Box boxShadow={'5px 5px 10px grey'} sx={{margin: 8, display: 'flex', flexDirection: 'column', alignItems: 'center',}}>

        <Typography component="h1" variant="h5" mt={3}>Vehicle Registration</Typography>
        <Box component="form" sx={{ m: 3 }}>
          <Grid container spacing={2}>
            <Grid item xs={6} sm={8}>
              <TextField name="VehicleNumber" required fullWidth id="vehicleNumber" label="Vehicle Number" autoFocus/>
            </Grid>

            <Grid item xs={6}>
              <TextField required fullWidth id="vehicleId" label="Vehicle ID"/>
            </Grid>
            <Grid item xs={6}>
            <Button variant="contained" type='button' sx={{ mt: 1, mb: 1, ml: 2 }}>Show Details</Button>
            </Grid>

            <Grid item xs={6}>
              <TextField required fullWidth id="OwnerId" label="Owner ID"/>
            </Grid>
            <Grid item xs={6}>
            <Button variant="contained" type='button' sx={{ mt: 1, mb: 1, ml: 2 }}>Show Details</Button>
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="distributerName" label="Manufacturer Name"/>
            </Grid>

            
            <Grid item xs={12} sm={6}>
              <TextField required fullWidth id="dateOfManufacture" type='date' helperText="Date of Manufacture"/>
            </Grid>

          </Grid>
          <Stack spacing={2} direction="row" justifyContent='center' alignItems='center'>
          <Button type="reset" variant="contained" sx={{ mt: 2, mb: 2, mr: 4 }}>
            Reset
          </Button>
          <Button
            type="submit"
            variant="contained"
            sx={{ mt: 1, mb: 2, ml: 4 }}
          >
            Add Registration
          </Button>
          </Stack>

        </Box>
      </Box>

    </Container>
  );
}