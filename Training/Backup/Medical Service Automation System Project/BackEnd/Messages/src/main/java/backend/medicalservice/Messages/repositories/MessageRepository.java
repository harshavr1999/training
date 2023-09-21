package backend.medicalservice.Messages.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.Messages.entities.MessageEO;

public interface MessageRepository extends MongoRepository<MessageEO, String>{
	MessageEO findBySenderEmailAndReceiverEmail(String senderEmail, String receiverEmail);
	
	List<MessageEO>  findMessagesBySenderEmailAndReceiverEmail(String senderEmail, String receiverEmail);
	
	List<MessageEO> findBySenderEmail(String senderEmail);

    List<MessageEO> findByReceiverEmail(String receiverEmail);
	
}
