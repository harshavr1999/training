import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './ReportGeneration.css';
import SelectLabels from './components/input-fields/Select';
import BasicTextField from './components/input-fields/BasicTextField';
import Report from './resources/report2.svg';
import CollapsibleTable from './components/input-fields/CollapsibleTable';
import Button from '@mui/material/Button';
import { TextField } from '@mui/material';
import './components/input-fields/BasicTextField.css';
import Navbar from './Navbar';
import { Typography } from '@mui/material';


function ReportGeneration() {

  const [offenceLists, setOffenceLists] = useState([]);
  const [rows, setRows] =  useState([]);

  useEffect(() => {
    // Function to fetch data using Axios
    const fetchData = async () => {
      try {
        const response = await axios.get('http://localhost:8081/report/offences');
        setOffenceLists(response.data);

        // Convert the objects to strings using JSON.stringify()
        const offenceDataAsString = response.data.map(obj => JSON.stringify(obj));

        // Display the offence data as strings
        console.log("Offence Data:", offenceDataAsString.join(", "));

      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    fetchData();

    const fetchDetails = async () => {
      try {
        const response = await axios.get('http://localhost:8081/report/details');

   
        setRows(response.data);

        // Convert the objects to strings using JSON.stringify()
        const offenceDataAsString = response.data.map(obj => JSON.stringify(obj));

        // Display the offence data as strings
        console.log("Rows:", offenceDataAsString.join(", "));

      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    fetchDetails();

  }, []);



  const menuLists = [
    { id: 0, name: "Vehicle Number" },
    { id: 1, name: "Vehicle Type" },
    { id: 2, name: "Offence Type" },
    { id: 3, name: "Date Range" }
  ];

  const vehicleTypes = [
    { id: 0, name: '2-wheeler' },
    { id: 1, name: '3-wheeler' },
    { id: 2, name: '4-wheeler' }
  ];



  const [basedOn, setBasedOn] = React.useState('');
  const [vehicleNo, setVehicleNo] = React.useState('');
  const [vehicleType, setVehicleType] = React.useState('');
  const [offenceType, setOffenceType] = React.useState('');
  const [imageShow, setImageShow] = React.useState(true);
  const [showAlert, setShowAlert] = React.useState(false);
  const [sortedRows, setSortedRows] = React.useState([]);
  const [to, setTo] = React.useState('');
  const [from, setFrom] = React.useState('');
  const [disableSearch, setDisableSearch] = React.useState(true);


  const handleChange = (event) => {
    setBasedOn(event.target.value);
    setImageShow(true);
    setShowAlert(false);
    
    // Convert the objects to strings using JSON.stringify()
    const offenceDataAsString = offenceLists.map(obj => JSON.stringify(obj));

    // Display the offence data as strings
    console.log("Offence List:", offenceDataAsString.join(", "));

    // Convert the objects to strings using JSON.stringify()
    const offenceDataAsStrin = offenceLists.map(obj => JSON.stringify(obj));

    // Display the offence data as strings
    console.log("Offence Lists:", offenceDataAsStrin.join(", "));

  };

  const handleVehicleType = (event) => {
    setVehicleType(event.target.value);
    if (typeof event.target.value === 'number') {
      let row = rows.filter(row => row.vehicleType === vehicleTypes[event.target.value].name);
      if (row.length > 0) {
        setImageShow(false);
        setShowAlert(false);
        setSortedRows(row);
      }
      else {
        setImageShow(true);
        setShowAlert(true);
        setSortedRows([]);
      }
    }
    else {
      setImageShow(true);
      setSortedRows([]);
    }
  };

  const handleOffenceType = (event) => {
    setOffenceType(event.target.value);
    if (typeof event.target.value === 'number') {
      console.log("value: " + event.target.value);

      let row = rows.filter(row => row.offenceType === offenceLists[event.target.value].name);
      if (row.length > 0) {
        setImageShow(false);
        setShowAlert(false);
        setSortedRows(row);
      }
      else {
        setImageShow(true);
        setShowAlert(true);
        setSortedRows([]);
      }
    }
    else {
      setImageShow(true);
      setSortedRows([]);
    }
  };

  const handleDate = (event) => {
    let small = from > to ? to : from;
    let large = from > to ? from : to;
    console.log("Small : " + small + " Large : " + large);
    // let row = rows.filter(row => (Date.parse(row.date.split(' ')[0]) >= Date.parse(small)) && (Date.parse(row.date.split(' ')[0]) <= Date.parse(large)));
    let row = rows.filter(row => (Date.parse(row.date) >= Date.parse(small)) && (Date.parse(row.date) <= Date.parse(large)));
    if (row.length > 0) {
      setImageShow(false);
      setShowAlert(false);
      setSortedRows(row);
    }
    else {
      setImageShow(true);
      setShowAlert(true);
      setSortedRows([]);
    }
  };

  const changeVehicleNumber = (event) => {
    setVehicleNo(event.target.value);
  };

  const changeToDate = (event) => {
    setTo(event.target.value);
    console.log("To : " + event.target.value);
    if (event.target.value.length > 0 && from.length > 0) {
      setDisableSearch(false);
    } else {
      setDisableSearch(true);
    }
  };

  const changeFromDate = (event) => {
    setFrom(event.target.value);
    console.log("From : " + event.target.value);
    if (Date.parse(event.target.value) > Date.parse(to)) {
      setTo("");
      alert(`Please Choose "To" Date Again, Since It Is Greater Than "From" Date`);
      setDisableSearch(true);
    }
    else if (event.target.value.length > 0 && to.length > 0) {
      setDisableSearch(false);
    }
  };

  const handleVehicleNumber = (event) => {

    let regex = new RegExp(/^[A-Z]{2}[ -]{0,1}[0-9]{2}[ -]{0,1}[A-Z]{1,2}[ -]{0,1}[0-9]{4}$/);

    if (regex.test(vehicleNo.toUpperCase()) === true) {
      let row = rows.filter(row => row.vehicleNumber === vehicleNo.replace(/[ -]/g, '').toUpperCase());
      if (row.length > 0) {
        setImageShow(false);
        setShowAlert(false);
        setSortedRows(row);
      }
      else {
        setImageShow(true);
        setShowAlert(true);
        setSortedRows([]);
      }
    }
    else {
      alert("Please Enter Valid Vehicle Number");
      setImageShow(true);
      setShowAlert(false);
      setSortedRows([]);
    }
  };

  return (
    <div className='App'>
      <Navbar></Navbar>
      <Typography component="h1" variant="h5" m={3}>
          REPORT GENERATION
        </Typography>
      {/* <Header>Report Generation</Header> */}
      <SelectLabels label="Based On" value={basedOn} onChange={handleChange} lists={menuLists} />
      {(() => {
        if (basedOn === 0) {
          return <div>
            <BasicTextField id={menuLists.find(({ id }) => id === basedOn).name} label={menuLists.find(({ id }) => id === basedOn).name} onChange={changeVehicleNumber} />
            <Button variant="contained" sx={{ backgroundColor: '#8a2b06', marginLeft: '10px', height: '55px' }} onClick={handleVehicleNumber}>Search</Button>
          </div>
        } else if (basedOn === 1) {
          return <SelectLabels label="Vehicle Type" value={vehicleType} onChange={handleVehicleType} lists={vehicleTypes} />;
        } else if (basedOn === 2) {
          return <SelectLabels label="Offence Type" value={offenceType} onChange={handleOffenceType} lists={offenceLists}/>;
        } else if (basedOn === 3) {
          let currentDate = new Date().toLocaleDateString('en-GB', {
            year: 'numeric',
            month: '2-digit',
            day: '2-digit',
          }).split('/').reverse().join('-');
          console.log("Date : " + currentDate);
          return <div>
            <TextField
              label="From"
              type="date"
              value={from}
              inputProps={{ min: "2000-01-01", max: currentDate }}
              onChange={changeFromDate}
              InputLabelProps={{ shrink: true }}
              className="textField"
            />
            &nbsp;&nbsp;&nbsp;&nbsp;
            <TextField
              label="To"
              type="date"
              value={to}
              inputProps={{ min: from.length > 0 ? from : "2000-01-01", max: currentDate }}
              onChange={changeToDate}
              InputLabelProps={{ shrink: true }}
              className="textField"
            />
            <Button variant="contained" sx={{ backgroundColor: '#8a2b06', marginLeft: '10px', height: '56px' }} disabled={disableSearch} onClick={handleDate}>Search</Button>
          </div>
        }
      })()}
      {imageShow ? <div className="remaining-height">
        <img src={Report} alt='Choose Your Input' />
      </div> : <CollapsibleTable rows={sortedRows} />}
      {(() => {
        if (showAlert === true) {
          alert("No Offence Found");
          setShowAlert(false);
        }
      })()}
    </div>
  );
}

export default ReportGeneration;
