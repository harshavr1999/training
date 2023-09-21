package backend.medicalservice.AdminClerk.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.AdminClerk.entities.DoctorEO;

public interface DoctorRepository extends MongoRepository<DoctorEO, String> {

	DoctorEO findByEmail(String email);
	
	List<DoctorEO> findByDepartment(String department);
	
}
