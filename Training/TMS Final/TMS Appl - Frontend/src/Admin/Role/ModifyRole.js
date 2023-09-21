import * as React from "react";
import Button from "@mui/material/Button";
import TextField from "@mui/material/TextField";
import Grid from "@mui/material/Grid";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";
import Container from "@mui/material/Container";
import { Stack } from "@mui/material";
import { useState, useEffect } from "react";
import MenuItem from '@mui/material/MenuItem';
import Select from '@mui/material/Select';
import UpdateIcon from "@mui/icons-material/Update";
import DeleteIcon from "@mui/icons-material/Delete";
import Snackbar from "@mui/material/Snackbar";
import MuiAlert from "@mui/material/Alert";
import Navbar from '../../Navbar';
import axios from 'axios';


export default function ModifyRole() {
  const [RoleName, setRolename] = useState("");
  const [RoleDesc, setRoleDesc] = useState("");
  const [roles, setRoles] = useState([]);
  const [isSnackbarOpen, setIsSnackbarOpen] = React.useState(false);
  const [snackbarMessage, setSnackbarMessage] = React.useState("");
  const isUpdateButtonDisabled = !RoleName || !RoleDesc;

  // New useEffect to fetch data from the backend and store it in 'roles' state
    useEffect(() => {
    // const fetchRoles = () => {
      axios
      .get('http://localhost:9090/admin/getall')
      .then((response) => {
        // Handle the response from the backend and store the data in 'roles' state
        setRoles(response.data);
      })
      .catch((error) => {
        // Handle errors (if any)
        console.error('Error fetching data:', error);
        setSnackbarMessage('An error occurred while fetching roles');
        setIsSnackbarOpen(true);
      });
    // };
  },[]);

  const handleChange = (e) => {

    const selectedRoleName = e.target.value;
    console.log(selectedRoleName);
    setRolename(selectedRoleName);

    const selectedRole = roles.find((role) => role.roleName === selectedRoleName);
    console.log(selectedRole.RoleDesc);
    if (selectedRole) {
      setRoleDesc(selectedRole.roleDescription);
    } else {
      setRoleDesc("");
    }
  };



  const handleRemove = () => {
    const modifyRole = {
      roleName: RoleName
    };
    // Make an HTTP POST request to send data to Spring backend  with the actual backend endpoint URL for adding roles
    axios
      .post('http://localhost:9090/admin/deleterole', modifyRole)
      .then((response) => {
        // Handle the response from the backend (if needed)
        setRolename('');
        setRoleDesc('');
        setSnackbarMessage("Role deleted successfully");
        setIsSnackbarOpen(true);
      })
      .catch((error) => {
        // Handle errors (if any)
      
        console.error('Error sending data:', error);
        setSnackbarMessage('An error occurred while deleting the role');
        setIsSnackbarOpen(true);
      });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    // console.log("Modifying Role:", event.RoleName, event.RoleDesc);
    const modifyRole = {
      roleName: RoleName,
      roleDescription: RoleDesc,
    };

    // Make an HTTP POST request to send data to Spring backend  with the actual backend endpoint URL for adding roles
    axios
      .post('http://localhost:9090/admin/modifyrole', modifyRole)
      .then((response) => {
        // Handle the response from the backend (if needed)
        setRolename('');
        setRoleDesc('');
        setSnackbarMessage("Role modified successfully");
        setIsSnackbarOpen(true);
        setInterval(myTimeout, 5000);

        
      })
      .catch((error) => {
        // Handle errors (if any)
      
        console.error('Error sending data:', error);
        setSnackbarMessage('An error occurred while modifying the role');
        setIsSnackbarOpen(true);
      });

  };

  
  function myTimeout() {
    window.location.reload(true);
  } 


  const handleSnackbarClose = () => {
    setIsSnackbarOpen(false);
   
    
  };

  // console.log(RoleName);
  return (
    <React.Fragment>
      <Navbar></Navbar>
      {/* <Header></Header> */}
      <Container component="main" maxWidth="md">
        <Box
          sx={{
            marginTop: 8,
            display: "flex",
            flexDirection: "column",
            alignItems: "center",
            boxShadow: 8,
          }}
        >
          <Typography
            component="h1"
            variant="h5"
            fontWeight="bold"
            sx={{ mt: 5 }}
          >
            Modify Role
          </Typography>

          <Box component="form" sx={{ mt: 3 }}>
            <Grid container xs={12} spacing={2}>
              <Grid item xs={12}>
                <Stack
                  direction="row"
                  justifyContent="space-around"
                  spacing={2}
                >
                  <Select
                    id="RoleName"
                    value={RoleName}
                    displayEmpty
                    fullWidth
                    required
                    size="small"
                    onChange={handleChange}

                  >
                    <MenuItem value="">Select Role</MenuItem>
                    {roles.map((role) => (
                      <MenuItem value={role.roleName} key={role.roleName}>
                        {role.roleName}

                      </MenuItem>
                      ))}
                     </Select>
                </Stack>
              </Grid>
              

              <Grid item xs={12}>
                <TextField
                  required
                  fullWidth
                  id="RoleDescription"
                  label="Role Description"
                  size="small"
                  value={RoleDesc}
                  onChange={(e) => setRoleDesc(e.target.value)
                  }
                />
              </Grid>
            </Grid>
            <Grid flexDirection={"row"}>
              <Button
                type="delete"
                variant="contained"
                sx={{ mt: 3, mb: 2, mr: 4 }}
                endIcon={<DeleteIcon />}
                onClick={handleRemove}
                disabled={isUpdateButtonDisabled}

              >
                Delete
              </Button>

              <Button
                type="submit"
                variant="contained"
                sx={{ mt: 3, mb: 2, ml: 4 }}
                endIcon={<UpdateIcon />}
                onClick={handleSubmit}
                  disabled={isUpdateButtonDisabled}
              >
                Update
              </Button>
            </Grid>


          </Box>
        </Box>
        <Snackbar
          open={isSnackbarOpen}
          autoHideDuration={3000}
          onClose={handleSnackbarClose}
          anchorOrigin={{ vertical: "top", horizontal: "right" }}
        >
          <MuiAlert
            onClose={handleSnackbarClose}
            severity="success"
            sx={{ width: "100%" }}
            
          >
            {snackbarMessage}
          </MuiAlert>
        </Snackbar>
      </Container>
    </React.Fragment>
  );
}
