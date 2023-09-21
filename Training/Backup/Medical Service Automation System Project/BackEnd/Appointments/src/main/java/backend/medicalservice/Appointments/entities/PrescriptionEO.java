package backend.medicalservice.Appointments.entities;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="prescription")
public class PrescriptionEO {
	
	@Id
	private String id;
	private String patientEmail;
	private String fileName;
	private byte[] file;
	
	public PrescriptionEO() {
		// TODO Auto-generated constructor stub
	}

	public PrescriptionEO(String id, String patientEmail, String fileName, byte[] file) {
		super();
		this.id = id;
		this.patientEmail = patientEmail;
		this.fileName = fileName;
		this.file = file;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "PrescriptionEO [id=" + id + ", patientEmail=" + patientEmail + ", fileName=" + fileName + ", file="
				+ Arrays.toString(file) + "]";
	}
	
}
