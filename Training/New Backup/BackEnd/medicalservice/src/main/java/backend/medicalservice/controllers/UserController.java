package backend.medicalservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.medicalservice.entities.UserEO;
import backend.medicalservice.services.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userServiceRef;
	
	@GetMapping("/allUsers")
	public List<UserEO> fetchAllUsers(){
		return userServiceRef.getAllUsers();
	}
	
	@GetMapping("/allDoctorsPatients")
	public List<UserEO> getAllUsersOfDoctoraPatients(){
		return userServiceRef.allDoctorsPatients();
	}
	
}
