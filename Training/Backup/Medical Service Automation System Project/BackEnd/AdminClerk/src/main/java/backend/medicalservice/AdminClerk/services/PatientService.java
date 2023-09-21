package backend.medicalservice.AdminClerk.services;

import java.util.List;

import backend.medicalservice.AdminClerk.entities.PatientEO;

public interface PatientService {
	
	public List<PatientEO> getAllPatients();
	
	public void addpatient(PatientEO patient);
	
	public void updatePatientByAadharNumber(String aadharNumber, PatientEO updatedPatient);
	
	public void deletePatient(String aadharNumber);
	
	public PatientEO getPatientByAadharNumber(String aadharNumber);
	
	public List<String> allAadharNumber();
	
	public PatientEO getPatientByEmail(String email);

}
