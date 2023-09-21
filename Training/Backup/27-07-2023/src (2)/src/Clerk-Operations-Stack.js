import * as React from 'react';

import CardComp from './CardComp';
import bookOffence from './images/bookOffence.png';
import clearOffence from './images/clearOffence.png';
import reportGeneration from './images/reportGeneration.png';
import Grid from '@mui/material/Grid';
import { Box } from '@mui/material';
import Navbar from './Navbar';
import Header from './Header';

const imposeDetail="Add an new offence on the vehicle when ever the driver breakes the traffic rules."; 
const clearDetail="Fetch the due offence(s) and clear it as per the payment by vehicle owner.";
const reportDetail="Generate an report based upon the vehicle-number, vehicle-type, date-range, offence-type.."
export default function ClerkOperationsStack(){
  return (
    <div>
      <Navbar></Navbar>
      <Header>CLERK HOME PAGE</Header>
    <Box sx={{ width: '100%' }}>
    <Grid container rowSpacing={1} columnSpacing={{ xs: 1, sm: 2, md: 3 }} 
  alignItems="center"
  justifyContent="center"
  sx={{ minHeight: '100vh' }}>
      <Grid item xs={'auto'} lg={'auto'}>
      <CardComp title="Book-Offence" cardName="IMPOSE OFFENCE" details={imposeDetail} image={bookOffence}  hrf='/addOffences'></CardComp>
      </Grid>
      <Grid item xs={'auto'} lg={'auto'}>
      <CardComp title="Clear-Offence" cardName="CLEAR OFFENCE" details={clearDetail} image={clearOffence} hrf='/clearOffences'></CardComp>
      </Grid>
      <Grid item xs={'auto'} lg={'auto'}>
      <CardComp title="Generate-Report" cardName="GENERATE REPORT" details={reportDetail} image={reportGeneration} hrf='/generateReport'></CardComp>
      </Grid>
    </Grid>
  </Box>
    </div>
  );
}