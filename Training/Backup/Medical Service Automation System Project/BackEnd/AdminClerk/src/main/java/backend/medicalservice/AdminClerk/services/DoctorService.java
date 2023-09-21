package backend.medicalservice.AdminClerk.services;

import java.util.List;

import backend.medicalservice.AdminClerk.entities.DoctorEO;

public interface DoctorService {
	
	public List<DoctorEO> getAllDoctors();
	
	public void addDoctor(DoctorEO doctor);
	
	public void updateDoctorByEmail(String email, DoctorEO updatedDoctor);
	
	public void deleteDoctor(String email);
	
	public DoctorEO getDoctorByEmail(String email);
	
	public List<String> allEmails();
	
	public List<DoctorEO> getDoctorsByDepartment(String department);
	
	public List<String> allDepartments();

}
