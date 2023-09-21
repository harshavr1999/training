package backend.medicalservice.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.entities.UserEO;
import backend.medicalservice.repositories.UserRepository;
import backend.medicalservice.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepoRef;

	@Override
	public List<UserEO> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepoRef.findAll();
	}

	@Override
	public List<UserEO> allDoctorsPatients() {
		// TODO Auto-generated method stub
		List<UserEO> allUsers = userRepoRef.findAll();
		

		List<UserEO> allDoctorsPatients = allUsers.stream()
                .filter(user -> "Doctor".equals(user.getRoleName()) || "Patient".equals(user.getRoleName()))
                .collect(Collectors.toList());
		
		return allDoctorsPatients;
	}

	@Override
	public UserEO findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepoRef.findByUsername(username);
	}

}
