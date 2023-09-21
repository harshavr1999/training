package training.iqgateway.springboot.SpringBootMongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface DepartmentRepository extends MongoRepository<DepartmentEO, String> {
	
}
