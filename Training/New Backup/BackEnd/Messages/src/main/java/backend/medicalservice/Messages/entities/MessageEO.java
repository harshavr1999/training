package backend.medicalservice.Messages.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Represents a message entity object that holds information about messages exchanged between users.
 */
@Document(collection="messages")
public class MessageEO {
	
	/**
     * The unique identifier for the message.
     */
	@Id
	private String id;
	
	/**
     * The email address of the sender of the message.
     */
	private String senderEmail;
	
	/**
     * The email address of the receiver of the message.
     */
	private String receiverEmail;
	
	/**
     * The content of the message.
     */
	private String messages;
	
	/**
     * Default constructor for the MessageEO class.
     */
	public MessageEO() {
		// TODO Auto-generated constructor stub
	}

	
	/**
     * Constructs a MessageEO object with the specified parameters.
     *
     * @param id            The unique identifier for the message.
     * @param senderEmail   The email address of the sender of the message.
     * @param receiverEmail The email address of the receiver of the message.
     * @param messages      The content of the message.
     */
	public MessageEO(String id, String senderEmail, String receiverEmail, String messages) {
		super();
		this.id = id;
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
		this.messages = messages;
	}

	/**
     * Retrieves the unique identifier for the message.
     *
     * @return The unique identifier for the message.
     */
	public String getId() {
		return id;
	}

	/**
     * Sets the unique identifier for the message.
     *
     * @param id The unique identifier for the message.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Retrieves the email address of the sender of the message.
     *
     * @return The email address of the sender.
     */
	public String getSenderEmail() {
		return senderEmail;
	}

	/**
     * Sets the email address of the sender of the message.
     *
     * @param senderEmail The email address of the sender.
     */
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	/**
     * Retrieves the email address of the receiver of the message.
     *
     * @return The email address of the receiver.
     */
	public String getReceiverEmail() {
		return receiverEmail;
	}

	/**
     * Sets the email address of the receiver of the message.
     *
     * @param receiverEmail The email address of the receiver.
     */
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	/**
     * Retrieves the content of the message.
     *
     * @return The content of the message.
     */
	public String getMessages() {
		return messages;
	}

	/**
     * Sets the content of the message.
     *
     * @param messages The content of the message.
     */
	public void setMessages(String messages) {
		this.messages = messages;
	}

	/**
     * Returns a string representation of the MessageEO object.
     *
     * @return A string representation of the object.
     */
	@Override
	public String toString() {
		return "MessageEO [id=" + id + ", senderEmail=" + senderEmail + ", receiverEmail=" + receiverEmail
				+ ", messages=" + messages + "]";
	}
	

	
	
}
