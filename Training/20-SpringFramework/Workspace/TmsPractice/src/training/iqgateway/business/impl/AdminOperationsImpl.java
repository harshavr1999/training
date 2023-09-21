package training.iqgateway.business.impl;


import training.iqgateway.business.AdminOperations;
import training.iqgateway.entity.RoleEO;
import training.iqgateway.entity.UserEO;

public class AdminOperationsImpl implements AdminOperations {

	public RoleEO roleEORef;
	public UserEO userEORef;
	
	public RoleEO getRoleEORef() {
		return roleEORef;
	}

	public void setRoleEORef(RoleEO roleEORef) {
		this.roleEORef = roleEORef;
	}

	public UserEO getUserEORef() {
		return userEORef;
	}

	public void setUserEORef(UserEO userEORef) {
		this.userEORef = userEORef;
	}

	public AdminOperationsImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Integer addUser() {
		// TODO Auto-generated method stub
		System.out.println(userEORef.getUserName()+ " is added ");
		return null;
	}

	@Override
	public Integer modifyUser() {
		// TODO Auto-generated method stub
		System.out.println(userEORef.getUserName()+ " is modified ");
		return null;
	}

	@Override
	public Integer removeUser() {
		// TODO Auto-generated method stub
		System.out.println(userEORef.getUserName()+ " is deleted ");
		return null;
	}

	@Override
	public String allUsers() {
		// TODO Auto-generated method stub
		return "All Users";
	}

	public AdminOperationsImpl(RoleEO roleEORef, UserEO userEORef) {
		super();
		this.roleEORef = roleEORef;
		this.userEORef = userEORef;
	}

	@Override
	public Integer addRole() {
		// TODO Auto-generated method stub
		System.out.println(roleEORef.getRoleName()+ " role is added ");
		return 1;
	}

	@Override
	public Integer modifyRole() {
		// TODO Auto-generated method stub
		System.out.println(roleEORef.getRoleName() +" role modified");
		return 1;
	}

	@Override
	public Integer removeRole() {
		// TODO Auto-generated method stub
		System.out.println(roleEORef.getRoleName() +" role deleted");
		return 1;
	}

	@Override
	public String allRoles() {
		// TODO Auto-generated method stub
		return "List of roles";
	}

}
