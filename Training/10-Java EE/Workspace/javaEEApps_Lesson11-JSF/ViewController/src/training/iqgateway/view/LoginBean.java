package training.iqgateway.view;

public class LoginBean {
    private String username;
    private String password;
    
    public LoginBean(){
        
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String navigate() {
        // Add event code here...
        System.out.println("Action Event is Fired");
        if(username.equals("IQGateway")&&password.equals("1234567")){
            return "success";
        }else{
            return "failure";
        }
    }
}

