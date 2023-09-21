package backend.medicalservice.AdminClerk.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing feedback provided by patients for doctors.
 */
@Document(collection="feedback")
public class FeedbackEO {
	
	/**
     * The unique identifier for the feedback entry.
     */
	@Id
	private String id;
	
	/**
     * The email address of the doctor receiving the feedback.
     */
	private String doctorEmail;
	
	/**
     * The email address of the patient providing the feedback.
     */
	private String patientEmail;
	
	/**
     * The content of the feedback provided by the patient.
     */
	private String feedback;
	
	/**
    * Default constructor for the FeedbackEO class.
    */
	public FeedbackEO() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Parameterized constructor for the FeedbackEO class.
     *
     * @param id The unique identifier for the feedback entry.
     * @param doctorEmail The email address of the doctor receiving the feedback.
     * @param patientEmail The email address of the patient providing the feedback.
     * @param feedback The content of the feedback provided by the patient.
     */
	public FeedbackEO(String id, String doctorEmail, String patientEmail, String feedback) {
		super();
		this.id = id;
		this.doctorEmail = doctorEmail;
		this.patientEmail = patientEmail;
		this.feedback = feedback;
	}

	/**
     * Retrieves the unique identifier of the feedback entry.
     *
     * @return The unique identifier of the feedback entry.
     */
	public String getId() {
		return id;
	}

	/**
     * Sets the unique identifier of the feedback entry.
     *
     * @param id The unique identifier to be set for the feedback entry.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Retrieves the email address of the doctor receiving the feedback.
     *
     * @return The doctor's email address.
     */
	public String getDoctorEmail() {
		return doctorEmail;
	}

	/**
     * Sets the email address of the doctor receiving the feedback.
     *
     * @param doctorEmail The doctor's email address to be set.
     */
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	/**
     * Retrieves the email address of the patient providing the feedback.
     *
     * @return The patient's email address.
     */
	public String getPatientEmail() {
		return patientEmail;
	}

	/**
     * Sets the email address of the patient providing the feedback.
     *
     * @param patientEmail The patient's email address to be set.
     */
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	/**
     * Retrieves the content of the feedback provided by the patient.
     *
     * @return The feedback content.
     */
	public String getFeedback() {
		return feedback;
	}

	/**
     * Sets the content of the feedback provided by the patient.
     *
     * @param feedback The feedback content to be set.
     */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	/**
     * Generates a string representation of the FeedbackEO object.
     *
     * @return A string representation of the FeedbackEO object.
     */
	@Override
	public String toString() {
		return "FeedbackEO [id=" + id + ", doctorEmail=" + doctorEmail + ", patientEmail=" + patientEmail
				+ ", feedback=" + feedback + "]";
	}
	
	
}
