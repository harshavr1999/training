package backend.medicalservice.AdminClerk.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import backend.medicalservice.AdminClerk.entities.PatientEO;

public interface PatientRepository extends MongoRepository<PatientEO, String>{
	
	PatientEO findByAadharNumber(String aadharNumber);
	
	PatientEO findByEmail(String email);
	

}
