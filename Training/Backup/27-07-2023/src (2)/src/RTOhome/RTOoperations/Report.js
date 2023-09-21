import * as React from 'react';
import PropTypes from 'prop-types';
import Box from '@mui/material/Box';
import Collapse from '@mui/material/Collapse';
import IconButton from '@mui/material/IconButton';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Typography from '@mui/material/Typography';
import Paper from '@mui/material/Paper';
import Grid from '@mui/material/Grid';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import axios from 'axios';

import KeyboardArrowDownIcon from '@mui/icons-material/KeyboardArrowDown';
import KeyboardArrowUpIcon from '@mui/icons-material/KeyboardArrowUp';
import Navbar from './Navbar';

const getvehicleId = (vehicleNum) => {
  return axios.get("http://localhost:8092/registration/vehicleIdByNumber/" + vehicleNum)
    .then((response) => response.data)
}

const vehicleNumbers = () => {
  return axios.get("http://localhost:8092/registration/allVehicleNumbers")
    .then((response) => response.data)
}

const vehicle = (vehId) => {
  return axios.get(`http://localhost:8091/vehicles/vehicleById/${vehId}`)
    .then((response) => response.data)
}

const ownerDetails = (vehicleNumber) => {
  return axios.get(`http://localhost:8093/owners/ownerByVehicleNo/${vehicleNumber}`)
    .then((response) => response.data)
}

var vehicleNumberArray = [];

function createData(vehicleId, vehicleType, vehicleName, modelNumber, vehicleColor, engineNumber, noOfCylinders, manufacturerName, dateOfManufacture, cubicCapacity, fuelUsed, ownerDetails) {
  return {
    vehicleId, vehicleType, vehicleName, modelNumber, vehicleColor, engineNumber, noOfCylinders, manufacturerName, dateOfManufacture, cubicCapacity, fuelUsed,
    ownerDetails
  };
}

function Row(props) {
  const { row } = props;
  const [open, setOpen] = React.useState(false);


  return (
    <>
      <TableRow sx={{ '& > *': { borderBottom: 'unset' } }}>
        <TableCell>
          <Typography variant='subtitle2'>Owner Details</Typography>
          <IconButton
            aria-label="expand row"
            size="small"
            onClick={() => setOpen(!open)}
          >
            {open ? <KeyboardArrowUpIcon /> : <KeyboardArrowDownIcon />}
          </IconButton>
        </TableCell>

        <TableCell component="th" scope="row">{row.vehicleId}</TableCell>
        <TableCell>{row.vehicleType}</TableCell>
        <TableCell>{row.vehicleName}</TableCell>
        <TableCell>{row.modelNumber}</TableCell>
        <TableCell>{row.vehicleColor}</TableCell>
        <TableCell>{row.engineNumber}</TableCell>
        <TableCell>{row.noOfCylinders}</TableCell>
        <TableCell>{row.manufacturerName}</TableCell>
        <TableCell>{row.dateOfManufacture}</TableCell>
        <TableCell>{row.cubicCapacity}</TableCell>
        <TableCell>{row.fuelUsed}</TableCell>

      </TableRow>
      <TableRow>
        <TableCell style={{ paddingBottom: 0, paddingTop: 0 }} colSpan={12}>
          <Collapse in={open} timeout="auto" unmountOnExit>
            <Box sx={{ margin: 1 }}>
              <Typography variant="h6" gutterBottom component="div">
                Owner Details
              </Typography>
              <Table size="small" aria-label="purchases">
                <TableHead>
                  <TableRow>
                    <TableCell>Owner Id</TableCell>
                    <TableCell>First Name</TableCell>
                    <TableCell>Last Name</TableCell>
                    <TableCell>Date of Birth</TableCell>
                    <TableCell>Landline Number</TableCell>
                    <TableCell>Mobile Number</TableCell>
                    <TableCell>Gender</TableCell>
                    <TableCell>Temporary Address</TableCell>
                    <TableCell>Permanent Address</TableCell>
                    <TableCell>Pincode</TableCell>
                    <TableCell>Occupation</TableCell>
                    <TableCell>Pancard Number</TableCell>
                    <TableCell>Aadhar Number</TableCell>

                  </TableRow>
                </TableHead>
                <TableBody>
                  {row.ownerDetails.map((ownerRow) => (
                    <TableRow key={ownerRow}>
                      <TableCell component="th" scope="row">
                        {ownerRow.ownerId}
                      </TableCell>
                      <TableCell>{ownerRow.firstName}</TableCell>
                      <TableCell>{ownerRow.lastName}</TableCell>
                      <TableCell>{ownerRow.birthdate}</TableCell>
                      <TableCell>{ownerRow.landlineNo}</TableCell>
                      <TableCell>{ownerRow.mobileNo}</TableCell>
                      <TableCell>{ownerRow.gender}</TableCell>
                      <TableCell>{ownerRow.temporaryAddress}</TableCell>
                      <TableCell>{ownerRow.permanentAddress}</TableCell>
                      <TableCell>{ownerRow.pincode}</TableCell>
                      <TableCell>{ownerRow.occupation}</TableCell>
                      <TableCell>{ownerRow.pancardNumber}</TableCell>
                      <TableCell>{ownerRow.aadharNumber}</TableCell>

                    </TableRow>
                  ))}
                </TableBody>
              </Table>
            </Box>
          </Collapse>
        </TableCell>
      </TableRow>
    </>
  );
}

