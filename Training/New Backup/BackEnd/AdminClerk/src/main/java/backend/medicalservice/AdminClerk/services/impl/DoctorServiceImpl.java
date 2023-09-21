package backend.medicalservice.AdminClerk.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.AdminClerk.entities.DoctorEO;
import backend.medicalservice.AdminClerk.repositories.DoctorRepository;
import backend.medicalservice.AdminClerk.services.DoctorService;

/**
 * Implementation of the DoctorService interface that provides methods for managing doctor entities.
 */
@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired DoctorRepository doctorRepRef;

	/**
     * Retrieves a list of all doctors.
     *
     * @return A list of DoctorEO objects representing all doctors.
     */
	@Override
	public List<DoctorEO> getAllDoctors() {

		List<DoctorEO> doctorsList = new ArrayList<DoctorEO>();
		doctorRepRef.findAll().forEach(doctorsList::add);
		
		return doctorsList;
	}
	
	/**
     * Adds a new doctor to the system.
     *
     * @param doctor The DoctorEO object representing the doctor to be added.
     */
	@Override
	public void addDoctor(DoctorEO doctor) {
		doctorRepRef.save(doctor);
		
	}

	/**
     * Updates doctor information based on email.
     *
     * @param email The email of the doctor to be updated.
     * @param updatedDoctor The DoctorEO object containing the updated information.
     */
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

	/**
     * Deletes a doctor based on their email.
     *
     * @param email The email of the doctor to be deleted.
     */
	@Override
	public void deleteDoctor(String email) {

		DoctorEO doctor = doctorRepRef.findByEmail(email);
		
		doctorRepRef.delete(doctor);
			
	}

	/**
     * Retrieves a doctor by their email.
     *
     * @param email The email of the doctor to retrieve.
     * @return The DoctorEO object representing the retrieved doctor.
     */
	@Override
	public DoctorEO getDoctorByEmail(String email) {

		DoctorEO doctor = doctorRepRef.findByEmail(email);
		
		return doctor;
	}

	/**
     * Retrieves a list of all email addresses of doctors.
     *
     * @return A list of email addresses belonging to all doctors.
     */
	@Override
	public List<String> allEmails() {
		
		List<DoctorEO> doctors = doctorRepRef.findAll();
		
		List<String> allEmails = doctors.stream().map(DoctorEO::getEmail).collect(Collectors.toList());
		
		return allEmails;
	}

	/**
     * Retrieves a list of doctors based on their department.
     *
     * @param department The department used to filter doctors.
     * @return A list of DoctorEO objects belonging to the specified department.
     */
	@Override
	public List<DoctorEO> getDoctorsByDepartment(String department) {

		List<DoctorEO> doctorsList = doctorRepRef.findByDepartment(department);
		
		return doctorsList;
	}

	/**
     * Retrieves a list of all departments of doctors.
     *
     * @return A list of department names belonging to all doctors.
     */
	@Override
	public List<String> allDepartments() {
		List<DoctorEO> doctors = doctorRepRef.findAll();
		
		List<String> allDepartments = doctors.stream().map(DoctorEO::getDepartment).collect(Collectors.toList());
		return allDepartments;
	}

}
