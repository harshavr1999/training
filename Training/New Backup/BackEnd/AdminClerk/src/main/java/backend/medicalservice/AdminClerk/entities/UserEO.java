package backend.medicalservice.AdminClerk.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing a user in the system.
 */
@Document(collection="users")
public class UserEO {

	/**
     * The unique identifier for the user.
     */
	@Id
	private String id;
	
	/**
     * The email address of the user.
     */
	private String email;
	
	/**
     * The password associated with the user's account.
     */
	private String password;
	
	/**
     * The role name of the user in the system.
     */
	private String roleName;
	
	/**
     * Default constructor for the UserEO class.
     */
	public UserEO() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Parameterized constructor for the UserEO class.
     *
     * @param id The unique identifier for the user.
     * @param email The email address of the user.
     * @param password The password associated with the user's account.
     * @param roleName The role name or designation of the user in the system.
     */
	public UserEO(String id, String email, String password, String roleName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.roleName = roleName;
	}

	/**
     * Retrieves the unique identifier of the user.
     *
     * @return The unique identifier of the user.
     */
	public String getId() {
		return id;
	}

	/**
     * Sets the unique identifier of the user.
     *
     * @param id The unique identifier to be set for the user.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Retrieves the email of the user.
     *
     * @return The email of the user.
     */
	public String getEmail() {
		return email;
	}

	/**
     * Sets the email of the user.
     *
     * @param email The email to be set for the user.
     */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * Retrieves the password associated with the user's account.
     *
     * @return The password of the user's account.
     */
	public String getPassword() {
		return password;
	}

	/**
     * Sets the password for the user's account.
     *
     * @param password The password to be set for the user's account.
     */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
     * Retrieves the role name of the user in the system.
     *
     * @return The role name of the user.
     */
	public String getRoleName() {
		return roleName;
	}

	/**
     * Sets the role name of the user in the system.
     *
     * @param roleName The role name to be set for the user.
     */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
     * Generates a string representation of the UserEO object.
     *
     * @return A string representation of the UserEO object.
     */
	@Override
	public String toString() {
		return "UserEO [id=" + id + ", email=" + email + ", password=" + password + ", roleName=" + roleName + "]";
	}	
	
	
}
