package training.iqgateway.springboot.SpringBootOffence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface OffenceRepository extends CrudRepository<OffenceEO, Integer> {
	@Query("SELECT o FROM OffenceEO o WHERE"
			+ " LOWER(o.offenceType) = LOWER(:givenType)")
	OffenceEO findByOffenceType(@Param("givenType") String gType);
}
