package backend.medicalservice.Appointments.services;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import backend.medicalservice.Appointments.entities.PrescriptionEO;

/**
 * This interface defines the methods for managing prescriptions and related documents.
 */
public interface PrescriptionService {
	
	/**
     * Uploads a prescription document for a specific patient.
     *
     * @param patientEmail The email of the patient associated with the prescription.
     * @param file The prescription document file to be uploaded.
     * @return A message indicating the success or failure of the document upload.
     */
	public String uploadDocument(String patientEmail,MultipartFile file);
	
	/**
     * Retrieves a prescription document by its file name.
     *
     * @param fileName The name of the prescription document file.
     * @return The PrescriptionEO object representing the prescription document, or null if not found.
     */
	public PrescriptionEO getDocumentByFileName(String fileName);
	
	/**
     * Retrieves a list of prescription document file names associated with a patient's email.
     *
     * @param patientEmail The email of the patient whose prescription document file names are to be retrieved.
     * @return A list of prescription document file names.
     */
	public List<String> fileNamesByEmail(String patientEmail);
		
}
