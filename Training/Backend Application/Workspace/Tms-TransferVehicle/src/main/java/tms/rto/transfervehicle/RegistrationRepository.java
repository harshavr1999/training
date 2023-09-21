package tms.rto.transfervehicle;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface RegistrationRepository extends CrudRepository<RegistrationEO, String> {
	
	@Query("SELECT  o FROM RegistrationEO o WHERE o.vehicleNumber=:vehicleNumber")
	RegistrationEO findByVehicleId(@Param("vehicleNumber")String vehicleNum);
	
	@Modifying
	@Query("UPDATE RegistrationEO o SET o.OwnerId = :OwnerId")
	Integer UpdateTransferDetails(@Param("OwnerId")Integer ownId);
}
