package backend.medicalservice.AdminClerk.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing a doctor's information in the system.
 */
@Document(collection="doctor")
public class DoctorEO {
	
	/**
     * The unique identifier for the doctor.
     */
	@Id
	private String id;
	
	/**
     * The email address of the doctor.
     */
	private String email;
	
	/**
     * The first name of the doctor.
     */
	private String firstName;
	
	/**
     * The last name of the doctor.
     */
	private String lastName;
	
	/**
     * The date of birth of the doctor.
     */
	private Date dateOfBirth;
	
	/**
     * The mobile number of the doctor.
     */
	private Long mobileNo;
	
	/**
     * The gender of the doctor.
     */
	private String gender;
	
	/**
     * The qualification of the doctor.
     */
	private String qualification;
	
	/**
     * The number of years of experience of the doctor.
     */
	private Integer experience;
	
	/**
     * The department in which the doctor works.
     */
	private String department;
	
	/**
     * Default constructor for the DoctorEO class.
     */
	public DoctorEO() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Parameterized constructor for the DoctorEO class.
     *
     * @param id The unique identifier for the doctor.
     * @param email The email address of the doctor.
     * @param firstName The first name of the doctor.
     * @param lastName The last name of the doctor.
     * @param dateOfBirth The date of birth of the doctor.
     * @param mobileNo The mobile number of the doctor.
     * @param gender The gender of the doctor.
     * @param qualification The qualification of the doctor.
     * @param experience The number of years of experience of the doctor.
     * @param department The department in which the doctor works.
     */
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

	/**
     * Retrieves the unique identifier of the doctor.
     *
     * @return The unique identifier of the doctor.
     */
	public String getId() {
		return id;
	}
	
	/**
     * Sets the unique identifier of the doctor.
     *
     * @param id The unique identifier to be set for the doctor.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Retrieves the email address of the doctor.
     *
     * @return The email address of the doctor.
     */
	public String getEmail() {
		return email;
	}

	/**
     * Sets the email address of the doctor.
     *
     * @param email The email address to be set for the doctor.
     */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * Retrieves the first name of the doctor.
     *
     * @return The first name of the doctor.
     */
	public String getFirstName() {
		return firstName;
	}

	/**
     * Sets the first name of the doctor.
     *
     * @param firstName The first name to be set for the doctor.
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
     * Retrieves the last name of the doctor.
     *
     * @return The last name of the doctor.
     */
	public String getLastName() {
		return lastName;
	}

	/**
     * Sets the last name of the doctor.
     *
     * @param lastName The last name to be set for the doctor.
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
     * Retrieves the date of birth of the doctor.
     *
     * @return The date of birth of the doctor.
     */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
     * Sets the date of birth of the doctor.
     *
     * @param dateOfBirth The date of birth to be set for the doctor.
     */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
     * Retrieves the mobile number of the doctor.
     *
     * @return The mobile number of the doctor.
     */
	public Long getMobileNo() {
		return mobileNo;
	}

	/**
     * Sets the mobile number of the doctor.
     *
     * @param mobileNo The mobile number to be set for the doctor.
     */
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
     * Retrieves the gender of the doctor.
     *
     * @return The gender of the doctor.
     */
	public String getGender() {
		return gender;
	}

	/**
     * Sets the gender of the doctor.
     *
     * @param gender The gender to be set for the doctor.
     */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
     * Retrieves the qualification of the doctor.
     *
     * @return The qualification of the doctor.
     */
	public String getQualification() {
		return qualification;
	}

	/**
     * Sets the qualification of the doctor.
     *
     * @param qualification The qualification to be set for the doctor.
     */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
     * Retrieves the number of years of experience of the doctor.
     *
     * @return The number of years of experience of the doctor.
     */
	public Integer getExperience() {
		return experience;
	}

	/**
     * Sets the number of years of experience of the doctor.
     *
     * @param experience The number of years of experience to be set for the doctor.
     */
	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	/**
     * Retrieves the department in which the doctor works.
     *
     * @return The department in which the doctor works.
     */
	public String getDepartment() {
		return department;
	}

	/**
     * Sets the department in which the doctor works.
     *
     * @param department The department to be set for the doctor.
     */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
     * Generates a string representation of the DoctorEO object.
     *
     * @return A string representation of the DoctorEO object.
     */
	@Override
	public String toString() {
		return "DoctorEO [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", gender=" + gender + ", qualification="
				+ qualification + ", experience=" + experience + ", department=" + department + "]";
	}
	
	
	

}
