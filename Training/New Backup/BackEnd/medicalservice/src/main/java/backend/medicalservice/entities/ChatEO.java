package backend.medicalservice.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

/**
 * 
 * @author harshavardhan.reddy
 * This is an chatEO entity 
 */

@Document(collection="chats")
public class ChatEO {

	@Id
	private String chatId;
	private String chatName;
	
	@DBRef
	private List<UserEO> users;
	
	@DBRef
	private MessageEO latestMessage;
	
	//timestamp
	
	public ChatEO() {
		// TODO Auto-generated constructor stub
	}

	public ChatEO(String chatId, String chatName, List<UserEO> users, MessageEO latestMessage) {
		super();
		this.chatId = chatId;
		this.chatName = chatName;
		this.users = users;
		this.latestMessage = latestMessage;
	}

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getChatName() {
		return chatName;
	}

	public void setChatName(String chatName) {
		this.chatName = chatName;
	}

	public List<UserEO> getUsers() {
		return users;
	}

	public void setUsers(List<UserEO> users) {
		this.users = users;
	}

	public MessageEO getLatestMessage() {
		return latestMessage;
	}

	public void setLatestMessage(MessageEO latestMessage) {
		this.latestMessage = latestMessage;
	}

	@Override
	public String toString() {
		return "ChatEO [chatId=" + chatId + ", chatName=" + chatName + ", users=" + users + ", latestMessage="
				+ latestMessage + "]";
	}
	
	
}
