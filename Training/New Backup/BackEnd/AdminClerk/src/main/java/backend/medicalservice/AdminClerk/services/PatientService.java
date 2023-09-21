package backend.medicalservice.AdminClerk.services;

import java.util.List;

import backend.medicalservice.AdminClerk.entities.PatientEO;

/**
 * This service interface defines the operations related to patient management.
 */
public interface PatientService {
	
	/**
     * Retrieve a list of all patient entities.
     *
     * @return A list containing all patient entities in the system.
     */
	public List<PatientEO> getAllPatients();
	
	/**
     * Add a new patient entity to the system.
     *
     * @param patient The patient entity to be added.
     */
	public void addpatient(PatientEO patient);
	
	/**
     * Update an existing patient entity using their Aadhar number.
     *
     * @param aadharNumber The Aadhar number of the patient to be updated.
     * @param updatedPatient The updated patient entity.
     */
	public void updatePatientByAadharNumber(String aadharNumber, PatientEO updatedPatient);
	
	/**
     * Delete a patient entity using their Aadhar number.
     *
     * @param aadharNumber The Aadhar number of the patient to be deleted.
     */
	public void deletePatient(String aadharNumber);
	
	/**
     * Retrieve a patient entity using their Aadhar number.
     *
     * @param aadharNumber The Aadhar number of the patient to retrieve.
     * @return The patient entity associated with the provided Aadhar number, or null if not found.
     */
	public PatientEO getPatientByAadharNumber(String aadharNumber);
	
	/**
     * Retrieve a list of all Aadhar numbers belonging to patients in the system.
     *
     * @return A list of all Aadhar numbers associated with patients.
     */
	public List<String> allAadharNumber();
	
	/**
     * Retrieve a patient entity using their email address.
     *
     * @param email The email address of the patient to retrieve.
     * @return The patient entity associated with the provided email, or null if not found.
     */
	public PatientEO getPatientByEmail(String email);

}
