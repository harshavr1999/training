package backend.medicalservice.AdminClerk.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import backend.medicalservice.AdminClerk.entities.PatientEO;

/**
 * This repository interface provides access to patient-related data stored in the MongoDB database.
 */
public interface PatientRepository extends MongoRepository<PatientEO, String>{
	
	/**
     * Retrieve a patient entity by their Aadhar number.
     *
     * @param aadharNumber The Aadhar number of the patient to retrieve.
     * @return The patient entity associated with the provided Aadhar number, or null if not found.
     */
	PatientEO findByAadharNumber(String aadharNumber);
	
	/**
     * Retrieve a patient entity by their email address.
     *
     * @param email The email address of the patient to retrieve.
     * @return The patient entity associated with the provided email, or null if not found.
     */
	PatientEO findByEmail(String email);
	

}
