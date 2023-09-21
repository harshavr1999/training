import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import { useState } from 'react';
import PersonAddIcon from '@mui/icons-material/PersonAdd';
import ClearIcon from '@mui/icons-material/Clear';
import Snackbar from '@mui/material/Snackbar';
import MuiAlert from '@mui/material/Alert';
import Navbar from '../../Navbar';
import axios from 'axios';


export default function AddOwner() {

  const [RoleName, setRolename] = useState("");
  const [RoleDesc, setRoleDesc] = useState("");
 
  const [isSnackbarOpen, setIsSnackbarOpen] = React.useState(false);
const[SnackbarMessage, setSnackbarMessage]=React.useState('')

const submitHandler = (event) => {
  event.preventDefault();
  const newRole = {
    roleName: RoleName,
    roleDescription: RoleDesc,
  };

  // Make an HTTP POST request to send data to Spring backend  with the actual backend endpoint URL for adding roles
  axios
    .post('http://localhost:9090/admin/addrole', newRole)
    .then((response) => {
 // Handle the response from the backend (if needed)
      // console.log('Data from backend:', response.data);
  
      setRolename('');
      setRoleDesc('');
      setSnackbarMessage('Role added successfully');
      setIsSnackbarOpen(true);
    })
    .catch((error) => {
      // Handle errors (if any)
       console.error('Error sending data:', error);
      setSnackbarMessage('An error occurred while adding the role');
      setIsSnackbarOpen(true);
    });
};

const handleSnackbarClose = () => {

  setIsSnackbarOpen(false);

};




return (
  <React.Fragment>
    <Navbar></Navbar>
    {/* <Header></Header> */}
  <Container component="main" maxWidth="md">

    <Box
      sx={{
        marginTop: 8,
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        boxShadow:8

      }}
    >

      <Typography component="h1" variant="h5" fontWeight='bold' sx={{mt:4}}>
          Add Role
      </Typography>

      <Box component="form" sx={{ mt: 3 }} onSubmit={submitHandler}>
       
        <Grid container spacing={2}>
        <Grid item xs={12}>
          
            <TextField
              required
              fullWidth
              id="RoleName"
              label="Role Name"
              onChange={(e) => setRolename(e.target.value)}
              value={RoleName} 
              size='small'
            />
          </Grid>

          <Grid item xs={12}>
            <TextField
              required
              fullWidth
              id="RoleDescription"
              label="Role Description"
              size='small'
              onChange={(e) => setRoleDesc(e.target.value)}
              value={RoleDesc} 
            />
          </Grid>
        </Grid>
        <Button
          type="reset"
          variant="contained"
          endIcon={<ClearIcon />}
          sx={{ mt: 3, mb: 2, mr: 4 }}
          onClick={() => { setRolename(""); setRoleDesc("")}}
        >
          Reset
        </Button>
        <Button
          type="submit"
          variant="contained"
          endIcon= {<PersonAddIcon />}
          sx={{ mt: 3, mb: 2, ml: 4 }}
        >
          Add Role
        </Button>
       
      </Box>
    </Box>
    <Snackbar
      open={isSnackbarOpen}
      autoHideDuration={3000}
      onClose={handleSnackbarClose}
      anchorOrigin={{ vertical: 'top', horizontal: 'right' }}
    >
      <MuiAlert onClose={handleSnackbarClose} severity="success" sx={{ width: '100%' }}>
        {SnackbarMessage}
      </MuiAlert>
    </Snackbar>
  </Container>
  </React.Fragment>
);
}