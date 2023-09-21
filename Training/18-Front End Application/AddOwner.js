import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import MenuItem from '@mui/material/MenuItem';
import Select from '@mui/material/Select';
import Stack from '@mui/material/Stack';

export default function AddOwner() {
  const [gender, setGender] = React.useState('');

  const handleChange = (event) => {
    setGender(event.target.value);
  };

  return (
    <Container component="main" maxWidth="md">
      <Box boxShadow={'5px 5px 10px grey'}
        sx={{
          margin: 8,
          display: 'flex',
          flexDirection: 'column',
          alignItems: 'center',
        }}
      >

        <Typography component="h1" variant="h5" mt={3}>
          Add Owner Details
        </Typography>
        <Box component="form" sx={{ m: 3 }}>
          <Grid container spacing={2}>
            <Grid item xs={12} sm={6}>
              <TextField
                name="firstName"
                required
                fullWidth
                id="firstName"
                label="First Name"
                autoFocus
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="lastName"
                label="Last Name"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="birthdate"
                type='date'
                helperText="Date of Birth"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="landlineNo"
                label="Landline Number"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="mobileNo"
                label="Mobile Number"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <Select
                labelIdid="genderlabel"
                id="gender"
                value={gender}
                displayEmpty
                fullWidth
                onChange={handleChange}
              >
                <MenuItem value="">Gender</MenuItem>
                <MenuItem value={'Male'}>Male</MenuItem>
                <MenuItem value={'Female'}>Female</MenuItem>
                <MenuItem value={'Other'}>Other</MenuItem>
              </Select>
              {/* <TextField
                  required
                  fullWidth
                  id="landlineNo"
                  label="Gender"
                /> */}
            </Grid>

            <Grid item xs={12}>
              <TextField
                required
                fullWidth
                id="landlineNo"
                label="Temporary Address"
              />
            </Grid>

            <Grid item xs={12}>
              <TextField
                required
                fullWidth
                id="landlineNo"
                label="Permanent Address"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="landlineNo"
                label="Pincode"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="landlineNo"
                label="Occupation"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="landlineNo"
                label="Pancard Number"
              />
            </Grid>

            <Grid item xs={12} sm={6}>
              <TextField
                required
                fullWidth
                id="landlineNo"
                label="Aadhar Number"
              />
            </Grid>



          </Grid>
          <Stack spacing={2} direction="row" justifyContent='center' alignItems='center'>
          <Button
            type="reset"
            variant="contained"
            sx={{ mt: 2, mb: 2, mr: 4 }}
          >
            Reset
          </Button>
          <Button
            type="submit"
            variant="contained"
            sx={{ mt: 3, mb: 2, ml: 4 }}
          >
            Add Owner
          </Button>
          </Stack>
        </Box>
      </Box>

    </Container>
  );
}