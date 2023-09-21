package training.iqgateway.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import training.iqgateway.entities.DepartmentEO;

public class DepartmentRowMapper implements RowMapper<DepartmentEO> {

	@Override
	public DepartmentEO mapRow(ResultSet rs, int arg1) throws SQLException {
		
		DepartmentEO departmentEORef = new DepartmentEO();
		departmentEORef.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
        departmentEORef.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
        departmentEORef.setManagerId(rs.getInt("MANAGER_ID"));
        departmentEORef.setLocationid(rs.getInt("LOCATION_ID"));
        
        return departmentEORef;
	}

}
