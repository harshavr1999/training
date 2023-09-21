package backend.medicalservice.AdminClerk.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing a patient's information in the system.
 */
@Document(collection="patient")
public class PatientEO {
	
	/**
     * The unique identifier for the patient.
     */
	@Id
	private String id;
	
	/**
     * The email address of the patient.
     */
	private String email;
	
	/**
     * The first name of the patient.
     */

	private String firstName;
	
	/**
     * The last name of the patient.
     */
	private String lastName;
	
	/**
     * The date of birth of the patient.
     */
	private Date dateOfBirth;
	
	/**
     * The mobile number of the patient.
     */
	private Long mobileNo;
	
	/**
     * The address of the patient.
     */
	private String address;
	
	/**
     * The gender of the patient.
     */
	private String gender;
	
	/**
     * The insurance information of the patient.
     */
	private String insurance;
	
	/**
     * The policy number associated with the patient's insurance.
     */
	private String policyNumber;
	
	/**
     * The Aadhar (unique identification) number of the patient.
     */
	private String aadharNumber;
	
	/**
     * Default constructor for the PatientEO class.
     */
	public PatientEO() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Parameterized constructor for the PatientEO class.
     *
     * @param id The unique identifier for the patient.
     * @param email The email address of the patient.
     * @param firstName The first name of the patient.
     * @param lastName The last name of the patient.
     * @param dateOfBirth The date of birth of the patient.
     * @param mobileNo The mobile number of the patient.
     * @param address The address of the patient.
     * @param gender The gender of the patient.
     * @param insurance The insurance information of the patient.
     * @param policyNumber The policy number associated with the patient's insurance.
     * @param aadharNumber The Aadhar number of the patient.
     */
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

	/**
     * Retrieves the unique identifier of the patient.
     *
     * @return The unique identifier of the patient.
     */
	public String getId() {
		return id;
	}

	
	/**
     * Sets the unique identifier of the patient.
     *
     * @param id The unique identifier to be set for the patient.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Retrieves the email address of the patient.
     *
     * @return The email address of the patient.
     */
	public String getEmail() {
		return email;
	}

	/**
     * Sets the email address of the patient.
     *
     * @param email The email address to be set for the patient.
     */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
     * Retrieves the first name of the patient.
     *
     * @return The first name of the patient.
     */
	public String getFirstName() {
		return firstName;
	}

	/**
     * Sets the first name of the patient.
     *
     * @param firstName The first name to be set for the patient.
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
     * Retrieves the last name of the patient.
     *
     * @return The last name of the patient.
     */
	public String getLastName() {
		return lastName;
	}
	
	/**
     * Sets the last name of the patient.
     *
     * @param lastName The last name to be set for the patient.
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
     * Retrieves the date of birth of the patient.
     *
     * @return The date of birth of the patient.
     */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
     * Sets the date of birth of the patient.
     *
     * @param dateOfBirth The date of birth to be set for the patient.
     */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
     * Retrieves the mobile number of the patient.
     *
     * @return The mobile number of the patient.
     */
	public Long getMobileNo() {
		return mobileNo;
	}

	/**
     * Sets the mobile number of the patient.
     *
     * @param mobileNo The mobile number to be set for the patient.
     */
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
     * Retrieves the address of the patient.
     *
     * @return The address of the patient.
     */
	public String getAddress() {
		return address;
	}

	/**
     * Sets the address of the patient.
     *
     * @param address The address to be set for the patient.
     */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
     * Retrieves the gender of the patient.
     *
     * @return The gender of the patient.
     */
	public String getGender() {
		return gender;
	}

	/**
     * Sets the gender of the patient.
     *
     * @param gender The gender to be set for the patient.
     */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
     * Retrieves the insurance information of the patient.
     *
     * @return The insurance information of the patient.
     */
	public String getInsurance() {
		return insurance;
	}

	/**
     * Sets the insurance information of the patient.
     *
     * @param insurance The insurance information to be set for the patient.
     */
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	/**
     * Retrieves the policy number associated with the patient's insurance.
     *
     * @return The policy number associated with the patient's insurance.
     */
	public String getPolicyNumber() {
		return policyNumber;
	}

	/**
     * Sets the policy number associated with the patient's insurance.
     *
     * @param policyNumber The policy number to be set for the patient's insurance.
     */
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	/**
     * Retrieves the Aadhar number of the patient.
     *
     * @return The Aadhar number of the patient.
     */
	public String getAadharNumber() {
		return aadharNumber;
	}

	/**
     * Sets the Aadhar number of the patient.
     *
     * @param aadharNumber The Aadhar number to be set for the patient.
     */
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	/**
     * Generates a string representation of the PatientEO object.
     *
     * @return A string representation of the PatientEO object.
     */
	@Override
	public String toString() {
		return "PatientEO [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", address=" + address + ", gender="
				+ gender + ", insurance=" + insurance + ", policyNumber=" + policyNumber + ", aadharNumber="
				+ aadharNumber + "]";
	}
	
	
}
