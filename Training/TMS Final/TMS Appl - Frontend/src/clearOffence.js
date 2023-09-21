import React, { useMemo, useState, useEffect } from "react";
import Header from "./Header";
import Box from '@mui/material/Box';
import Grid from '@mui/material/Grid';
import Button from '@mui/material/Button';
import { MaterialReactTable } from 'material-react-table';
import { TextField, Typography } from "@mui/material";
import Navbar from './Navbar';
import axios from "axios";


export default function ClearOffenceDetails() {

  const columns = useMemo(

    () => [
      {
        accessorKey: 'id',
        header: 'ID',
      },
      {
        accessorKey: 'offenceTypeId',
        header: 'OFFENCE TYPE ID',
      },
      {
        accessorKey: 'location',
        header: 'LOCATION',
      },
      {
        accessorKey: 'reportedBy',
        header: 'REPORTED BY',
      },
      {
        accessorKey: 'date',
        header: 'DATE',
      },
      {
        accessorKey: 'penalty',
        header: 'PENALTY',
      },
      {
        accessorKey: 'status',
        header: 'STATUS',
      },
    ],
    [], //end
  );

  //optionally, you can manage the row selection state yourself
  const [rowSelection, setRowSelection] = useState({});
  const [rows, setRows] = useState([]);
  const selectedKeys = [];
  const [sortedRows, setSortedRows] = useState([]);
  const [vehicleNumber, setVehicleNumber] = useState('');
  const [error, setError] = useState(false);
  var[disableField, setDisableField] = React.useState(true);



  useEffect(() => {
    console.info({ rowSelection });
  }, [rowSelection]);


  const selectedList = () => {
    for (const key in rowSelection) {
      if (rowSelection.hasOwnProperty(key)) {
        selectedKeys.push(key);
      }
    }
  }



  const handleChange = (event) => {
    setVehicleNumber(event.target.value);
    setError(false);
  };

const getUnpaidRows = () => {
  axios.get(`http://localhost:9123/clear-offence/${vehicleNumber}`)
      .then(response => {
        if(response.data.length>0){
        setSortedRows(response.data);
        console.log(response.data);
      }
      else{
        alert('No offence found');
        setSortedRows([]);
      }
    })
    .catch(error => {
      console.log(error);
    });
}


  const handleSubmit = (event) => {
    event.preventDefault();
    getUnpaidRows();
  }


  const changeStatus = async (event) => {
    try {
      const response = await axios.post('http://localhost:9123/clear-offence/changeStatus', selectedKeys);
      console.log("keys passed");
    } catch (error) {
      console.log(error);
    }
  }

  const handleClearOffence = (event) => {
    console.log('row :');
    if (Object.keys(rowSelection).length > 0) {
      console.log('hello');
      // setSortedRows(rows);
      selectedList();
      changeStatus();
      console.log(selectedKeys);
      alert('Successfully cleared the selected offence');
     console.log("row "+Object.keys(rowSelection).length);
     console.log("sorted"+sortedRows.length);
      if(Object.keys(rowSelection).length===sortedRows.length)
      setSortedRows([]);
      else
      getUnpaidRows();
      setRowSelection({});
    }
    else {
      setSortedRows([]);
    }

  }


  return (
    <React.Fragment>
      <Navbar></Navbar>

      <Box
        sx={{

          marginTop: 8,
          alignItems: 'center',
          boxShadow: 7,
          p: 6
        }}
      >
        <Typography component="h1" variant="h5">
          CLEAR OFFENCE DETAILS
        </Typography>
        <Box component="form" sx={{ mt: 2 }} >
          <Grid container spacing={2} >
            <Grid item xs={3} ></Grid>

            <Grid item xs={6} >
              Vehicle Number * <TextField
                name="vehicleNumber"
                required
                fullWidth
                id="vehicleNumber"
                label=""
                autoFocus
                sx={{ boxShadow: 3 }}
                value={vehicleNumber}
                onChange={handleChange}
                error={error}
                helperText={error ? 'Vehicle number is required' : ''}
              />
            </Grid>
            <Grid item xs={4} ></Grid>
            <Grid item xs={4} >
              <Button
                onClick={handleSubmit}
                variant="contained"
                sx={{ mt: 3, mb: 2, mr: 4, backgroundColor: 'darkred', boxShadow: 3 }}
              >
                Search
              </Button>
            </Grid>

            <Grid item xs={12} >
              <div style={{ height: 300, width: '100%', border: 'solid 1px ' }}>

                <MaterialReactTable
                  columns={columns}
                  data={sortedRows}
                  enableRowSelection
                  getRowId={(row) => row.id} //give each row a more useful id
                  onRowSelectionChange={setRowSelection} //connect internal row selection state to your own
                  state={{ rowSelection }} //pass our managed row selection state to the table to use
                />
              </div >
            </Grid>
            <Grid item xs={12} ></Grid>
            <Grid item xs={12} ></Grid>
            <Grid item xs={6} >

            </Grid>
            <Grid item xs={6} >

            </Grid>
            <Grid item xs={12} >
            </Grid>
            <Grid item xs={12} lg={12} >
              <Button
                onClick={handleClearOffence}
                disabled = {Object.keys(rowSelection).length>0? false:true}
                variant="contained"
                sx={{ mt: 3, mb: 2, ml: 4, backgroundColor: 'seagreen', boxShadow: 3 }}
              >
                CLEAR OFFENCE
              </Button>
            </Grid>
          </Grid>
        </Box>
      </Box>

    </React.Fragment>
  );
}