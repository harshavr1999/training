package backend.medicalservice.AdminClerk.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.AdminClerk.entities.UserEO;

public interface UserRepository extends MongoRepository<UserEO, String>{
	
	UserEO findByEmail(String email);
	
	List<UserEO> findByRoleName(String roleName);
	
}
