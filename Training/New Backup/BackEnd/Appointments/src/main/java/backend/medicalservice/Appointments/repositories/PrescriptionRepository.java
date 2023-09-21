package backend.medicalservice.Appointments.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.Appointments.entities.PrescriptionEO;

/**
 * Repository interface for managing prescription entities in the medical service application.
 */
public interface PrescriptionRepository extends MongoRepository<PrescriptionEO, String>{
	
	/**
     * Find a prescription entity by its file name.
     *
     * @param fileName The name of the prescription file.
     * @return The prescription entity with the given file name, or null if not found.
     */
	PrescriptionEO findByFileName(String fileName);
	
	/**
     * Find all prescription entities associated with a specific patient's email.
     *
     * @param patientEmail The email of the patient.
     * @return A list of prescription entities associated with the patient's email.
     */
	List<PrescriptionEO> findByPatientEmail(String patientEmail);
	
}
