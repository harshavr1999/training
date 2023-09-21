package backend.medicalservice.Appointments.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.Appointments.entities.AppointmentEO;
import backend.medicalservice.Appointments.repositories.AppointmentRepository;
import backend.medicalservice.Appointments.services.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired AppointmentRepository appointmentRepRef;

	@Override
	public List<AppointmentEO> getAllAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppointmentEO> getAppointmentsByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppointmentEO> getAppointmentByDoctorEmailAndStatus(String doctorEmail, String status) {
		
		return appointmentRepRef.findByDoctorEmailAndStatus(doctorEmail, status);
	}

	@Override
	public List<AppointmentEO> getAppointmentByPatientEmailAndStatus(String patientEmail, String status) {
		// TODO Auto-generated method stub
		return appointmentRepRef.findByPatientEmailAndStatus(patientEmail, status);
	}



	@Override
	public void updateAppointment(String id, String newStatus) {
		
		AppointmentEO appointment = appointmentRepRef.findById(id).orElse(null);
		
		appointment.setStatus(newStatus);
		
		appointmentRepRef.save(appointment);
		
	}

	@Override
	public List<AppointmentEO> getAppointmentsByPatientEmail(String patientEmail) {
		
		return appointmentRepRef.findByPatientEmail(patientEmail);
	}

	@Override
	public void addAppointment(AppointmentEO appointment) {
		appointmentRepRef.save(appointment);
	}

}
