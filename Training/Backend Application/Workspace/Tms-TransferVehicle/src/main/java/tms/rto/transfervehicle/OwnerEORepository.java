package tms.rto.transfervehicle;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface OwnerEORepository extends CrudRepository<OwnerEO, Integer> {

	@Query("SELECT  o FROM OwnerEO o WHERE o.pancardNo=:pancardNo")
	OwnerEO findByPanCardNo(@Param("pancardNo")String panNo);
	

	@Query("SELECT  o FROM OwnerEO o WHERE o.ownerId=:ownerId")
	OwnerEO findByOwnerId(@Param("ownerId")Integer ownId);


}
