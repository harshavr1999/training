package backend.medicalservice.Appointments.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Entity class representing billing information in the medical service application.
 */
@Document(collection="billing")
public class BillingEO {
	
	/**
     * The unique ID of the billing entry.
     */
	@Id
	private String id;
	
	/**
     * The Aadhar number of the patient associated with the billing entry.
     */
	private String aadharNumber;
	
	/**
     * The name of the patient for whom the billing entry is made.
     */
	private String patientName;
	
	/**
     * The mobile number of the patient.
     */
	private Long mobileNo;
	
	/**
     * The insurance type associated with the billing entry (if applicable).
     */
	private String insurance;
	
	/**
     * The policy number related to the insurance (if applicable).
     */
	private String policyNumber;
	
	/**
     * The total amount of the bill.
     */
	private Float totalBill;
	
	/**
     * The payment mode used for settling the bill (e.g., cash, credit card, etc.).
     */
	private String paymentMode;
	
	
	/**
     * Default constructor for BillingEO class.
     */
	public BillingEO() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Parameterized constructor for BillingEO class.
     * 
     * @param id The ID of the billing entry.
     * @param aadharNumber The Aadhar number of the patient.
     * @param patientName The name of the patient.
     * @param mobileNo The mobile number of the patient.
     * @param insurance The type of insurance associated with the billing entry.
     * @param policyNumber The policy number related to the insurance.
     * @param totalBill The total amount of the bill.
     * @param paymentMode The payment mode used for settling the bill.
     */
	public BillingEO(String id, String aadharNumber, String patientName, Long mobileNo, String insurance,
			String policyNumber, Float totalBill, String paymentMode) {
		super();
		this.id = id;
		this.aadharNumber = aadharNumber;
		this.patientName = patientName;
		this.mobileNo = mobileNo;
		this.insurance = insurance;
		this.policyNumber = policyNumber;
		this.totalBill = totalBill;
		this.paymentMode = paymentMode;
	}

	/**
     * Get the ID of the billing entry.
     * 
     * @return The ID of the billing entry.
     */
	public String getId() {
		return id;
	}

	/**
     * Set the ID of the billing entry.
     * 
     * @param id The ID of the billing entry to set.
     */
	public void setId(String id) {
		this.id = id;
	}

	/**
     * Get the Aadhar number of the patient.
     * 
     * @return The Aadhar number of the patient.
     */
	public String getAadharNumber() {
		return aadharNumber;
	}

	/**
     * Set the Aadhar number of the patient.
     * 
     * @param aadharNumber The Aadhar number of the patient to set.
     */
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	/**
     * Get the name of the patient.
     * 
     * @return The name of the patient.
     */
	public String getPatientName() {
		return patientName;
	}

	 /**
     * Set the name of the patient.
     * 
     * @param patientName The name of the patient to set.
     */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
     * Get the mobile number of the patient.
     * 
     * @return The mobile number of the patient.
     */
	public Long getMobileNo() {
		return mobileNo;
	}

	/**
     * Set the mobile number of the patient.
     * 
     * @param mobileNo The mobile number of the patient to set.
     */
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
     * Get the type of insurance associated with the billing entry.
     * 
     * @return The type of insurance.
     */
	public String getInsurance() {
		return insurance;
	}

	/**
     * Set the type of insurance associated with the billing entry.
     * 
     * @param insurance The type of insurance to set.
     */
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	/**
     * Get the policy number related to the insurance.
     * 
     * @return The policy number.
     */
	public String getPolicyNumber() {
		return policyNumber;
	}

	/**
     * Set the policy number related to the insurance.
     * 
     * @param policyNumber The policy number to set.
     */
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	/**
     * Get the total amount of the bill.
     * 
     * @return The total bill amount.
     */
	public Float getTotalBill() {
		return totalBill;
	}

	/**
     * Set the total amount of the bill.
     * 
     * @param totalBill The total bill amount to set.
     */
	public void setTotalBill(Float totalBill) {
		this.totalBill = totalBill;
	}

	/**
     * Get the payment mode used for settling the bill.
     * 
     * @return The payment mode.
     */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
     * Set the payment mode used for settling the bill.
     * 
     * @param paymentMode The payment mode to set.
     */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
     * Generate a string representation of the BillingEO object.
     * 
     * @return A string representation of the object, including ID, Aadhar number, patient name, mobile number, insurance details, policy number, total bill, and payment mode.
     */
	@Override
	public String toString() {
		return "BillingEO [id=" + id + ", aadharNumber=" + aadharNumber + ", patientName=" + patientName + ", mobileNo="
				+ mobileNo + ", insurance=" + insurance + ", policyNumber=" + policyNumber + ", totalBill=" + totalBill
				+ ", paymentMode=" + paymentMode + "]";
	}
	
	
	
}
