package backend.medicalservice.Appointments.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing an appointment in the medical service application.
 */
@Document(collection="appointment")
public class AppointmentEO {
	
	/**
     * The unique ID of the appointment.
     */
	@Id
	private String id;
	
	/**
     * The email of the patient associated with the appointment.
     */
	private String patientEmail;
	
	/**
     * The email of the doctor associated with the appointment.
     */
	private String doctorEmail;
	
	/**
     * The department to which the doctor and patient belong for this appointment.
     */
	private String department;
	
	/**
     * The date of the appointment.
     */
	private Date date;
	
	/**
     * The time slot for the appointment.
     */
	private String time;
	
	/**
     * The status of the appointment (e.g., scheduled, canceled, etc.).
     */
	private String status;
	
	
	/**
     * Default constructor for AppointmentEO class.
     */
	public AppointmentEO() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Parameterized constructor for AppointmentEO class.
     * 
     * @param id The ID of the appointment.
     * @param patientEmail The email of the patient associated with the appointment.
     * @param doctorEmail The email of the doctor associated with the appointment.
     * @param department The department to which the doctor and patient belong.
     * @param date The date of the appointment.
     * @param time The time slot for the appointment.
     * @param status The status of the appointment.
     */
	public AppointmentEO(String id, String patientEmail, String doctorEmail, String department, Date date, String time,
			String status) {
		super();
		this.id = id;
		this.patientEmail = patientEmail;
		this.doctorEmail = doctorEmail;
		this.department = department;
		this.date = date;
		this.time = time;
		this.status = status;
	}

	/**
     * Get the ID of the appointment.
     * 
     * @return The ID of the appointment.
     */
	public String getId() {
		return id;
	}

	/**
     * Set the ID of the appointment.
     * 
     * @param id The ID of the appointment to set.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Get the email of the patient associated with the appointment.
     * 
     * @return The email of the patient.
     */
	public String getPatientEmail() {
		return patientEmail;
	}

	/**
     * Set the email of the patient associated with the appointment.
     * 
     * @param patientEmail The email of the patient to set.
     */
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	/**
     * Get the email of the doctor associated with the appointment.
     * 
     * @return The email of the doctor.
     */
	public String getDoctorEmail() {
		return doctorEmail;
	}

	/**
     * Set the email of the doctor associated with the appointment.
     * 
     * @param doctorEmail The email of the doctor to set.
     */
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	/**
     * Get the department to which the doctor and patient belong for this appointment.
     * 
     * @return The department of the appointment.
     */
	public String getDepartment() {
		return department;
	}

	/**
     * Set the department to which the doctor and patient belong for this appointment.
     * 
     * @param department The department of the appointment to set.
     */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
     * Get the date of the appointment.
     * 
     * @return The date of the appointment.
     */
	public Date getDate() {
		return date;
	}

	/**
     * Set the date of the appointment.
     * 
     * @param date The date of the appointment to set.
     */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
     * Get the time slot for the appointment.
     * 
     * @return The time slot for the appointment.
     */
	public String getTime() {
		return time;
	}

	/**
     * Set the time slot for the appointment.
     * 
     * @param time The time slot for the appointment to set.
     */
	public void setTime(String time) {
		this.time = time;
	}

	/**
     * Get the status of the appointment.
     * 
     * @return The status of the appointment.
     */
	public String getStatus() {
		return status;
	}

	/**
     * Set the status of the appointment.
     * 
     * @param status The status of the appointment to set.
     */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
     * Generate a string representation of the AppointmentEO object.
     * 
     * @return A string representation of the object, including ID, patient email, doctor email, department, date, time, and status.
     */
	@Override
	public String toString() {
		return "AppointmentEO [id=" + id + ", patientEmail=" + patientEmail + ", doctorEmail=" + doctorEmail
				+ ", department=" + department + ", date=" + date + ", time=" + time + ", status=" + status + "]";
	}
	
	

}
