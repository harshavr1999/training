package backend.medicalservice.Messages.entities;

public class ChatMessage {
	private MessageType type;
	private String message;
	private String sender;
	
	public enum MessageType{
		CHAT,
		JOIN,
		LEAVE
	}
	
	public ChatMessage() {
		// TODO Auto-generated constructor stub
	}

	public ChatMessage(MessageType type, String message, String sender) {
		super();
		this.type = type;
		this.message = message;
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Override
	public String toString() {
		return "ChatMessage [type=" + type + ", message=" + message + ", sender=" + sender + "]";
	}

	
	
	
	
}
