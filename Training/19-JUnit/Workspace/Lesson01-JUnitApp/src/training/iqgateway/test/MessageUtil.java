package training.iqgateway.test;

public class MessageUtil {
	private String message;

	public MessageUtil(String givenMessage) {
		this.message =givenMessage;
	}
	
	public String printMessage(){
		System.out.println(message);
		return this.message;
	}
	
	public String salutationMessage(){
		message = "Hi ! "+message;
		System.out.println(message);
		return message;
	}
}
