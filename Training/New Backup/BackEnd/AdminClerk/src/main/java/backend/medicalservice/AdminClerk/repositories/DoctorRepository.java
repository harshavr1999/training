package backend.medicalservice.AdminClerk.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.AdminClerk.entities.DoctorEO;

/**
 * This repository interface provides access to doctor-related data stored in the MongoDB database.
 */
public interface DoctorRepository extends MongoRepository<DoctorEO, String> {

	/**
     * Retrieve a doctor entity by their email address.
     *
     * @param email The email address of the doctor to retrieve.
     * @return The doctor entity associated with the provided email, or null if not found.
     */
	DoctorEO findByEmail(String email);
	
	/**
     * Retrieve a list of doctor entities by their department.
     *
     * @param department The department for which to retrieve doctors.
     * @return A list of doctor entities associated with the provided department.
     */
	List<DoctorEO> findByDepartment(String department);
	
}
