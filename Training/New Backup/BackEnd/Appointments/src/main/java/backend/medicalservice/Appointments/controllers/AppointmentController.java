package backend.medicalservice.Appointments.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.medicalservice.Appointments.entities.AppointmentEO;
import backend.medicalservice.Appointments.entities.UpdateStatusRequest;
import backend.medicalservice.Appointments.services.AppointmentService;

/**
 * Controller class for managing appointment-related operations.
 */
@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	
	@Autowired AppointmentService appointmentServiceRef;
	
	/**
     * Retrieves a list of appointments for a specific doctor and status.
     *
     * @param doctorEmail The email of the doctor for whom to retrieve appointments.
     * @param status The status of the appointments to be retrieved.
     * @return A list of AppointmentEO objects matching the criteria.
     */
	@GetMapping("/getAppointmentsForDoctor")
	public List<AppointmentEO> getAppointmentsForDoctor(@RequestParam String doctorEmail,@RequestParam String status){
		return appointmentServiceRef.getAppointmentByDoctorEmailAndStatus(doctorEmail, status);
	}
	
	/**
     * Retrieves a list of appointments for a specific patient and status.
     *
     * @param patientEmail The email of the patient for whom to retrieve appointments.
     * @param status The status of the appointments to be retrieved.
     * @return A list of AppointmentEO objects matching the criteria.
     */
	@GetMapping("/getAppointmentsForPatient")
	public List<AppointmentEO> getAppointmentsForPatient(@RequestParam String patientEmail,@RequestParam String status){
		return appointmentServiceRef.getAppointmentByPatientEmailAndStatus(patientEmail, status);
	}
	
	/**
     * Updates the status of an appointment.
     *
     * @param id The ID of the appointment to be updated.
     * @param request The UpdateStatusRequest object containing the new status.
     */
	@PutMapping("/updateStatus/{id}")
	public void updateStatus(@PathVariable("id") String id, @RequestBody UpdateStatusRequest request){
		appointmentServiceRef.updateAppointment(id, request.getStatus());
	}
	
	/**
     * Retrieves a list of appointments for a specific patient's email.
     *
     * @param patientEmail The email of the patient for whom to retrieve appointments.
     * @return A list of AppointmentEO objects associated with the patient.
     */
	@GetMapping("/appointmentByPatientEmail/{patientEmail}")
	public List<AppointmentEO> getAppointmentsByPatientEmail(@PathVariable("patientEmail") String patientEmail){
		return appointmentServiceRef.getAppointmentsByPatientEmail(patientEmail);
	}
	
	/**
     * Adds a new appointment.
     *
     * @param appointment The AppointmentEO object representing the appointment to be added.
     */
	@PostMapping("/addAppointment")
	public void addAppointment(@RequestBody AppointmentEO appointment){
		appointmentServiceRef.addAppointment(appointment);
	}
	
}
