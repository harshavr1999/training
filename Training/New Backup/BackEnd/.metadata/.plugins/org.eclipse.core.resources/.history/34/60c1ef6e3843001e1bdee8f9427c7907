package backend.medicalservice.Appointments.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="appointment")
public class AppointmentEO {
	
	@Id
	private String id;
	private String patientEmail;
	private String doctorEmail;
	private String department;
	private Date date;
	private String time;
	private String status;
	
	public AppointmentEO() {
		// TODO Auto-generated constructor stub
	}

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

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AppointmentEO [id=" + id + ", patientEmail=" + patientEmail + ", doctorEmail=" + doctorEmail
				+ ", department=" + department + ", date=" + date + ", time=" + time + ", status=" + status + "]";
	}
	
	

}
