package training.iqgateway.entity;

public class UserEO {
    private String userName;
    
    private String password;
    
    private String roleName;
    
    public UserEO() {
        
    }

	public UserEO(String userName, String password, String roleName) {
		super();
		this.userName = userName;
		this.password = password;
		this.roleName = roleName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
		return "UserEO [userName=" + userName + ", password=" + password + ", roleName=" + roleName + "]";
	}
    
    
}
