package backend.medicalservice.Appointments.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.Appointments.entities.AppointmentEO;

/**
 * Repository interface for managing appointment entities in the medical service application.
 */
public interface AppointmentRepository extends MongoRepository<AppointmentEO, String>{
	
	/**
     * Find appointments with a specific status.
     *
     * @param status The status of the appointments to find.
     * @return A list of appointment entities with the specified status.
     */
	List<AppointmentEO> findByStatus(String status);
	
	/**
     * Find appointments with a specific status and associated with a particular doctor's email.
     *
     * @param doctorEmail The email of the doctor.
     * @param status The status of the appointments to find.
     * @return A list of appointment entities associated with the doctor's email and having the specified status.
     */
	List<AppointmentEO> findByDoctorEmailAndStatus(String doctorEmail, String status);
	
	/**
     * Find appointments with a specific status and associated with a particular patient's email.
     *
     * @param patientEmail The email of the patient.
     * @param status The status of the appointments to find.
     * @return A list of appointment entities associated with the patient's email and having the specified status.
     */
	List<AppointmentEO> findByPatientEmailAndStatus(String patientEmail, String status);
	
	/**
     * Find appointments associated with a specific patient's email.
     *
     * @param patientEmail The email of the patient.
     * @return A list of appointment entities associated with the patient's email.
     */
	List<AppointmentEO> findByPatientEmail(String patientEmail);
	
}
