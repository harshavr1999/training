package backend.medicalservice.AdminClerk.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.AdminClerk.entities.FeedbackEO;

/**
 * This repository interface provides access to feedback-related data stored in the MongoDB database.
 */
public interface FeedbackRepository extends MongoRepository<FeedbackEO, String>{

}
