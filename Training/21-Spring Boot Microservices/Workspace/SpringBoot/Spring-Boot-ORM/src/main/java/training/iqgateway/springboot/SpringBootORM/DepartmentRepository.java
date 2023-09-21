package training.iqgateway.springboot.SpringBootORM;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<DepartmentEO, Integer> {

	@Query("SELECT o FROM DepartmentEO o WHERE "
			+ "LOWER(o.departmentName) = LOWER(:givenName)")
	DepartmentEO findByDepartmentName(@Param("givenName") String gName);
	
}
