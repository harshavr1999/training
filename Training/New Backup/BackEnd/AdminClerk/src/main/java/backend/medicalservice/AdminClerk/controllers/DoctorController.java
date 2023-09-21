package backend.medicalservice.AdminClerk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.medicalservice.AdminClerk.entities.DoctorEO;
import backend.medicalservice.AdminClerk.services.DoctorService;

/**
 * Controller class handling doctor-related operations.
 */
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired DoctorService doctorServiceRef;
	
	/**
     * Fetches all doctors from the database.
     *
     * @return A list of DoctorEO objects representing all doctors.
     */
	@GetMapping("/allDoctors")
	public List<DoctorEO> fetchAllDoctors(){
		return doctorServiceRef.getAllDoctors();
	}
	
	/**
     * Adds a new doctor to the database.
     *
     * @param doctor The DoctorEO object representing the doctor to be added.
     */
	@PostMapping("/addDoctor")
	public void addDoctor(@RequestBody DoctorEO doctor){
		doctorServiceRef.addDoctor(doctor);
	}
	
	/**
     * Updates doctor information by email.
     *
     * @param email          The email of the doctor to be updated.
     * @param updatedDoctor  The updated DoctorEO object.
     */
	@PutMapping("/updateDoctor/{email}")
	public void updateDoctor(@PathVariable("email") String email, @RequestBody DoctorEO updatedDoctor){
		doctorServiceRef.updateDoctorByEmail(email, updatedDoctor);
	}
	
	/**
     * Deletes a doctor by email.
     *
     * @param email  The email of the doctor to be deleted.
     */
	@DeleteMapping("/deleteDoctor/{email}")
	public void deleteDoctor(@PathVariable("email") String email){
		doctorServiceRef.deleteDoctor(email);
	}
	
	/**
     * Fetches details of a doctor by email.
     *
     * @param email  The email of the doctor to fetch details for.
     * @return The DoctorEO object representing the doctor's details.
     */
	@GetMapping("/doctorDetails/{email}")
	public DoctorEO fetchDoctorDetails(@PathVariable("email") String email){
		return doctorServiceRef.getDoctorByEmail(email);
	}
	
	/**
     * Fetches all email addresses of doctors.
     *
     * @return A list of email addresses.
     */
	@GetMapping("/allEmails")
	public List<String> fetchAllEmails(){
		return doctorServiceRef.allEmails();
	}
	
	/**
     * Fetches doctors by department.
     *
     * @param department  The department for which to fetch doctors.
     * @return A list of DoctorEO objects representing doctors in the specified department.
     */
	@GetMapping("/doctorsByDepartment/{department}")
	public List<DoctorEO> fetchDoctorsByDepartments(@PathVariable("department") String department){
		return doctorServiceRef.getDoctorsByDepartment(department);
	}
	
	/**
     * Fetches all departments.
     *
     * @return A list of department names.
     */
	@GetMapping("/allDepartments")
	public List<String> fetchAllDepartments(){
		return doctorServiceRef.allDepartments();
	}
	
	
}
