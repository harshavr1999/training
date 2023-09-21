package backend.medicalservice.AdminClerk.services;

import java.util.List;

import backend.medicalservice.AdminClerk.entities.UserEO;

/**
 * This service interface defines the operations related to user.
 */
public interface UserService {
	
	/**
     * Retrieve a list of all user entities.
     *
     * @return A list containing all user entities in the system.
     */
	public List<UserEO> getAllUsers();
	
	/**
     * Add a new user entity to the system.
     *
     * @param user The user entity to be added.
     */
	public void addUser(UserEO user);
	
	/**
     * Update an existing user entity using their email address.
     *
     * @param email The email address of the user to be updated.
     * @param updatedUser The updated user entity.
     */
	public void updateUserByEmail(String email,UserEO updatedUser);
	
	/**
     * Delete a user entity using their email address.
     *
     * @param email The email address of the user to be deleted.
     */
	public void deleteUser(String email);
	
	/**
     * Retrieve a user entity using their email address.
     *
     * @param email The email address of the user to retrieve.
     * @return The user entity associated with the provided email, or null if not found.
     */
	public UserEO getUserByEmail(String email);
	
	/**
     * Retrieve a list of email addresses belonging to users with a specific role name.
     *
     * @param roleName The role name for which to retrieve email addresses.
     * @return A list of email addresses associated with users having the provided role name.
     */
	public List<String> emailsByRoleName(String roleName);
	
	/**
     * Validate a user's credentials (email and password).
     *
     * @param email The email address of the user.
     * @param password The user's password.
     * @return The validated user entity if credentials are correct, otherwise null.
     */
	public UserEO validateUser(String email, String password);
	
	

}
