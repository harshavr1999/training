package training.iqgateway.dao;

import java.util.List;

import training.iqgateway.entities.DepartmentEO;

public interface DepartmentDAO {
	
	public int insertDepartment(DepartmentEO departmentEORef);
	
	public int updateDepartment(DepartmentEO departmentEORef);
	
	public int deleteDepartment(Integer departmentId);
	
	public DepartmentEO findDepartmentById(Integer departmentId);
	
	public List<DepartmentEO> findAll();
	
}

