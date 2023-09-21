package backend.medicalservice.Appointments.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="billing")
public class BillingEO {
	
	@Id
	private String id;
	private String aadharNumber;
	private String patientName;
	private Long mobileNo;
	private String insurance;
	private String policyNumber;
	private Float totalBill;
	private String paymentMode;
	
	public BillingEO() {
		// TODO Auto-generated constructor stub
	}

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
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

	public Float getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(Float totalBill) {
		this.totalBill = totalBill;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "BillingEO [id=" + id + ", aadharNumber=" + aadharNumber + ", patientName=" + patientName + ", mobileNo="
				+ mobileNo + ", insurance=" + insurance + ", policyNumber=" + policyNumber + ", totalBill=" + totalBill
				+ ", paymentMode=" + paymentMode + "]";
	}
	
	
	
}
