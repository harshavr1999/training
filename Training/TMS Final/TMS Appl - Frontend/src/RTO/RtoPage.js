import React from "react";
import Cards from "./RTO-Cards";
import Grid from '@mui/material/Unstable_Grid2';
// import Header from "../header";
const RTOPage =()=>
{
    return(
        <Grid item xs={6} md={3} style={{ color: 'white', backgroundColor: '#F5F5F5' }}>
            {/* <Header></Header> */}
            <h1 style={{ color: 'black' }}>Hello, Welcome to RTO Page</h1>
            <Cards></Cards>
        </Grid>
    )
}
export default RTOPage