package backend.medicalservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.entities.MessageEO;

public interface MessageRepository extends MongoRepository<MessageEO, String>{

}
