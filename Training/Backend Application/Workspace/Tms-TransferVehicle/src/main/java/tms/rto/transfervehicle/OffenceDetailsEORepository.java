package tms.rto.transfervehicle;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface OffenceDetailsEORepository extends CrudRepository<OffenceDetailsEO, Integer> {

	@Query("SELECT  o FROM OffenceDetailsEO o WHERE o.vehicleNumber=:vehicleNumber")
	 List<OffenceDetailsEO> findById(@Param("vehicleNumber")String vehicleNum);

}