Row.propTypes = {
  row: PropTypes.shape({
    // vehicleNumber: PropTypes.string.isRequired,
    vehicleType: PropTypes.string.isRequired,
    vehicleName: PropTypes.string.isRequired,
    modelNumber: PropTypes.string.isRequired,
    vehicleColor: PropTypes.string.isRequired,
    engineNumber: PropTypes.string.isRequired,
    noOfCylinders: PropTypes.number.isRequired,
    manufacturerName: PropTypes.string.isRequired,
    dateOfManufacture: PropTypes.string.isRequired,
    cubicCapacity: PropTypes.number.isRequired,
    fuelUsed: PropTypes.string.isRequired,
    ownerDetails: PropTypes.arrayOf(
      PropTypes.shape({
        ownerId: PropTypes.number.isRequired,
        firstName: PropTypes.string.isRequired,
        lastName: PropTypes.string.isRequired,
        birthdate: PropTypes.string.isRequired,
        landlineNo: PropTypes.string.isRequired,
        mobileNo: PropTypes.string.isRequired,
        gender: PropTypes.string.isRequired,
        temporaryAddress: PropTypes.string.isRequired,
        permanentAddress: PropTypes.string.isRequired,
        pincode: PropTypes.number.isRequired,
        occupation: PropTypes.string.isRequired,
        pancardNumber: PropTypes.string.isRequired,
        aadharNumber: PropTypes.string.isRequired,

      }),
    ).isRequired,

  }).isRequired,
};

var rows = [];

