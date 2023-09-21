package backend.medicalservice.AdminClerk.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.medicalservice.AdminClerk.entities.UserEO;
import backend.medicalservice.AdminClerk.services.UserService;
import org.springframework.web.server.ResponseStatusException;

/**
 * Controller class handling user-related operations.
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired UserService userServiceRef;
	@Autowired
	private JwtService jwtService;
	
	/**
     * Fetches all users from the database.
     *
     * @return A list of UserEO objects representing all users.
     */
	@GetMapping("/allUsers")
	public List<UserEO> fetchAllUsers(){
		return userServiceRef.getAllUsers();
	}
	
	 /**
     * Updates a user's information by email.
     *
     * @param email        The email of the user to be updated.
     * @param updatedUser  The updated UserEO object.
     */
	@PutMapping("/updateUser/{email}")
	public void updateUser(@PathVariable("email") String email, @RequestBody UserEO updatedUser){
		userServiceRef.updateUserByEmail(email, updatedUser);
	}
	
	/**
     * Deletes a user by email.
     *
     * @param email  The email of the user to be deleted.
     */
	@DeleteMapping("/deleteUser/{email}")
	public void deleteUser(@PathVariable("email") String email){
		userServiceRef.deleteUser(email);
	}
	
	/**
     * Adds a new user to the database.
     *
     * @param user  The UserEO object representing the user to be added.
     */
	@PostMapping("/addUser")
	public void addUser(@RequestBody UserEO user){
		userServiceRef.addUser(user);
	}
	
	/**
     * Fetches all email addresses of users.
     *
     * @return A list of email addresses.
     */
	@GetMapping("/allEmails")
	public List<String> fetchAllEmails(){
		List<UserEO> users = userServiceRef.getAllUsers();
		List<String> emails = users.stream().map(UserEO::getEmail).collect(Collectors.toList());
		
		return emails;
	}
	
	/**
     * Fetches all roles of users.
     *
     * @return A list of role names.
     */
	@GetMapping("/allRoles")
	public List<String> fetchAllRoles(){
		List<UserEO> users = userServiceRef.getAllUsers();
		List<String> roles = users.stream().map(UserEO::getRoleName).collect(Collectors.toList());
		
		return roles;
	}
	
	/**
     * Finds a user by their email address.
     *
     * @param email  The email address of the user to find.
     * @return The UserEO object representing the found user.
     */
	@GetMapping("/userByEmail/{email}")
	public UserEO findUserByEmail(@PathVariable("email") String email){
		return userServiceRef.getUserByEmail(email);
	}
	
	/**
     * Fetches email addresses of users with a specific role.
     *
     * @param roleName  The role name to filter users by.
     * @return A list of email addresses.
     */

	@GetMapping("/emailsByRole/{roleName}")
	public List<String> fetchEmailsByRole(@PathVariable("roleName") String roleName){
		return userServiceRef.emailsByRoleName(roleName);
	}
	
	/**
     * Validates user login credentials and generates a JWT token.
     *
     * @param user  The UserEO object containing login credentials.
     * @return An ArrayList containing role name and JWT token.
     * @throws ResponseStatusException if user authentication fails.
     */
	@PostMapping("/login")
    public ArrayList<String>  validateLogin(@RequestBody UserEO user) {
    	
    	
    	String token =jwtService.generateToken(user.getEmail());
        UserEO userEo = userServiceRef.validateUser(user.getEmail(), user.getPassword());
        if (userEo.getRoleName() != null && token !=null && userEo.getPassword().equals(user.getPassword())) {
        	ArrayList<String> userdata = new ArrayList<>();
        	userdata.add(userEo.getRoleName());
        	userdata.add(token);
            System.out.println(userdata);
            return userdata;
        } else {
        	throw new ResponseStatusException(HttpStatus.NO_CONTENT, "User Doesn't exist");
        }
}

}
