package backend.medicalservice.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

/**
 * 
 * @author harshavardhan.reddy
 * This is MessageEO entity
 */
public class MessageEO {
	
	@Id
	private String messageId;
	
	@DBRef
	private UserEO sender;
	
	private String content;
	
	private String chat;
	
	@DBRef
	private List<UserEO> readBy;
	
	public MessageEO() {
		// TODO Auto-generated constructor stub
	}

	public MessageEO(String messageId, UserEO sender, String content, String chat, List<UserEO> readBy) {
		super();
		this.messageId = messageId;
		this.sender = sender;
		this.content = content;
		this.chat = chat;
		this.readBy = readBy;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public UserEO getSender() {
		return sender;
	}

	public void setSender(UserEO sender) {
		this.sender = sender;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChat() {
		return chat;
	}

	public void setChat(String chat) {
		this.chat = chat;
	}

	public List<UserEO> getReadBy() {
		return readBy;
	}

	public void setReadBy(List<UserEO> readBy) {
		this.readBy = readBy;
	}

	@Override
	public String toString() {
		return "MessageEO [messageId=" + messageId + ", sender=" + sender + ", content=" + content + ", chat=" + chat
				+ ", readBy=" + readBy + "]";
	}
	
}
