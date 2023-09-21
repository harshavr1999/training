import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Stack } from '@mui/material';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import Snackbar from '@mui/material/Snackbar';
import MuiAlert from '@mui/material/Alert';
import SearchOutlinedIcon from '@mui/icons-material/SearchOutlined';
import UpdateIcon from '@mui/icons-material/Update';
import DeleteIcon from '@mui/icons-material/Delete';
import MenuItem from '@mui/material/MenuItem';
import Select from '@mui/material/Select';
import Navbar from '../../Navbar';
export default function ModifyUser() {
  const [userName, setUserName] = useState('');
  const [password, setPassword] = useState('');
  const [roleName, setRoleName] = useState('');
  const [isUserFound, setIsUserFound] = useState(false);
  const [isSnackbarOpen, setIsSnackbarOpen] = useState(false);
  const [snackbarMessage, setSnackbarMessage] = useState('');
  const [roleNames, setRoleNames] = useState([]);

  useEffect(() => {
    // Fetch the role names from the backend API
    axios.get('http://localhost:9090/admin/roles')
      .then((response) => {
        // Extract role names from the response and set in roleNames state
        const roleNames = response.data;
      
        setRoleNames(roleNames);
      })
      .catch((error) => {
        console.error('Error fetching roles:', error);
      });
  }, []);

  const handleSearch = () => {
    if (!userName) {
      alert('Please enter a username!');
      return;
    }
  
    axios
      .post('http://localhost:9090/admin/get', { username: userName })
      .then((response) => {
        if (response.status === 200) {
          const foundUser = response.data;

          if (foundUser) {
            setPassword(foundUser.password);
            setRoleName(foundUser.roleName);
            setIsUserFound(true);
          } else {
            setPassword('');
            setRoleName('');
            setIsUserFound(false);
            alert('User not found.');
          }
        } else {
          console.error('Error fetching user. Status:', response.status);
          alert('Error fetching user details.');
        }
      })
      .catch((error) => {
        console.error('Error fetching user:', error);
        console.error('Error fetching user. Status:', error.response ? error.response.status : null);
        alert('Error fetching user details.');
      });
  };
  
  const handleRemove = () => {
    console.log('Removing user:', userName);
    axios
      .delete('http://localhost:9090/admin/deleteUser', {
        data: { username: userName },
      })
      .then((response) => {
        if (response.status === 200) {
          console.log('User deleted successfully:', response.data);
          setSnackbarMessage('User deleted successfully');
          setIsSnackbarOpen(true);
          setUserName('');
          setPassword('');
          setRoleName('');
          setIsUserFound(false);
        } else {
          console.error('Error deleting user. Status:', response.status);
        }
      })
      .catch((error) => {
        console.error('Error deleting user:', error);
        console.error('Error deleting user. Status:', error.response ? error.response.status : null);
      });
  };
  

  const handleSubmit = (event) => {
    event.preventDefault();

    if (!userName || !password || !roleName) {
      alert('Please fill in all the fields!');
      return;
    }

    // Use regex to check if the password contains at least 8 characters
    const passwordRegex = /^.{8,}$/;
    if (!passwordRegex.test(password)) {
      alert('Password must contain at least 8 characters(at least one special and one Capital)!');
      return;
    }

    const modifiedUser = {
      username: userName.toUpperCase(),
      password: password,
      roleName: roleName,
    };
    console.log(modifiedUser);
    axios
      .put('http://localhost:9090/admin/modifyUser', modifiedUser)
      .then((response) => {
        console.log('Response from server:', response);

        if (response.status === 200) {
          console.log('User modified successfully:', response.data);
          setSnackbarMessage('User modified successfully');
          setIsSnackbarOpen(true);
        } else {
          console.error('Error modifying user. Status:', response.status);
        }
      })
      .catch((error) => {
        console.error('Error modifying user:', error);
        console.error('Error modifying user. Status:', error.response ? error.response.status : null);
      });
  };

  const handleSnackbarClose = () => {
    setIsSnackbarOpen(false);
  };

  return (
    <React.Fragment>
       <Navbar></Navbar>
      <Container component="main" maxWidth="xs" sx={{ boxShadow: 7, marginBottom: 2 }}>
        <Box
          sx={{
            marginTop: 8,
            display: 'flex',
            flexDirection: 'column',
            alignItems: 'center',
            marginBottom: 2,
          }}
        >
          <Typography component="h1" variant="h5" sx={{ m: 2 }}>
            Modify User
          </Typography>
          <Box component="form" sx={{ mt: 2 }} onSubmit={handleSubmit}>
            <Grid container spacing={2}>
              <Grid item xs={12}>
                <Stack
                  spacing={2}
                  direction="row"
                  alignItems="center"
                  justifyContent="space-between"
                  sx={{ marginBottom: 4 }}
                >
                  <TextField
                    type="text"
                    variant="outlined"
                    color="secondary"
                   
                    label="User Name"
                    onChange={(e) => setUserName(e.target.value)}
                    value={userName}
                    required
                    sx={{ flex: 1 }}
                  />
                  <Button
                    variant="outlined"
                    color="secondary"
                    startIcon={<SearchOutlinedIcon />}
                    onClick={handleSearch}
                    sx={{ flexShrink: 0 }}
                  >
                    Search
                  </Button>
                </Stack>
              </Grid>

              <Grid item xs={12}>
                <TextField
                  type="password"
                  variant="outlined"
                  color="secondary"
                  label="Password"
                  onChange={(e) => setPassword(e.target.value)}
                  value={password}
                  required
                  fullWidth
                  disabled={!isUserFound}
                  sx={{ marginBottom: 4 }}
                />
              </Grid>

              <Grid item xs={12}>
                <Select
                  variant="outlined"
                  color="secondary"
                  label="Role Name"
                  value={roleName}
                  onChange={(e) => setRoleName(e.target.value)}
                  required
                  fullWidth
                  disabled={!isUserFound}
                  sx={{ marginBottom: 4 }}
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

              <Grid item xs={12}>
                <Stack direction="row" spacing={2} justifyContent="space-around" sx={{ marginBottom: 3 }}>
                  <Button
                    type="submit"
                    variant="contained"
                    sx={{ width: '40%' }}
                    startIcon={<UpdateIcon />}
                    disabled={!isUserFound}
                  >
                    Modify User
                  </Button>
                  <Button
                    type="button"
                    variant="contained"
                    sx={{ width: '40%' }}
                    startIcon={<DeleteIcon />}
                    onClick={handleRemove}
                    disabled={!isUserFound}
                  >
                    Delete User
                  </Button>
                </Stack>
              </Grid>
            </Grid>
          </Box>
        </Box>
      </Container>
      <Snackbar
        open={isSnackbarOpen}
        autoHideDuration={3000}
        onClose={handleSnackbarClose}
        anchorOrigin={{ vertical: 'top', horizontal: 'right' }}
      >
        <MuiAlert onClose={handleSnackbarClose} severity="success" sx={{ width: '100%' }}>
          {snackbarMessage}
        </MuiAlert>
      </Snackbar>
    </React.Fragment>
  );
}
