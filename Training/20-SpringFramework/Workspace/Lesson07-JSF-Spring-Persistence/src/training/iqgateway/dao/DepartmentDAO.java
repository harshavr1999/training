package training.iqgateway.dao;

import java.util.List;

import training.iqgateway.entities.DepartmentEO;

public interface DepartmentDAO {

    public Integer insertDepartment(DepartmentEO deptEORef);

    public void updateDepartment(DepartmentEO deptEORef);

    public void deleteDepartment(Integer deptId);

    public DepartmentEO findDepartmentByID(Integer deptId);

    public List<DepartmentEO> findAll();

    public List<DepartmentEO> findAllDepartmentsByLocation(Integer LocationId);

 

}
