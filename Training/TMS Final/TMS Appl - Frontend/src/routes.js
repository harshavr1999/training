
import { Routes, Route } from "react-router-dom";
import { BrowserRouter as Router } from "react-router-dom";
import ClerkOperationsStack from "./Clerk-Operations-Stack";
import AddOffenceDetails from "./addOffence";
import {  useState } from "react";
import ClearOffenceDetails from "./clearOffence";
import ReportGeneration from "./ReportGeneration";
import Login from "./Login/LoginPage";
// import RTOPage from './RTO/RtoPage';
import AddUser from "./Admin/User/AddUser";
import ModifyUser from "./Admin/User/ModifyUser";
import ModifyRole from "./Admin/Role/ModifyRole";
import TransferVehicle from "./RTO/TransferVehicle";
import AdminPage from "./Admin/AdminPage";
import AddRole from "./Admin/Role/AddRole";
import CopOperationsStack from "./Cop/CopOperationsStack";
import RTOHome from "./RTOhome/RTOHome";
import AddVehicle from "./RTOhome/RTOoperations/AddVehicle";
import ModifyVehicle from "./RTOhome/RTOoperations/ModifyVehicle";
import ModifyOwner from "./RTOhome/RTOoperations/ModifyOwner";
// import Navbar from './Navbar';
import AddOwner from "./RTOhome/RTOoperations/AddOwner";
import VehicleRegistration from "./RTOhome/RTOoperations/VehicleRegistration";
// import RTOHome from './RTOHome';
import AddOffenceType from "./RTOhome/RTOoperations/AddOffenceType";
import ModifyOffenceType from "./RTOhome/RTOoperations/ModifyOffenceType";
import ShowAllOwners from "./RTOhome/RTOoperations/ShowAllOwners";
import Report from "./RTOhome/RTOoperations/Report";

export default function Dashboard1() {


    const [roleName, setRoleName] = useState("");
    // const [JwtToken, setToken] = useState("");
    

    var RolenameFromSessionStorage= sessionStorage.getItem("name");
    return (
        <div>

            {(() => {
                console.log("helloooo")
                console.log(roleName.length +"It is length")
                if (RolenameFromSessionStorage.length<1) {
                    return(
                    <div>
                    <Router>
                        <Routes>
                            <Route exact path="/" element={<Login setRoleName={setRoleName} />}></Route>
                        </Routes>
                    </Router>
                    </div>)                }
                else if (RolenameFromSessionStorage === "Admin") {
                    return(
                    <Router>
                        <Routes>
                            <Route exact path="/" element={<Login setRoleName={setRoleName} />}></Route>
                            <Route path="Adminpage" element={<AdminPage />}> </Route>
                            <Route path="adduser" element={<AddUser />}></Route>
                            <Route path="modifyuser" element={<ModifyUser />}></Route>
                            <Route path="addrole" element={<AddRole />}></Route>
                            <Route path="modifyrole" element={<ModifyRole />}></Route>
                            
                        </Routes>
                    </Router>)
                }
                else if (RolenameFromSessionStorage === "RTO") {
                    return(
                    <Router>
                        <Routes>
                            <Route exact path="/" element={<Login setRoleName={setRoleName} />}></Route>
                            <Route path="/rtoHomePage" element={<RTOHome />} />
                            <Route path="/addvehicle/" element={<AddVehicle />} />
                            <Route path="/modifyvehicle/" element={<ModifyVehicle />} />
                            <Route path="/addowner/" element={<AddOwner />} />
                            <Route path="/modifyowner/" element={<ModifyOwner />} />
                            <Route path="/showallowners/" element={<ShowAllOwners />} />
                            <Route path="/vehicleregistration/" element={<VehicleRegistration />} />
                            <Route path="/addoffencetype/" element={<AddOffenceType />} />
                            <Route path="/modifyoffencetype/" element={<ModifyOffenceType />} />
                            <Route path="/reportgeneration/" element={<Report />} />
                            <Route path="/Transfervehicle/" element={<TransferVehicle />} />
                        </Routes>
                    </Router>
                    )
                }
                else if (RolenameFromSessionStorage === "Cop") {
                    return(
                    <Router>
                        <Routes>
                            <Route exact path="/" element={<Login setRoleName={setRoleName} />}></Route>
                            <Route
                                path="/clearOffences"
                                element={<ClearOffenceDetails></ClearOffenceDetails>}
                            />
                            <Route
                                path="/addOffences"
                                element={<AddOffenceDetails></AddOffenceDetails>}
                            />
                            {/* Cop Home Page */}
                            <Route
                                path="/CopHomePage"
                                element={<CopOperationsStack></CopOperationsStack>}
                            />

                        </Routes>
                    </Router>
                    )
                }
                else if(RolenameFromSessionStorage==="Clerk")
                {
                    return(
                    <Router>
                        <Routes>
                    <Route
                    path="/clerkHomePage"
                    element={<ClerkOperationsStack></ClerkOperationsStack>}
                />
                <Route
                    path="/clearOffences"
                    element={<ClearOffenceDetails></ClearOffenceDetails>}
                />
                <Route
                    path="/addOffences"
                    element={<AddOffenceDetails></AddOffenceDetails>}
                />
                <Route
                    path="/generateReport"
                    element={<ReportGeneration></ReportGeneration>}
                />
                {/* Cop Home Page */}
                <Route
                    path="/CopHomePage"
                    element={<CopOperationsStack></CopOperationsStack>}
                />
                <Route exact path="/" element={<Login setRoleName={setRoleName} />}></Route>
                </Routes>
                </Router>
                    )
                }
            })()}
    </div >
  );
}
