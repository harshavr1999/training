import * as React from 'react';
import { Box } from '@mui/material';
import Grid from '@mui/material/Grid';
// import offencesymbol from './offencesymbol.png'
import CardComp from './CardComp';
// import clearoffencesymbol from './clearoffencesymbol.png'
import Header from '../Header';
import Navbar from '../Navbar';


export default function CopOperationsStack() {
  return (
    <Box sx={{ width: '100%' }}>
      <Navbar></Navbar>
      <Header>COP HOMEPAGE</Header>
    <Grid container rowSpacing={1} columnSpacing={{ xs: 1, sm: 2, md: 3 }} 
      alignItems="center"
      justifyContent="center"
      sx={{ minHeight: '100vh' }}>
    <Grid item xs={'auto'}>
    <CardComp title="Add Offence " image='offencesymbol.png' details='By Clicking Here You Can Add The Offence Against A Vehicle' navigate='/addoffences' ></CardComp>
    </Grid>
    <Grid item xs={'auto'}>
    <CardComp title="Clear Offence" navigate='/clearoffences' details='By Clicking Here You Can Clear The Offence Against A Vehicle' image='clearoffencesymbol.png'></CardComp>
    </Grid>
    </Grid>
    </Box>
  );

}