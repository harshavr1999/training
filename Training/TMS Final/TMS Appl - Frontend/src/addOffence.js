import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import Stack from '@mui/material/Stack';
// import Header from './header';
import Navbar from './Navbar';
import axios from "axios";
import SelectLabels from './Cop/selectlabels';

export default function AddOffenceDetails() {
  const [offenceId, setoffenceId] = React.useState('');
  const [offenceStatus, setOffenceStatus] = React.useState('');
  var [disableField, setDisableField] = React.useState(true);
  const [vehicleNumberField, setVehicleNumberField] = React.useState('');
  const [dateField, setDateField] = React.useState('');
  const [timeField, setTimeField] = React.useState('');
  const [offencePlaceField, setOffencePlaceField] = React.useState('');
  const [reportedByField, setReportedByField] = React.useState('');
  const [imageField, setImageField] = React.useState('');
  const [isFormValid, setIsFormValid] = React.useState(false);
  const [imageBytes, setImageBytes] = React.useState(null);
  const [offenceLists, setOffenceLists] = React.useState([]);
  const [isValid, setIsValid] = React.useState(false);
  //const[success, setSuccess] = React.useState(false);
 // const vehicleNumbersArray = ['TS041456', 'TS041111', 'TS046789'];
  const handleReset = (event) => {

    setoffenceId('');
    setOffenceStatus('');
    setDisableField('');
    setVehicleNumberField('');
    setDateField('');
    setTimeField('');
    setOffencePlaceField('');
    setImageField(null);
    setIsFormValid('');

  }



  const handleVehcileNumberField = (event) => {
    setVehicleNumberField(event.target.value);
  };

  // const handleDisable = (event)=>{
  //   setDisableField(event.target.disabled);
  // };

  const handleDateField = (event) => {
    setDateField(event.target.value);
  };

  const handleTimeField = (event) => {
    setTimeField(event.target.value);
  };

  const handleOffencePlaceField = (event) => {
    setOffencePlaceField(event.target.value);
  };

  const handlereportedByField = (event) => {
    setReportedByField(event.target.value);
  };

  const handleimageField = (event) => {
    setImageField(event.target.files[0]);

    //   reader.onloadend=()=>{
    //     setImageBytes({imageBytes: reader.result});
    // };
    //     reader.readAsArrayBuffer(imageField);

   
  };

  const handleChange = (event) => {

    setoffenceId(event.target.value);

  };
  const handleChange1 = (event) => {
    console.log("value ="+event.target.value);
    setOffenceStatus(event.target.value);
   
  }


  let currentDate = new Date().toLocaleDateString('en-GB', {
    year: 'numeric',
    month: '2-digit',
    day: '2-digit',
  }).split('/').reverse().join('-');

const acceptedFileTypes = '.jpg,.jpeg,.png';
  const handleSearch = async (event) => {
    event.preventDefault();
    // const fetchValue = async () => {
    //   try {
    //     const resp = await axios.get(`http://localhost:8123/${vehicleNumberField}`)
    //     setIsValid(resp.data);
    //     console.log(resp.data)
    //   }
    //   catch (error) {
    //     console.log(error);
    //   }
    // };

    //  fetchValue();

      await  axios.get(`http://localhost:8123/${vehicleNumberField}`)
      .then(response => {
        setIsValid(response.data);
        console.log(response.data);
        if (response.data) {
          //console.log("hello")
          event.preventDefault();
          setDisableField(false);
          disableField = false;

          const fetchData = async () => {
            try {
              const response = await axios.get("http://localhost:8123/getalloffences")
               setOffenceLists(response.data);
              // console.log(response.data);
            }
            catch (error) {
              console.log(error)
            }
          };
          fetchData();
        }
        if (disableField) {
          event.preventDefault();
          alert('Invalid Number');
        }
      })
      .catch(error => {
        console.log(error);
      });
    // if (isValid) {
    //   console.log("hello")
    //   event.preventDefault();
    //   setDisableField(false);
    //   disableField = false;

    //   const fetchData = async () => {
    //     try {
    //       const response = await axios.get("http://localhost:8123/getalloffences")
    //       setData(response.data);
    //       // console.log(response.data);
    //     }
    //     catch (error) {
    //       console.log(error)
    //     }
    //   };
    //   fetchData();
    // }
 

  }

  const offenceStatusList = [
    {
      offecneId: 1, offenceType: "UNPAID"
    },
    { offecneId: 2, offenceType: "PAID" }
  ]

  React.useEffect(() => {
    setIsFormValid(vehicleNumberField !== '' && offenceId !== '' && offenceStatus !== ''
      && dateField !== '' && timeField !== '' && offencePlaceField !== ' ' && reportedByField !== ''
    )
  }, [vehicleNumberField, offenceId, offenceStatus,
    dateField, timeField, offencePlaceField, reportedByField]);

  const reader = new FileReader();
  const idtoFind = offenceId;
  const objectwithId = offenceLists.find(obj => obj.offecneId === idtoFind);
  const handleSubmit = async (event) => {
   //event.preventDefault();
   var success = false;

    if (isFormValid) {
      const imageBlob = new Blob([imageField], { type: imageField.type });
      const reader = new FileReader();

      reader.onloadend = () => {
        const imageBytes = new Uint8Array(reader.result);
      }
      const formData = new FormData();
      formData.append("place", offencePlaceField);
      formData.append("time", dateField);
      formData.append("reportedBy", reportedByField);
      formData.append("offenceStatus",offenceStatus);
      formData.append("vehNo", vehicleNumberField);

      if (imageField) {
        formData.append("image", imageBytes);
      }
      formData.append("offenceType", objectwithId.offenceType);

      // try {

      //   const response = await axios.post("http://localhost:8123/addoffence", formData, {
      //     headers: {
      //       "Content-Type": "multipart/form-data",
      //     },
      //   });
      //   alert("offence added successfully");
      // }
      // catch (error) {
      //   alert(error);
      // }

     const  resp =  await  axios.post("http://localhost:8123/addoffence",formData,
      {
            headers: {
               "Content-Type": "multipart/form-data",
            }
          }
      ).then(response => {
       alert(response.data);
      }).catch(error =>{
        alert(error);
      })
      
    }
    else {
      event.preventDefault();
      alert(" Please Enter the Required fields!!!");
    }

  };
  return (
    <div>
      {/* <Header>Add Offence Details </Header> */}
      <Navbar></Navbar>
      <Container component="main" maxWidth="md" >
        <Box
          sx={{
            marginTop: 8,
            display: 'flex',
            flexDirection: 'column',
            alignItems: 'center',
            boxShadow: 7,
            p: 6
          }}
          component='form'
        >

          <Typography component="h1" variant="h5">
            Add Offence Details
          </Typography>
          <Box  sx={{ mt: 3 }}>
            <Grid container spacing={2} onSubmit={handleSubmit}>
              <Grid item xs={12} sm={6}>

                <TextField
                  name="Vehicle Number"
                  required
                  fullWidth
                  value={vehicleNumberField}
                  onChange={handleVehcileNumberField}
                  disabled={!disableField}
                  id="vehicleNumber"
                  label="Vehicle Number"
                  autoFocus
                />
              </Grid>

              <Grid item xs={12} sm={3}>
                <Button
                  //type="submit"
                  variant="contained"
                  sx={{ mt: 1, mb: 2, ml: 4 }}
                  onClick={handleSearch}

                >
                  Search
                </Button>

              </Grid>

              <Grid item xs={12} sm={6}>
                {/* <Select
                id="offenceId"
                value={offenceId}
                onChange={handleChange}
                disabled={disableField}
                displayEmpty
                fullWidth
              > */}
                {/* <MenuItem value="">Offence Types</MenuItem>
                <MenuItem value={'General Offences'}>General Offences</MenuItem>
                <MenuItem value={'withoutValidLicence'}> Driving the vehicle without valid licence </MenuItem>
                <MenuItem value={'excessiveSpeed'}>Driving at Excessive speed</MenuItem>
                <MenuItem value={'drivingDangerously'}>Driving Dangerously</MenuItem>
                <MenuItem value={'racingWithoutPermission'}>Racing and trails of speed without permission</MenuItem>
                <MenuItem value={'UsingPhone'}>Talking on mobile phone whille  driving</MenuItem>
                <MenuItem value={'uninsuredVehicle'}>Driving uninsured vehicle</MenuItem>
                <MenuItem value={'mentallyPhysicallyUnifittoDrive'}>Driving mentally or physically unfit to drive</MenuItem> */}

                <SelectLabels label="Offence Type" value={offenceId} onChange={handleChange} lists={offenceLists} disabled={disableField} />

                {/* </Select> */}
              </Grid>

              <Grid item xs={12} sm={6}>

                {/* <Select
                id="offenceStatus"
                value={offenceStatus}
               // displayEmpty
                fullWidth
                onChange={handleChange1}
                disabled={disableField}
               //defaultValue='UNPAID'
                labelId='UNPAID'
                label="offence status"
              >
                
                <MenuItem placeholder="Offence Status" value={'PAID'}>PAID</MenuItem>
               
              </Select> */}

                <SelectLabels label="Offence Status" value={offenceStatus} onChange={handleChange1} lists={offenceStatusList} disabled={disableField} />

              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="Date"
                  helperText="Offence Date"
                  disabled={disableField}
                  type='date'
                  value={dateField}
                  inputProps={{min:  "2000-01-01" , max: currentDate }}
                  onChange={handleDateField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="Time"
                  helperText="Offence Time"
                  disabled={disableField}
                  type='time'
                  value={timeField}
                  onChange={handleTimeField}
                />
              </Grid>

              <Grid item xs={12}>
                <TextField
                  required
                  fullWidth
                  id="offencePlace"
                  disabled={disableField}
                  label="Offence Place"
                  value={offencePlaceField}
                  onChange={handleOffencePlaceField}
                />
              </Grid>

              <Grid item xs={12}>
                <TextField
                  required
                  fullWidth
                  id="reportedBy"
                  label="Reported By"
                  disabled={disableField}
                  value={reportedByField}
                  onChange={handlereportedByField}
                />
              </Grid>

              <Grid item xs={12} sm={6}>
                <TextField
                  fullWidth
                  name="imageField"
                  helperText=".png .jpeg, .jpg offence image"
                  type='file'
                 // disabled={disableField}
                  inputProps={{
                    accept : acceptedFileTypes,
                  }}
                  value={imageBytes}
                  onChange={handleimageField}
                />
              </Grid>

            </Grid>
            <Stack spacing={2} direction="row" justifyContent='center' alignItems='center'>
              <Button type="reset" variant="contained" sx={{ mt: 2, mb: 2, mr: 4 }} disabled={disableField}
                onClick={handleReset}>
                Reset
              </Button>
              <Button
                type="submit"
                variant="contained"
                sx={{ mt: 1, mb: 2, ml: 4 }}
                disabled={disableField}
                onClick={handleSubmit}
              >
                Submit
              </Button>
            </Stack>
          </Box>
        </Box>
      </Container>
    </div>
  );
}