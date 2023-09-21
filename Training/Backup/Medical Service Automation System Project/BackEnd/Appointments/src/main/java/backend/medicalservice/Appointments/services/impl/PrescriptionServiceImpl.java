package backend.medicalservice.Appointments.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import backend.medicalservice.Appointments.entities.PrescriptionEO;
import backend.medicalservice.Appointments.repositories.PrescriptionRepository;
import backend.medicalservice.Appointments.services.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired PrescriptionRepository prescriptionRepRef;
	
	@Override
	public String uploadDocument(String patientEmail,MultipartFile file) {
		
		try {
			
			byte[] content = file.getBytes();
			String fileName = file.getOriginalFilename();
			
			PrescriptionEO prescription = new PrescriptionEO();
			
			prescription.setFileName(fileName);
			prescription.setFile(content);
			prescription.setPatientEmail(patientEmail);
			
			prescriptionRepRef.save(prescription);
			
			return "Document uploaded successfully";
			
		} catch (Exception e) {
			return "Failed to upload document.";
		}
		
	}

	@Override
	public PrescriptionEO getDocumentByFileName(String fileName) {
		// TODO Auto-generated method stub
		return prescriptionRepRef.findByFileName(fileName);
	}

	@Override
	public List<String> fileNamesByEmail(String patientEmail) {

		List<PrescriptionEO> prescriptions = prescriptionRepRef.findByPatientEmail(patientEmail);
		
		List<String> fileNames = prescriptions.stream().map(PrescriptionEO::getFileName).collect(Collectors.toList());
		
		return fileNames;
	}

}
