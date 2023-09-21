package backend.medicalservice.AdminClerk.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.AdminClerk.entities.UserEO;
import backend.medicalservice.AdminClerk.repositories.UserRepository;
import backend.medicalservice.AdminClerk.services.UserService;

/**
 * Implementation of the UserService interface that provides methods for managing user entities.
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired UserRepository userRepRef;

	/**
     * Retrieves a list of all users.
     *
     * @return A list of UserEO objects representing all users.
     */
	public List<UserEO> getAllUsers() {
		
		List<UserEO> usersList = new ArrayList<UserEO>();
		userRepRef.findAll().forEach(usersList::add);
		
		return usersList;
	}

	/**
     * Adds a new user to the system.
     *
     * @param user The UserEO object representing the user to be added.
     */
	public void addUser(UserEO user) {
		userRepRef.save(user);
	}

	/**
     * Deletes a user based on their email.
     *
     * @param email The email of the user to be deleted.
     */
	public void deleteUser(String email) {

		UserEO user = userRepRef.findByEmail(email);
		
		userRepRef.delete(user);
		
	}

	/**
     * Updates a user's information based on their email.
     *
     * @param email The email of the user to be updated.
     * @param updatedUser The UserEO object containing the updated information.
     */
	@Override
	public void updateUserByEmail(String email, UserEO updatedUser) {
		// TODO Auto-generated method stub
		UserEO user = userRepRef.findByEmail(email);
		
			user.setPassword(updatedUser.getPassword());
			user.setRoleName(updatedUser.getRoleName());
			
			userRepRef.save(user);
		
	}

	/**
     * Retrieves a user by their email.
     *
     * @param email The email of the user to retrieve.
     * @return The UserEO object representing the retrieved user.
     */
	@Override
	public UserEO getUserByEmail(String email) {
		
		UserEO user = userRepRef.findByEmail(email);
		
		return user;
	}

	/**
     * Retrieves a list of emails belonging to users with a specific role.
     *
     * @param roleName The role name used to filter users.
     * @return A list of email addresses belonging to users with the given role.
     */
	@Override
	public List<String> emailsByRoleName(String roleName) {
		
		List<UserEO> users = userRepRef.findByRoleName(roleName);
		
		List<String> emailsByRole = users.stream().map(UserEO::getEmail).collect(Collectors.toList());
		
		return emailsByRole;
	}

	/**
     * Validates a user's credentials.
     *
     * @param email The email of the user to validate.
     * @param password The password to be validated.
     * @return The UserEO object representing the validated user, or null if validation fails.
     */
	@Override
	public UserEO validateUser(String email, String password) {
		// TODO Auto-generated method stub
		return userRepRef.findByEmail(email);
	}

}
