package backend.medicalservice.Appointments.services;

import java.util.List;
import java.util.Optional;

import backend.medicalservice.Appointments.entities.AppointmentEO;

public interface AppointmentService {
	
	public List<AppointmentEO> getAllAppointments();
	
	public List<AppointmentEO> getAppointmentsByStatus(String status);
	
	public List<AppointmentEO> getAppointmentByDoctorEmailAndStatus(String doctorEmail, String status);

	public List<AppointmentEO> getAppointmentByPatientEmailAndStatus(String patientEmail, String status);
	
	public void updateAppointment(String id, String newStatus);
	
	public List<AppointmentEO> getAppointmentsByPatientEmail(String patientEmail);
	
	public void addAppointment(AppointmentEO appointment);
}
