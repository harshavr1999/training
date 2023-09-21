package tms.rto.Vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface VehicleRepository extends CrudRepository<VehicleEO, Integer>{
	@Query("SELECT o FROM VehicleEO o WHERE"
			+ " (o.vehicleId) = (:givenId)")
	VehicleEO findByVehicleId(@Param("givenId") Integer givenId);
	
	@Query("SELECT vehicleId FROM VehicleEO")
	List<Integer> allVehicleIds();
}
