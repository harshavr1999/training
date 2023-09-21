package backend.medicalservice.Appointments.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import backend.medicalservice.Appointments.entities.PrescriptionEO;
import backend.medicalservice.Appointments.services.PrescriptionService;

/**
 * Controller class for managing prescription-related operations.
 */
@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired PrescriptionService prescriptionServiceRef;
	
	/**
     * Uploads a prescription document for a patient.
     *
     * @param patientEmail The email of the patient associated with the prescription.
     * @param file The MultipartFile containing the prescription document to be uploaded.
     * @return A message indicating the result of the upload.
     */
	@PostMapping("/upload")
	public String uploadDocument(@RequestParam("patientEmail") String patientEmail,@RequestParam("file") MultipartFile file){
		return prescriptionServiceRef.uploadDocument(patientEmail, file);
	}
	
	/**
     * Downloads a prescription document based on its file name.
     *
     * @param fileName The name of the prescription document to be downloaded.
     * @return A ResponseEntity containing the prescription document for download.
     */
	@GetMapping("/download/{fileName}")
	public ResponseEntity<Resource> downloadDocument(@PathVariable("fileName") String fileName){
		PrescriptionEO prescription = prescriptionServiceRef.getDocumentByFileName(fileName);
		
		if(prescription!=null){
			
			Resource resource = new ByteArrayResource(prescription.getFile());
			
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + prescription.getFileName() + "\"")
					.contentType(MediaType.APPLICATION_OCTET_STREAM)
					.contentLength(prescription.getFile().length)
					.body(resource);
		}else{
			return ResponseEntity.notFound().build();
		}
		
	}
	
	/**
     * Fetches a list of all prescription file names associated with a patient's email.
     *
     * @param patientEmail The email of the patient whose prescription file names are to be fetched.
     * @return A list of prescription file names.
     */
	@GetMapping("/fileNames/{patientEmail}")
	public List<String> fetchAllFileNames(@PathVariable("patientEmail") String patientEmail){
		return prescriptionServiceRef.fileNamesByEmail(patientEmail);
	}
}
