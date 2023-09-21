package backend.medicalservice.AdminClerk.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.AdminClerk.entities.DoctorEO;
import backend.medicalservice.AdminClerk.repositories.DoctorRepository;
import backend.medicalservice.AdminClerk.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired DoctorRepository doctorRepRef;

	@Override
	public List<DoctorEO> getAllDoctors() {

		List<DoctorEO> doctorsList = new ArrayList<DoctorEO>();
		doctorRepRef.findAll().forEach(doctorsList::add);
		
		return doctorsList;
	}

	@Override
	public void addDoctor(DoctorEO doctor) {
		doctorRepRef.save(doctor);
		
	}

	@Override
	public void updateDoctorByEmail(String email, DoctorEO updatedDoctor) {

		DoctorEO doctor = doctorRepRef.findByEmail(email);
		
		doctor.setFirstName(updatedDoctor.getFirstName());
		doctor.setLastName(updatedDoctor.getLastName());
		doctor.setDateOfBirth(updatedDoctor.getDateOfBirth());
		doctor.setMobileNo(updatedDoctor.getMobileNo());
		doctor.setGender(updatedDoctor.getGender());
		doctor.setQualification(updatedDoctor.getQualification());
		doctor.setExperience(updatedDoctor.getExperience());
		doctor.setDepartment(updatedDoctor.getDepartment());
		
		doctorRepRef.save(doctor);
		
	}

	@Override
	public void deleteDoctor(String email) {

		DoctorEO doctor = doctorRepRef.findByEmail(email);
		
		doctorRepRef.delete(doctor);
			
	}

	@Override
	public DoctorEO getDoctorByEmail(String email) {

		DoctorEO doctor = doctorRepRef.findByEmail(email);
		
		return doctor;
	}

	@Override
	public List<String> allEmails() {
		
		List<DoctorEO> doctors = doctorRepRef.findAll();
		
		List<String> allEmails = doctors.stream().map(DoctorEO::getEmail).collect(Collectors.toList());
		
		return allEmails;
	}

	@Override
	public List<DoctorEO> getDoctorsByDepartment(String department) {

		List<DoctorEO> doctorsList = doctorRepRef.findByDepartment(department);
		
		return doctorsList;
	}

	@Override
	public List<String> allDepartments() {
		List<DoctorEO> doctors = doctorRepRef.findAll();
		
		List<String> allDepartments = doctors.stream().map(DoctorEO::getDepartment).collect(Collectors.toList());
		return allDepartments;
	}

}
