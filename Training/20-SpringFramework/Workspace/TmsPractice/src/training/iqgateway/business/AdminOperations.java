package training.iqgateway.business;

public interface AdminOperations {
	
	// User 
	public Integer addUser();
	public Integer modifyUser();
	public Integer removeUser();
	public String allUsers();
	
	// Role
	public Integer addRole();
	public Integer modifyRole();
	public Integer removeRole();
	public String allRoles();
	
}
