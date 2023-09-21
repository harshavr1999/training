package backend.medicalservice.AdminClerk.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="patient")
public class PatientEO {
	
	@Id
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Long mobileNo;
	private String address;
	private String gender;
	private String insurance;
	private String policyNumber;
	private String aadharNumber;
	
	public PatientEO() {
		// TODO Auto-generated constructor stub
	}

	public PatientEO(String id, String email, String firstName, String lastName, Date dateOfBirth, Long mobileNo,
			String address, String gender, String insurance, String policyNumber, String aadharNumber) {
		super();
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.mobileNo = mobileNo;
		this.address = address;
		this.gender = gender;
		this.insurance = insurance;
		this.policyNumber = policyNumber;
		this.aadharNumber = aadharNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	@Override
	public String toString() {
		return "PatientEO [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", address=" + address + ", gender="
				+ gender + ", insurance=" + insurance + ", policyNumber=" + policyNumber + ", aadharNumber="
				+ aadharNumber + "]";
	}
	
	
}
