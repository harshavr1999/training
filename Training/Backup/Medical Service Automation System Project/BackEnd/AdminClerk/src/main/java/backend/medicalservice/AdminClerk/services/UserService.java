package backend.medicalservice.AdminClerk.services;

import java.util.List;

import backend.medicalservice.AdminClerk.entities.UserEO;

public interface UserService {
	
	public List<UserEO> getAllUsers();
	
	public void addUser(UserEO user);
	
	public void updateUserByEmail(String email,UserEO updatedUser);
	
	public void deleteUser(String email);
	
//	public List<String> userEmails();
//	
//	public List<String> getAllRoles();
	
	public UserEO getUserByEmail(String email);
	
	public List<String> emailsByRoleName(String roleName);

}
