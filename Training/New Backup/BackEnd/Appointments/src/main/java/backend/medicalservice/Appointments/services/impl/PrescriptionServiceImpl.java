package backend.medicalservice.Appointments.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import backend.medicalservice.Appointments.entities.PrescriptionEO;
import backend.medicalservice.Appointments.repositories.PrescriptionRepository;
import backend.medicalservice.Appointments.services.PrescriptionService;


/**
 * Implementation of the PrescriptionService interface that provides methods for managing prescription documents.
 */
@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired PrescriptionRepository prescriptionRepRef;
	
	/**
     * Uploads a prescription document for a specific patient.
     *
     * @param patientEmail The email of the patient associated with the prescription.
     * @param file The prescription document file to be uploaded.
     * @return A message indicating the success or failure of the document upload.
     */
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

	/**
     * Retrieves a prescription document by its file name.
     *
     * @param fileName The name of the prescription document file.
     * @return The PrescriptionEO object representing the prescription document, or null if not found.
     */
	@Override
	public PrescriptionEO getDocumentByFileName(String fileName) {
		// TODO Auto-generated method stub
		return prescriptionRepRef.findByFileName(fileName);
	}

	/**
     * Retrieves a list of prescription document file names associated with a patient's email.
     *
     * @param patientEmail The email of the patient whose prescription document file names are to be retrieved.
     * @return A list of prescription document file names.
     */
	@Override
	public List<String> fileNamesByEmail(String patientEmail) {

		List<PrescriptionEO> prescriptions = prescriptionRepRef.findByPatientEmail(patientEmail);
		
		List<String> fileNames = prescriptions.stream().map(PrescriptionEO::getFileName).collect(Collectors.toList());
		
		return fileNames;
	}

}
