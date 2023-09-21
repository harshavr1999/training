package tms.rto.Registration;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface RegistrationRepository extends CrudRepository<RegistrationEO, Integer>{

	@Query("SELECT vehicleId FROM RegistrationEO o WHERE"
			+ " (o.vehicleNumber) = (:givenNumber)")
	Integer findByVehicleNumber(@Param("givenNumber") String givenNumber);
	
	@Query("SELECT vehicleNumber FROM RegistrationEO")
	List<String> allVehicleNumbers();
	
}
