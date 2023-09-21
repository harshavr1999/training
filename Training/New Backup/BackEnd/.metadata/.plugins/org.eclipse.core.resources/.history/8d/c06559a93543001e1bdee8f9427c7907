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

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired PrescriptionService prescriptionServiceRef;
	
	@PostMapping("/upload")
	public String uploadDocument(@RequestParam("patientEmail") String patientEmail,@RequestParam("file") MultipartFile file){
		return prescriptionServiceRef.uploadDocument(patientEmail, file);
	}
	
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
	
	@GetMapping("/fileNames/{patientEmail}")
	public List<String> fetchAllFileNames(@PathVariable("patientEmail") String patientEmail){
		return prescriptionServiceRef.fileNamesByEmail(patientEmail);
	}
}
