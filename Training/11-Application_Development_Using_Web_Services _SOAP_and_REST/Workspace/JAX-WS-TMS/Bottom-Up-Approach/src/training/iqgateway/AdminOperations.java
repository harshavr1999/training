package training.iqgateway;

import javax.jws.WebService;

@WebService
public class AdminOperations {
    public String manageUsers(String username){
        return username;
    }
    public String manageRoles(String roleName){
        return roleName;
    }
}
