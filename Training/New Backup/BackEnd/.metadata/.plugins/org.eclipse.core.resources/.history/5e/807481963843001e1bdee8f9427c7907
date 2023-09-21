package backend.medicalservice.Appointments.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.Appointments.entities.PrescriptionEO;

public interface PrescriptionRepository extends MongoRepository<PrescriptionEO, String>{
	
	PrescriptionEO findByFileName(String fileName);
	
	List<PrescriptionEO> findByPatientEmail(String patientEmail);
	
}
