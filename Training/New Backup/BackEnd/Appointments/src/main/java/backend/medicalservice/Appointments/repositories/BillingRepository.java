package backend.medicalservice.Appointments.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend.medicalservice.Appointments.entities.BillingEO;

/**
 * Repository interface for managing billing entities in the medical service application.
 */
public interface BillingRepository extends MongoRepository<BillingEO, String>{

}
