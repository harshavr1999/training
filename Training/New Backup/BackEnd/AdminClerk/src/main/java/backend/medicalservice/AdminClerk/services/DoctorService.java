package backend.medicalservice.AdminClerk.services;

import java.util.List;

import backend.medicalservice.AdminClerk.entities.DoctorEO;

/**
 * This service interface defines the operations related to doctor management.
 */
public interface DoctorService {
	
	/**
     * Retrieve a list of all doctor entities.
     *
     * @return A list containing all doctor entities in the system.
     */
	public List<DoctorEO> getAllDoctors();
	
	/**
     * Add a new doctor entity to the system.
     *
     * @param doctor The doctor entity to be added.
     */
	public void addDoctor(DoctorEO doctor);
	
	/**
     * Update an existing doctor entity using their email address.
     *
     * @param email The email address of the doctor to be updated.
     * @param updatedDoctor The updated doctor entity.
     */
	public void updateDoctorByEmail(String email, DoctorEO updatedDoctor);
	
	/**
     * Delete a doctor entity using their email address.
     *
     * @param email The email address of the doctor to be deleted.
     */
	public void deleteDoctor(String email);
	
	/**
     * Retrieve a doctor entity using their email address.
     *
     * @param email The email address of the doctor to retrieve.
     * @return The doctor entity associated with the provided email, or null if not found.
     */
	public DoctorEO getDoctorByEmail(String email);
	
	/**
     * Retrieve a list of all email addresses belonging to doctors in the system.
     *
     * @return A list of all email addresses associated with doctors.
     */
	public List<String> allEmails();
	
	/**
     * Retrieve a list of doctor entities based on their department.
     *
     * @param department The department for which to retrieve doctors.
     * @return A list of doctor entities associated with the provided department.
     */
	public List<DoctorEO> getDoctorsByDepartment(String department);
	
	/**
     * Retrieve a list of all departments available in the system.
     *
     * @return A list of all department names.
     */
	public List<String> allDepartments();

}
