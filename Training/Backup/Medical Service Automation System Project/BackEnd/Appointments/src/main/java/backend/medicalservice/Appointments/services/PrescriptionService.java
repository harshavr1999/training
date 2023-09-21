package backend.medicalservice.Appointments.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import backend.medicalservice.Appointments.entities.PrescriptionEO;

public interface PrescriptionService {
	
	public String uploadDocument(String patientEmail,MultipartFile file);
	
	public PrescriptionEO getDocumentByFileName(String fileName);
	
	public List<String> fileNamesByEmail(String patientEmail);
	
	
	
}
