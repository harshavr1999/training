package backend.medicalservice.Messages.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.Messages.entities.MessageEO;

/**
 * Repository interface for managing message entities in the MongoDB database.
 */
public interface MessageRepository extends MongoRepository<MessageEO, String>{
	
	/**
     * Finds a single message entity by the sender and receiver email addresses.
     *
     * @param senderEmail The email address of the sender.
     * @param receiverEmail The email address of the receiver.
     * @return The message entity matching the provided sender and receiver emails.
     */
	MessageEO findBySenderEmailAndReceiverEmail(String senderEmail, String receiverEmail);
	
	/**
     * Finds a list of message entities by the sender and receiver email addresses.
     *
     * @param senderEmail The email address of the sender.
     * @param receiverEmail The email address of the receiver.
     * @return A list of message entities matching the provided sender and receiver emails.
     */
	List<MessageEO>  findMessagesBySenderEmailAndReceiverEmail(String senderEmail, String receiverEmail);
	
	/**
     * Finds a list of message entities by the sender's email address.
     *
     * @param senderEmail The email address of the sender.
     * @return A list of message entities sent by the provided sender email.
     */
	List<MessageEO> findBySenderEmail(String senderEmail);

	/**
     * Finds a list of message entities by the receiver's email address.
     *
     * @param receiverEmail The email address of the receiver.
     * @return A list of message entities received by the provided receiver email.
     */
    List<MessageEO> findByReceiverEmail(String receiverEmail);
	
}
