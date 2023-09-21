package backend.medicalservice.services;

import java.util.List;

import backend.medicalservice.entities.UserEO;

public interface UserService {
	
	public List<UserEO> getAllUsers();
	
	public List<UserEO> allDoctorsPatients();
	
	public UserEO findByUsername(String Username);
}
