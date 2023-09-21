package training.iqgateway.business.impl;

import java.util.List;

import training.iqgateway.business.AdminOperations;
import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;

public class AdminOperationsImpl implements AdminOperations {

	private DepartmentDAO departmentDAORef;
	
	public AdminOperationsImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public AdminOperationsImpl(DepartmentDAO departmentDAORef) {
		super();
		this.departmentDAORef = departmentDAORef;
	}
	
	public DepartmentDAO getDepartmentDAORef() {
		return departmentDAORef;
	}

	public void setDepartmentDAORef(DepartmentDAO departmentDAORef) {
		this.departmentDAORef = departmentDAORef;
	}
	

	public Integer addDepartment(DepartmentEO deptEO) {
		// TODO Auto-generated method stub
		return departmentDAORef.insertDepartment(deptEO);
	}

	public List<DepartmentEO> fetchAllDepartments() {
		// TODO Auto-generated method stub
		return departmentDAORef.findAll();
	}

	public List<DepartmentEO> fetchDepartmentsBasedonLocation(Integer locationId) {
		// TODO Auto-generated method stub
		return departmentDAORef.findAllDepartmentsByLocation(locationId);
	}

}
