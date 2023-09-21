import * as React from 'react';
import Box from '@mui/material/Box';
import { Button, Grid, TextField } from '@mui/material';

export default function SearchVehicleNumber() {
  return (
    <Box
      sx={{
        // width: 300,
        // height: 300,
        // '&:hover': {
        //   backgroundColor: 'primary.main',
        //   opacity: [0.9, 0.8, 0.7],
        // },
      }}
    >
        <Grid container spacing={2} >
          <Grid item xs={3} ></Grid>
            <Grid item xs={6} >
              Vehicle Number * <TextField
                name="vehicleNumber"
                required 
                
                id="vehicleNumber"
                label=""
                autoFocus
                sx={{boxShadow:3, width:300}}
              />
            </Grid>
            <Grid item xs={5} ></Grid>
            <Grid item xs={4} >
            <Button
            type="submit"
            variant="contained"
            sx={{ mt: 3, mb: 2, mr: 4, backgroundColor:'darkred',boxShadow:3 } }
            >
            Search
          </Button>
            </Grid>
            </Grid>
    </Box>
  );
}


