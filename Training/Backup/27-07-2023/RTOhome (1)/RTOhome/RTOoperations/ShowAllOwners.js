import * as React from 'react';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import Navbar from './Navbar';
import axios from 'axios';
import { useState, useEffect } from 'react';

const ownerDetails = () => {
    return axios.get("http://localhost:8093/owners/allOwners")
        .then((response) => response.data)
}

// var rows = [];

// ownerDetails().then((resp) => {
//     rows=resp
//     console.log(resp);
//   }).catch((error) => {
//     console.log(error);
//   })

export default function ShowAllOwners() {

    const [rows, setRows] = useState([]);

    useEffect(() => {
        // Fetch owner details when the component mounts
        ownerDetails()
            .then((resp) => {
                setRows(resp);
                console.log(resp);
            })
            .catch((error) => {
                console.log(error);
            });
    }, []);

    return (
        <React.Fragment><Navbar></Navbar>
            <TableContainer component={Paper}>
                <Table sx={{ minWidth: 650 }} aria-label="a dense table" >
                    <TableHead>
                        <TableRow>
                            <TableCell style={{ fontWeight: 'bold' }}>Owner Id</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">First Name</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Last Name</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Date of Birth</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Landline Number</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Mobile Number</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Gender</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Permanent Address</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Temporary Address</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Pincode</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Occupation</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Pancard Number</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Aadhar Number</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {rows.map((row) => (
                            <TableRow
                                key={row.ownerId}
                                sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                            >
                                <TableCell component="th" scope="row">
                                    {row.ownerId}
                                </TableCell>
                                {/* <TableCell align="left">{row.ownerId}</TableCell> */}
                                <TableCell align="left">{row.firstName}</TableCell>
                                <TableCell align="left">{row.lastName}</TableCell>
                                <TableCell align="left">{row.dateOfBirth}</TableCell>
                                <TableCell align="left">{row.landlineNo}</TableCell>
                                <TableCell align="left">{row.mobileNo}</TableCell>
                                <TableCell align="left">{row.gender}</TableCell>
                                <TableCell align="left">{row.permAddr}</TableCell>
                                <TableCell align="left">{row.tempAddr}</TableCell>
                                <TableCell align="left">{row.pincode}</TableCell>
                                <TableCell align="left">{row.occupation}</TableCell>
                                <TableCell align="left">{row.pancardNo}</TableCell>
                                <TableCell align="left">{row.aadharNo}</TableCell>
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        </React.Fragment>
    );
}