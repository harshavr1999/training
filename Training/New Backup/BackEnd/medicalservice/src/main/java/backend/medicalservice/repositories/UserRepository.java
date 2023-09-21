package backend.medicalservice.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.entities.UserEO;


public interface UserRepository extends MongoRepository<UserEO, String>{
	UserEO findByUsername(String username);
}
