import { useState } from "react";
import CssBaseline from "@mui/material/CssBaseline";
import Box from "@mui/material/Box";
import Container from "@mui/material/Container";
import Button from "@mui/material/Button";
import TextField from "@mui/material/TextField";
// import FormControlLabel from "@mui/material/FormControlLabel";
// import Checkbox from "@mui/material/Checkbox";
import Link from "@mui/material/Link";
import Paper from "@mui/material/Paper";
import Grid from "@mui/material/Grid";
import Typography from "@mui/material/Typography";
import {useNavigate } from "react-router-dom";
import axios from'axios';
// import {Routes,Route} from "react-router-dom";
// import AdminPage from "../Admin/AdminPage";

//use sesion storage for authentaction



const Login = (props) => {
  
  const navigate = useNavigate();
  const [username, setusername] = useState("");
  const [password, setpassword] = useState("");
  const handleSubmit = async (e) => {

    try{
    var response= await axios(
      {
        method :"POST",
        url :"http://localhost:9090/admin/login",
        headers:{"content-type": "application/json"},
        data:
        {
          username:username,
          password:password
        }
  
      })
    }
    catch(e)
    {
      console.log(e);
    }
    if(response){
    if(response.status===204)
    {
      alert("User credentilas not found/mismatched")
    }
    else
    {
      var roleName=response.data[0].toUpperCase();
      
      const token=response.data[1]

    sessionStorage.setItem("name",roleName)
    sessionStorage.setItem("token",token)
    props.setRoleName(roleName)
      
    }
  }
  else
  {
    alert("Server conection failure");
  }

    // const account = users.find((x) => x.username === username);

      if (roleName === "ADMIN" ) {
        navigate("/Adminpage")
        
      } 
      else if (roleName === "RTO") {
        navigate("/rtoHomePage")
      }
      else if (roleName === "CLERK") {
        navigate("/clerkHomePage")
      }
      else if (roleName === "COP") {
        navigate("/copHomePage")
      }
    
  };

  return (
    <div>
 <Container component="main" maxWidth="lg">
      <Box
        sx={{
          marginTop: 8,
        }}
      >
        <Grid container>
          <CssBaseline />
          <Grid
            item
            xs={false}
            sm={4}
            md={7}
            sx={{
              backgroundImage: "url('./Login-logo.jpeg')",
              backgroundRepeat: "no-repeat",
              // backgroundColor: (t) =>
              //   t.palette.mode === "light"
              //     ? t.palette.grey[50]
              //     : t.palette.grey[900],
              backgroundSize: "cover",
              backgroundPosition: "center",
            }}
          />
          <Grid
            item
            xs={12}
            sm={8}
            md={5}
            component={Paper}
            elevation={6}
            square
          >
            <Box
              sx={{
                my: 8,
                mx: 4,
                display: "flex",
                flexDirection: "column",
                alignItems: "center",
              }}
            >
              <Typography component="h1" variant="h5">
                Welcome To TMS Application
              </Typography>
              <Typography component="h2" variant="h5" mt={2}>
                Sign in
              </Typography>
              <Box
                component="form"
                noValidate
              
                sx={{ mt: 1 }}
              >
                <TextField
                  margin="normal"
                  required
                  fullWidth
                  id="userName"
                  label="UserName"
                  name="username"
                  autoComplete="enter username"
                  value ={username}
                  onChange={(e) => setusername(e.target.value)}
                  autoFocus
                />
                <TextField
                  margin="normal"
                  required
                  fullWidth
                  name="password"
                  label="Password"
                  type="password"
                  id="password"
                  value={password}
                  onChange={(e) => setpassword(e.target.value)}
                  autoComplete="current-password"
                />
                {/* <FormControlLabel
                  control={<Checkbox value="remember" color="primary" />}
                  label="Remember me"
                /> */}
                <Button
                  type="button"
                  fullWidth
                  variant="contained"
                  sx={{ mt: 3, mb: 2 }}
                  onClick={handleSubmit}
                >
                  Sign In
                </Button>
                {/* <Grid container>
                  <Grid item xs>
                    <Link href="#" variant="body2">
                      Forgot password?
                    </Link>
                  </Grid> */}
                  {/* <Grid item>
                    <Link href="#" variant="body2">
                      {"Don't have an account? Sign Up"}
                    </Link>
                  </Grid> */}
                {/* </Grid> */}
              </Box>
            </Box>
          </Grid>
        </Grid>
      </Box>
    </Container>
    </div>
  );
};

export default Login;
