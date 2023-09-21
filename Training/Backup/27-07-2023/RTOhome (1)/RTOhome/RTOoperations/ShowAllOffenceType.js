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

const offenceTypeDetails = () => {
    return axios.get("http://localhost:8094/allOffenceTypes")
        .then((response) => response.data)
}

// const rows = [];

// offenceTypeDetails().then((resp) => {
//     rows=resp
//     console.log(resp);
//   }).catch((error) => {
//     console.log(error);
//   })

export default function ShowAllOffenceType() {

    const [rows, setRows] = useState([]);

    useEffect(() => {
        // Fetch offence details when the component mounts
        offenceTypeDetails()
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
                            <TableCell style={{ fontWeight: 'bold' }}>OFFENCE ID</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">OFFENCE TYPE</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">PENALTY</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">VEHICLE TYPE</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {rows.map((row) => (
                            <TableRow
                                key={row.offenceId}
                                sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                            >
                                <TableCell component="th" scope="row">
                                    {row.offenceId}
                                </TableCell>
                                {/* <TableCell align="left">{row.ownerId}</TableCell> */}
                                <TableCell align="left">{row.offenceType}</TableCell>
                                <TableCell align="left">{row.penalty}</TableCell>
                                <TableCell align="left">{row.vehicleType}</TableCell>

                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        </React.Fragment>
    );
}