package training.iqgateway.springboot.SpringBootValidation;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String>{

}
