package backend.medicalservice.AdminClerk.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import backend.medicalservice.AdminClerk.entities.PatientEO;
import backend.medicalservice.AdminClerk.repositories.PatientRepository;
import backend.medicalservice.AdminClerk.services.PatientService;

/**
 * Implementation of the PatientService interface that provides methods for managing patient entities.
 */
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired PatientRepository patientRepRef;
	
	/**
     * Retrieves a list of all patients.
     *
     * @return A list of PatientEO objects representing all patients.
     */
	@Override
	public List<PatientEO> getAllPatients() {

		List<PatientEO> patientsList = new ArrayList<>();
		patientRepRef.findAll().forEach(patientsList::add);
		
		return patientsList;
	}

	/**
     * Adds a new patient to the system.
     *
     * @param patient The PatientEO object representing the patient to be added.
     */
	@Override
	public void addpatient(PatientEO patient) {
		// TODO Auto-generated method stub
		patientRepRef.save(patient);
	}

	/**
     * Updates patient information based on Aadhar number.
     *
     * @param aadharNumber The Aadhar number of the patient to be updated.
     * @param updatedPatient The PatientEO object containing the updated information.
     */
	@Override
	public void updatePatientByAadharNumber(String aadharNumber, PatientEO updatedPatient) {
		
		PatientEO patient = patientRepRef.findByAadharNumber(aadharNumber);
		
		patient.setFirstName(updatedPatient.getFirstName());
		patient.setLastName(updatedPatient.getLastName());
		patient.setDateOfBirth(updatedPatient.getDateOfBirth());
		patient.setMobileNo(updatedPatient.getMobileNo());
		patient.setGender(updatedPatient.getGender());
		patient.setAddress(updatedPatient.getAddress());
		patient.setInsurance(updatedPatient.getInsurance());
		patient.setPolicyNumber(updatedPatient.getPolicyNumber());
		
		patientRepRef.save(patient);
	}

	/**
     * Deletes a patient based on their Aadhar number.
     *
     * @param aadharNumber The Aadhar number of the patient to be deleted.
     */
	@Override
	public void deletePatient(String aadharNumber) {
		
		PatientEO patient = patientRepRef.findByAadharNumber(aadharNumber);
		
		patientRepRef.delete(patient);
		
	}

	/**
     * Retrieves a patient by their Aadhar number.
     *
     * @param aadharNumber The Aadhar number of the patient to retrieve.
     * @return The PatientEO object representing the retrieved patient.
     */
	@Override
	public PatientEO getPatientByAadharNumber(String aadharNumber) {
		
		PatientEO patient = patientRepRef.findByAadharNumber(aadharNumber);
	
		return patient;
	}

	/**
     * Retrieves a list of all Aadhar numbers of patients.
     *
     * @return A list of Aadhar numbers belonging to all patients.
     */
	@Override
	public List<String> allAadharNumber() {
		
		List<PatientEO> patients = patientRepRef.findAll();
		
		List<String> allAadhars = patients.stream().map(PatientEO::getAadharNumber).collect(Collectors.toList());
		
		return allAadhars;
	}

	/**
     * Retrieves a patient by their email.
     *
     * @param email The email of the patient to retrieve.
     * @return The PatientEO object representing the retrieved patient.
     */
	@Override
	public PatientEO getPatientByEmail(String email) {
		
		PatientEO patient = patientRepRef.findByEmail(email);
		
		return patient;
	}

}
