package backend.medicalservice.AdminClerk.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="doctor")
public class DoctorEO {
	
	@Id
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Long mobileNo;
	private String gender;
	private String qualification;
	private Integer experience;
	private String department;
	
	public DoctorEO() {
		// TODO Auto-generated constructor stub
	}

	public DoctorEO(String id, String email, String firstName, String lastName, Date dateOfBirth, Long mobileNo,
			String gender, String qualification, Integer experience, String department) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.qualification = qualification;
		this.experience = experience;
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "DoctorEO [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", gender=" + gender + ", qualification="
				+ qualification + ", experience=" + experience + ", department=" + department + "]";
	}
	
	
	

}
