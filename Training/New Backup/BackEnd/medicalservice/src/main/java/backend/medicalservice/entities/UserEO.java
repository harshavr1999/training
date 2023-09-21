package backend.medicalservice.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class UserEO {

	@Id
	private String userId;
	private String username;
	private String password;
	private String roleName;
	
	public UserEO() {
		// TODO Auto-generated constructor stub
	}

	public UserEO(String userId, String username, String password, String roleName) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.roleName = roleName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "UserEO [userId=" + userId + ", username=" + username + ", password=" + password + ", roleName="
				+ roleName + "]";
	}
	
	
	
}
