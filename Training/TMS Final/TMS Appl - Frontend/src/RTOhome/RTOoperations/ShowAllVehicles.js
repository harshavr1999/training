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

// function createData(vehicleNumber, vehicleType, vehicleName, modelNumber, vehicleColor, engineNumber, chasisNumber, manufacturerName, dateOfManufacture, cubicCapacity, fuelUsed) {
//     return { vehicleNumber, vehicleType, vehicleName, modelNumber, vehicleColor, engineNumber, chasisNumber, manufacturerName, dateOfManufacture, cubicCapacity, fuelUsed };
// }

const vehicleDetails = () => {
    return axios.get("http://localhost:8091/vehicles/allVehicles")
        .then((response) => response.data)
}

// const rows = [
//     createData('AP39D3392', 'Car', 'Toyota Camry', '1234', 'Blue', 'ABC123', 'XYZ789', 'Toyota', '2022-01-01', '2000', 'Petrol'),
//     createData('KA32M2977', 'Car', 'Toyota Camry', '1234', 'Blue', 'ABC123', 'XYZ789', 'Toyota', '2022-01-01', '2000', 'Petrol'),
//     createData('MH15N3920', 'Bike', 'Toyota Camry', '1234', 'Red', 'ABC123', 'XYZ789', 'Toyota', '2022-01-01', '2000', 'Petrol'),
//     createData('TN12A5506', 'Bike', 'Toyota Camry', '1234', 'White', 'ABC123', 'XYZ789', 'Toyota', '2022-01-01', '2000', 'Petrol'),
//     createData('AP39D3392', 'Car', 'Toyota Camry', '1234', 'Blue', 'ABC123', 'XYZ789', 'Toyota', '2022-01-01', '2000', 'Petrol'),
//     createData('AP39D3392', 'Car', 'Toyota Camry', '1234', 'Blue', 'ABC123', 'XYZ789', 'Toyota', '2022-01-01', '2000', 'Petrol'),

// ];

// vehicleDetails().then((resp) => {
//     rows=resp
//     console.log(resp);
//   }).catch((error) => {
//     console.log(error);
//   })

export default function ShowAllVehicles() {

    const [rows, setRows] = useState([]);

    useEffect(() => {
        // Fetch vehicle details when the component mounts
        vehicleDetails()
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
                            <TableCell style={{ fontWeight: 'bold' }}>Vehicle Id</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Vehicle Type</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Vehicle Name</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Model Number</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Vehicle Color</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Engine Number</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Number Of Cylinders</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Manufacturer Name</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Date of Manufacture</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Cubic Capacity</TableCell>
                            <TableCell style={{ fontWeight: 'bold' }} align="left">Fuel Used</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {rows.map((row) => (
                            <TableRow
                                key={row.vehicleId}
                                sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                            >
                                <TableCell component="th" scope="row">
                                    {row.vehicleId}
                                </TableCell>
                                <TableCell align="left">{row.vehicleType}</TableCell>
                                <TableCell align="left">{row.vehicleName}</TableCell>
                                <TableCell align="left">{row.modelNumber}</TableCell>
                                <TableCell align="left">{row.vehicleColor}</TableCell>
                                <TableCell align="left">{row.engineNumber}</TableCell>
                                <TableCell align="left">{row.noOfCylinders}</TableCell>
                                <TableCell align="left">{row.manufacturerName}</TableCell>
                                <TableCell align="left">{row.dateOfManufacture}</TableCell>
                                <TableCell align="left">{row.cubicCapacity}</TableCell>
                                <TableCell align="left">{row.fuelUsed}</TableCell>
                            </TableRow>
                        ))}
                    </TableBody>
                </Table>
            </TableContainer>
        </React.Fragment>
    );
}