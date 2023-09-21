package training.iqgateway.entity;

public class RoleEO {
    private String roleName;
    private String roleDescription;
    
    public RoleEO(){
    }

	public RoleEO(String roleName, String roleDescription) {
		super();
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	@Override
	public String toString() {
		return "RoleEO [roleName=" + roleName + ", roleDescription=" + roleDescription + "]";
	}
    
    
}
