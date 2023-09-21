import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import MenuItem from '@mui/material/MenuItem';
import Select from '@mui/material/Select';
import Snackbar from '@mui/material/Snackbar';
import MuiAlert from '@mui/material/Alert';
import Navbar from '../../Navbar';
export default function AddUser() {
  const [userName, setUserName] = useState('');
  const [password, setPassword] = useState('');
  const [role, setRole] = useState('');
  const [isSnackbarOpen, setIsSnackbarOpen] = useState(false);
  const [successMessage, setSuccessMessage] = useState('');
  const [userNameErrorMessage, setUserNameErrorMessage] = useState(''); // Separate error state for username
  const [passwordErrorMessage, setPasswordErrorMessage] = useState(''); // Separate error state for password
  const [roleNames, setRoleNames] = useState([]);

  const handleSnackbarClose = () => {
    setIsSnackbarOpen(false);
  };

  // Fetch the roles from the backend API
  useEffect(() => {
    axios.get('http://localhost:9090/admin/roles')
      .then((response) => {
        // Assuming the backend is returning an array of roleName directly
        const roleNames = response.data;
        setRoleNames(roleNames);
      })
      .catch((error) => {
        console.error('Error fetching roles:', error);
      });
  }, []);

  const handleSubmit = (event) => {
    event.preventDefault();

    if (!userName || !password || !role) {
      // Set the error message for the respective fields
      setUserNameErrorMessage(userName ? '' : 'Please enter a username!');
      setPasswordErrorMessage(password ? '' : 'Please enter a password!');
      setSuccessMessage(''); // Reset success message
      return;
    }

   // Use regex to check if the password contains at least 8 characters, one special character, and one capital letter
    const passwordRegex = /^(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.{8,})/;
    if (!passwordRegex.test(password)) {
      setUserNameErrorMessage(''); // Reset username error message
      setPasswordErrorMessage('it should contain one special character, and one capital letter!');
      setSuccessMessage(''); // Reset success message
      return;
    }

    const newUser = {
      username: userName.toUpperCase(),
      password: password,
      roleName: role,
    };

    // Send the user data to the backend API using Axios
    axios.post('http://localhost:9090/admin/addUser', newUser)
      .then((response) => {
        console.log('Response from server:', response);

        // Check if the response status is 2xx (success status)
        if (response.status === 200) {
          console.log('User added successfully:', response.data);
          setUserName('');
          setPassword('');
          setRole('');
          setIsSnackbarOpen(true);
          setSuccessMessage('User added successfully!');
          setUserNameErrorMessage(''); // Reset the error message on success
          setPasswordErrorMessage(''); // Reset the error message on success
        } else {
          console.error('Error adding user. Status:', response.status);
        }
      })
      .catch((error) => {
        console.error('Error adding user:', error);

        console.error('Error Status Code:', error.response.status);

        if (error.response.status === 500) {
          setUserNameErrorMessage('Username Already Exists! Please try a different username.');
          setSuccessMessage(''); // Reset success message on error
          const usernameField = document.getElementById('userName');
          if (usernameField) {
            usernameField.style.borderColor = 'red';
          }
        } else {
          // Show a generic error message for other errors
          setUserNameErrorMessage('Unknown error occurred. Please try again.');
          setSuccessMessage(''); // Reset success message on error
        }
      });
  };

  return (
    <React.Fragment>
      <Navbar></Navbar>
    <Container component="main" maxWidth="md">
      <Box
        sx={{
          marginTop: 8,
          display: 'flex',
          flexDirection: 'column',
          alignItems: 'center',
          boxShadow: 7,
        }}
      >
        <Typography component="h1" variant="h5" sx={{ mt: 3 }}>
          Add New User
        </Typography>
        <Box component="form" sx={{ mt: 3 }} onSubmit={handleSubmit}>
          <Grid container spacing={2}>
            <Grid item xs={12}>
              <TextField
                name="userName"
                required
                fullWidth
                id="userName"
                label="Username"
                value={userName}
               
                onChange={(e) => setUserName(e.target.value)}
                error={!!userNameErrorMessage} // Set error state based on userNameErrorMessage
                helperText={userNameErrorMessage} // Display error message if it exists
              />
            </Grid>

            <Grid item xs={12}>
              <TextField
                required
                fullWidth
                id="password"
                label="Password"
                type="password"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                error={!!passwordErrorMessage && !successMessage} // Set error state based on passwordErrorMessage and no success message
                helperText={passwordErrorMessage || "Password must contain at least 8 characters!"} // Display error message if it exists or default validation message
              />
            </Grid>

            <Grid item xs={12}>
              <Select
                id="role"
                required
                label="Role Name"
                value={role}
                displayEmpty
                fullWidth
                onChange={(e) => setRole(e.target.value)}
              >
                <MenuItem value="" disabled>
                  Select Role
                </MenuItem>
                {roleNames.map((name) => (
                  <MenuItem key={name} value={name}>
                    {name}
                  </MenuItem>
                ))}
              </Select>
            </Grid>
          </Grid>
          <Button type="submit" variant="contained" sx={{ mt: 3, mb: 2 }}>
            Add User
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
          {successMessage}
        </MuiAlert>
      </Snackbar>
    </Container>
   </React.Fragment>
  );
}
