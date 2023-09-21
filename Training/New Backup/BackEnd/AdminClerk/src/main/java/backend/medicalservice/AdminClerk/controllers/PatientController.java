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
import backend.medicalservice.AdminClerk.entities.PatientEO;
import backend.medicalservice.AdminClerk.services.PatientService;

/**
 * Controller class handling patient-related operations.
 */
@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired PatientService patientServiceRef;
	
	/**
     * Fetches all patients from the database.
     *
     * @return A list of PatientEO objects representing all patients.
     */
	@GetMapping("/allPatients")
	public List<PatientEO> fetchAllPatients(){
		return patientServiceRef.getAllPatients();
	}
	
	/**
     * Adds a new patient to the database.
     *
     * @param patient The PatientEO object representing the patient to be added.
     */
	@PostMapping("/addPatient")
	public void addPatient(@RequestBody PatientEO patient){
		patientServiceRef.addpatient(patient);
	}
	
	/**
     * Updates patient information by Aadhar number.
     *
     * @param aadharNumber  The Aadhar number of the patient to be updated.
     * @param updatedPatient  The updated PatientEO object.
     */
	@PutMapping("/updatePatient/{aadharNumber}")
	public void updatePatient(@PathVariable("aadharNumber") String aadharNumber, @RequestBody PatientEO updatedPatient){
		patientServiceRef.updatePatientByAadharNumber(aadharNumber, updatedPatient);
	}
	
	/**
     * Deletes a patient by Aadhar number.
     *
     * @param aadharNumber  The Aadhar number of the patient to be deleted.
     */
	@DeleteMapping("/deletePatient/{aadharNumber}")
	public void deletePatient(@PathVariable("aadharNumber") String aadharNumber){
		patientServiceRef.deletePatient(aadharNumber);
	}
	
	/**
     * Fetches details of a patient by Aadhar number.
     *
     * @param aadharNumber  The Aadhar number of the patient to fetch details for.
     * @return The PatientEO object representing the patient's details.
     */
	@GetMapping("/patientDetails/{aadharNumber}")
	public PatientEO fetchPatientDetails(@PathVariable("aadharNumber") String aadharNumber){
		return patientServiceRef.getPatientByAadharNumber(aadharNumber);
	}
	
	
	/**
     * Fetches all Aadhar numbers of patients.
     *
     * @return A list of Aadhar numbers.
     */
	@GetMapping("/allAadharNumbers")
	public List<String> fetchAllAadhars(){
		return patientServiceRef.allAadharNumber();
	}
	
	/**
     * Fetches patient details by email address.
     *
     * @param email  The email address of the patient to fetch details for.
     * @return The PatientEO object representing the patient's details.
     */
	@GetMapping("/patientDetailsByEmail/{email}")
	public PatientEO fetchPatientByEmail(@PathVariable("email") String email){
		return patientServiceRef.getPatientByEmail(email);
	}
	
}
