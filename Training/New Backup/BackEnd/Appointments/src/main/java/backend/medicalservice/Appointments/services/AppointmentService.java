package backend.medicalservice.Appointments.services;

import java.util.List;
import java.util.Optional;

import backend.medicalservice.Appointments.entities.AppointmentEO;

/**
 * This interface defines methods for managing medical appointments.
 */
public interface AppointmentService {
	
	/**
     * Retrieves a list of all appointments.
     *
     * @return A list of AppointmentEO objects representing all appointments in the system.
     */
	public List<AppointmentEO> getAllAppointments();
	
	/**
     * Retrieves a list of appointments based on their status.
     *
     * @param status The status of appointments to retrieve (e.g., "scheduled", "completed").
     * @return A list of AppointmentEO objects with the specified status.
     */
	public List<AppointmentEO> getAppointmentsByStatus(String status);
	
	/**
     * Retrieves a list of appointments for a specific doctor and status.
     *
     * @param doctorEmail The email of the doctor for whom appointments are to be retrieved.
     * @param status The status of appointments to retrieve.
     * @return A list of AppointmentEO objects for the specified doctor and status.
     */
	public List<AppointmentEO> getAppointmentByDoctorEmailAndStatus(String doctorEmail, String status);

	/**
     * Retrieves a list of appointments for a specific patient and status.
     *
     * @param patientEmail The email of the patient for whom appointments are to be retrieved.
     * @param status The status of appointments to retrieve.
     * @return A list of AppointmentEO objects for the specified patient and status.
     */
	public List<AppointmentEO> getAppointmentByPatientEmailAndStatus(String patientEmail, String status);
	
	/**
     * Updates the status of an appointment.
     *
     * @param id The ID of the appointment to be updated.
     * @param newStatus The new status to set for the appointment.
     */
	public void updateAppointment(String id, String newStatus);
	
	/**
     * Retrieves a list of appointments for a specific patient.
     *
     * @param patientEmail The email of the patient for whom appointments are to be retrieved.
     * @return A list of AppointmentEO objects for the specified patient.
     */
	public List<AppointmentEO> getAppointmentsByPatientEmail(String patientEmail);
	
	/**
     * Adds a new appointment to the system.
     *
     * @param appointment The AppointmentEO object representing the appointment to be added.
     */
	public void addAppointment(AppointmentEO appointment);
}
