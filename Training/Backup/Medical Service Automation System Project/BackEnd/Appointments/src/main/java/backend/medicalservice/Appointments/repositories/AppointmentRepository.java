package backend.medicalservice.Appointments.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.Appointments.entities.AppointmentEO;

public interface AppointmentRepository extends MongoRepository<AppointmentEO, String>{
	List<AppointmentEO> findByStatus(String status);
	
	List<AppointmentEO> findByDoctorEmailAndStatus(String doctorEmail, String status);
	
	List<AppointmentEO> findByPatientEmailAndStatus(String patientEmail, String status);
	
	List<AppointmentEO> findByPatientEmail(String patientEmail);
	
	
}
