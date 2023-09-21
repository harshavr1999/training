package tms.rto.transfervehicle;



import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.Param;

public interface VehicleRepository extends CrudRepository<VehicleEO,Integer> {
	
	@Query("SELECT  o FROM VehicleEO o WHERE o.vehicleId=:vehicleId")
	VehicleEO findByVehicleId(@Param("vehicleId")Integer vehId);


}
