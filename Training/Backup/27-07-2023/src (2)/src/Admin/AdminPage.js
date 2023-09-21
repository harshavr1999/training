import React from "react";
import Cards from "./Card-Component";
import Grid from '@mui/material/Unstable_Grid2';
import Navbar from '../Navbar';

// import Header from "../Header";
// import {Routes,Route} from "react-router-dom";
const AdminPage =()=>
{
    return(
        <Grid item xs={6} md={3} style={{ color: 'white', backgroundColor: '#F5F5F5' }}>
            {/* <Header></Header> */}
            <Navbar></Navbar>
            <h1 style={{ color: 'black' }}>Hello, Welcome to Admin Page</h1>
            <Cards></Cards>
        </Grid>
    )
}

export default AdminPage;