export default function Report() {
  const [noRows, setNoRows] = React.useState(true);
  const [vehicleNumber, setVehicleNumber] = React.useState('');
  const [error, setError] = React.useState(false);
  var [disableField, setDisableField] = React.useState(true);

  var vehId = '';


  const regexPattern = /^[A-Z]{2}\d{2}[A-Z]{1,2}\d{4}$/;

  const vehicleNumberHandleChange = (event) => {
    const { value } = event.target;
    setVehicleNumber(value);
    vehicleNumbers().then((resp) => {
      vehicleNumberArray = resp;
      // console.log(vehicleNumberArray);
    }).catch((error) => {
      console.log(error);
    })

    setError(!validateVehicleNumber(value));
  };

  const validateVehicleNumber = (value) => {
    return regexPattern.test(value);
  };

  const searchHandler = (event) => {
    vehicleNumberArray.forEach((item, index) => {

      if (item === vehicleNumber) {
        setDisableField(false);
        disableField = false;
        // console.log(vehId);

        var ow = {};

        ownerDetails(vehicleNumber).then((respo) => {
          ow = {
            oId: respo.ownerId,
            ofirstname: respo.firstName,
            olastName: respo.lastName,
            obirthdate: respo.dateOfBirth,
            olandlineNo: respo.landlineNo,
            omobileNo: respo.mobileNo,
            ogender: respo.gender,
            otemporaryAddress: respo.tempAddr,
            opermanentAddress: respo.permAddr,
            opincode: respo.pincode,
            ooccupation: respo.occupation,
            opancardNumber: respo.pancardNo,
            oaadharNumber: respo.aadharNo
          };
        })

        getvehicleId(vehicleNumber).then((resp) => {
          vehId = resp;
          // setVId(vehId);
          console.log(vehId);
          // console.log(vId);

          vehicle(vehId).then((resp) => {

            rows = [createData(resp.vehicleId, resp.vehicleType,
              resp.vehicleName,
              resp.modelNumber,
              resp.vehicleColor,
              resp.engineNumber,
              resp.noOfCylinders,
              resp.manufacturerName,
              resp.dateOfManufacture,
              resp.cubicCapacity,
              resp.fuelUsed,
              [
                {
                  ownerId: ow.oId,
                  firstName: ow.ofirstname,
                  lastName: ow.olastName,
                  birthdate: ow.obirthdate,
                  landlineNo: ow.olandlineNo,
                  mobileNo: ow.omobileNo,
                  gender: ow.ogender,
                  temporaryAddress: ow.otemporaryAddress,
                  permanentAddress: ow.opermanentAddress,
                  pincode: ow.opincode,
                  occupation: ow.ooccupation,
                  pancardNumber: ow.opancardNumber,
                  aadharNumber: ow.oaadharNumber,
                }
              ]),
            ]
            // console.log(rows.ownerDetails.firstName)
            if (rows.length > 0) {
              setNoRows(false);
            } else {
              setNoRows(true);
            }
          }).catch((error) => {
            console.log(error);
          })

        }).catch((error) => {
          console.log(error);
        })

      }
    })
    if (disableField) {
      alert('Invalid Vehicle Number');
    }
  };

  return (
    <React.Fragment>
      <Navbar></Navbar>
      <Grid container sx={{ m: 9 }}>
        <Grid item xs={4} sm={4}>
          <TextField required fullWidth id="vehicleNumber" name="vehicleNumber" label="Vehicle Number" autoFocus value={vehicleNumber} onChange={vehicleNumberHandleChange} error={error}
            helperText={error ? 'AB12AB1234' : ''} />
        </Grid>
        <Grid item xs={4} sm={4}>
          <Button
            variant="contained"
            type='button'
            sx={{ mt: 1, mb: 1 }} onClick={searchHandler}
          >
            Search
          </Button>
        </Grid>
      </Grid>
      {noRows ? <div> </div> :
        <TableContainer component={Paper}>
          <Table aria-label="collapsible table">
            <TableHead>
              <TableRow>
                <TableCell />
                <TableCell>Vehicle Id</TableCell>
                <TableCell>Vehicle Type</TableCell>
                <TableCell>Vehicle Name</TableCell>
                <TableCell>Model Number</TableCell>
                <TableCell>Vehicle Color</TableCell>
                <TableCell>Engine Number</TableCell>
                <TableCell>No Of Cylinders</TableCell>
                <TableCell>Manufacturer Name</TableCell>
                <TableCell>Date of Manufacture</TableCell>
                <TableCell>Cubic Capacity</TableCell>
                <TableCell>Fuel Used</TableCell>

              </TableRow>
            </TableHead>
            <TableBody>
              {rows.map((row) => (
                <Row key={row} row={row} />
              ))}
            </TableBody>
          </Table>
        </TableContainer>
      }

    </React.Fragment>
  );
}