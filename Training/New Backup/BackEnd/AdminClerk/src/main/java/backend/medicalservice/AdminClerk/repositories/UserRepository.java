package backend.medicalservice.AdminClerk.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.AdminClerk.entities.UserEO;

/**
 * This repository interface provides access to the user-related data stored in the MongoDB database.
 */
public interface UserRepository extends MongoRepository<UserEO, String>{
	
	/**
     * Retrieve a user entity by their email address.
     *
     * @param email The email address of the user to retrieve.
     * @return The user entity associated with the provided email, or null if not found.
     */
	UserEO findByEmail(String email);
	
	/**
     * Retrieve a list of user entities by their role name.
     *
     * @param roleName The name of the role for which to retrieve users.
     * @return A list of user entities associated with the provided role name.
     */
	List<UserEO> findByRoleName(String roleName);
	
}
