package backend.medicalservice.Appointments.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.Appointments.entities.AppointmentEO;
import backend.medicalservice.Appointments.repositories.AppointmentRepository;
import backend.medicalservice.Appointments.services.AppointmentService;

/**
 * Implementation of the AppointmentService interface that provides methods for managing medical appointments.
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired AppointmentRepository appointmentRepRef;

	/**
     * Retrieves a list of all appointments.
     *
     * @return A list of AppointmentEO objects representing all appointments in the system.
     */
	@Override
	public List<AppointmentEO> getAllAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Retrieves a list of appointments based on their status.
     *
     * @param status The status of appointments to retrieve (e.g., "scheduled", "completed").
     * @return A list of AppointmentEO objects with the specified status.
     */
	@Override
	public List<AppointmentEO> getAppointmentsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * Retrieves a list of appointments for a specific doctor and status.
     *
     * @param doctorEmail The email of the doctor for whom appointments are to be retrieved.
     * @param status The status of appointments to retrieve.
     * @return A list of AppointmentEO objects for the specified doctor and status.
     */
	@Override
	public List<AppointmentEO> getAppointmentByDoctorEmailAndStatus(String doctorEmail, String status) {
		
		return appointmentRepRef.findByDoctorEmailAndStatus(doctorEmail, status);
	}

	/**
     * Retrieves a list of appointments for a specific patient and status.
     *
     * @param patientEmail The email of the patient for whom appointments are to be retrieved.
     * @param status The status of appointments to retrieve.
     * @return A list of AppointmentEO objects for the specified patient and status.
     */
	@Override
	public List<AppointmentEO> getAppointmentByPatientEmailAndStatus(String patientEmail, String status) {
		// TODO Auto-generated method stub
		return appointmentRepRef.findByPatientEmailAndStatus(patientEmail, status);
	}

	/**
     * Updates the status of an appointment.
     *
     * @param id The ID of the appointment to be updated.
     * @param newStatus The new status to set for the appointment.
     */
	@Override
	public void updateAppointment(String id, String newStatus) {
		
		AppointmentEO appointment = appointmentRepRef.findById(id).orElse(null);
		
		appointment.setStatus(newStatus);
		
		appointmentRepRef.save(appointment);
		
	}

	/**
     * Retrieves a list of appointments for a specific patient.
     *
     * @param patientEmail The email of the patient for whom appointments are to be retrieved.
     * @return A list of AppointmentEO objects for the specified patient.
     */
	@Override
	public List<AppointmentEO> getAppointmentsByPatientEmail(String patientEmail) {
		
		return appointmentRepRef.findByPatientEmail(patientEmail);
	}

	/**
     * Adds a new appointment to the system.
     *
     * @param appointment The AppointmentEO object representing the appointment to be added.
     */
	@Override
	public void addAppointment(AppointmentEO appointment) {
		appointmentRepRef.save(appointment);
	}

}
