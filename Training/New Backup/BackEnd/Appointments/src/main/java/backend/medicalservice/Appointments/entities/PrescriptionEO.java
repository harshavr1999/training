package backend.medicalservice.Appointments.entities;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing a prescription in the medical service application.
 */
@Document(collection="prescription")
public class PrescriptionEO {
	
	/**
     * The unique ID of the prescription.
     */
	@Id
	private String id;
	
	/**
     * The email of the patient associated with this prescription.
     */
	private String patientEmail;
	
	/**
     * The name of the prescription file.
     */
	private String fileName;
	
	/**
     * The binary data of the prescription file.
     */
	private byte[] file;
	
	/**
     * Default constructor for PrescriptionEO class.
     */
	public PrescriptionEO() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Parameterized constructor for PrescriptionEO class.
     * 
     * @param id The ID of the prescription.
     * @param patientEmail The email of the patient associated with the prescription.
     * @param fileName The name of the prescription file.
     * @param file The binary data of the prescription file.
     */
	public PrescriptionEO(String id, String patientEmail, String fileName, byte[] file) {
		super();
		this.id = id;
		this.patientEmail = patientEmail;
		this.fileName = fileName;
		this.file = file;
	}

	/**
     * Get the ID of the prescription.
     * 
     * @return The ID of the prescription.
     */
	public String getId() {
		return id;
	}

	/**
     * Set the ID of the prescription.
     * 
     * @param id The ID of the prescription to set.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Get the email of the patient associated with the prescription.
     * 
     * @return The email of the patient.
     */
	public String getPatientEmail() {
		return patientEmail;
	}

	/**
     * Set the email of the patient associated with the prescription.
     * 
     * @param patientEmail The email of the patient to set.
     */
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	/**
     * Get the name of the prescription file.
     * 
     * @return The name of the prescription file.
     */
	public String getFileName() {
		return fileName;
	}

	/**
     * Set the name of the prescription file.
     * 
     * @param fileName The name of the prescription file to set.
     */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
     * Get the binary data of the prescription file.
     * 
     * @return The binary data of the prescription file.
     */
	public byte[] getFile() {
		return file;
	}

	/**
     * Set the binary data of the prescription file.
     * 
     * @param file The binary data of the prescription file to set.
     */
	public void setFile(byte[] file) {
		this.file = file;
	}

	/**
     * Generate a string representation of the PrescriptionEO object.
     * 
     * @return A string representation of the object, including ID, patient email, file name, and file data.
     */
	@Override
	public String toString() {
		return "PrescriptionEO [id=" + id + ", patientEmail=" + patientEmail + ", fileName=" + fileName + ", file="
				+ Arrays.toString(file) + "]";
	}
	
}
