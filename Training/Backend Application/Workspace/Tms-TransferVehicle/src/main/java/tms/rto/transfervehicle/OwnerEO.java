package tms.rto.transfervehicle;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//import lombok.Data;

	@Entity
	@Table(name="TM_OWNERDETAILS")
	public class OwnerEO {

	    @Id
	    @Column(name="OWNER_ID")
	    private Integer ownerId;

	    @Column(name="FNAME")
	    private String firstName;

	    @Column(name="LNAME")
	    private String lastName;

	    @Column(name="DATEOFBIRTH")
	    private Date dateOfBirth;

	    @Column(name="LANDLINE_NO")
	    private String landlineNo;

	    @Column(name="MOBILE_NO")
	    private String mobileNo;

	    @Column(name="GENDER")
	    private String gender;

	    @Column(name="TEMP_ADDR")
	    private String tempAddr;

	    @Column(name="PERM_ADDR")
	    private String permAddr;

	    @Column(name="PINCODE")
	    private Integer pincode;

	    @Column(name="OCCUPATION")
	    private String occupation;

	    @Column(name="PANCARD_NO")
	    private String pancardNo;

	    @Column(name="AADHAR_NO")
	    private String aadharNo;

	    
	    
	    //No-Arg constructor
	    
	    public OwnerEO()
	    {
	    	
	    }
	    
	    
	    
	    
		public OwnerEO(Integer ownerId, String firstName, String lastName, Date dateOfBirth, String landlineNo,
				String mobileNo, String gender, String tempAddr, String permAddr, Integer pincode, String occupation,
				String pancardNo, String aadharNo) {
			super();
			this.ownerId = ownerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
			this.landlineNo = landlineNo;
			this.mobileNo = mobileNo;
			this.gender = gender;
			this.tempAddr = tempAddr;
			this.permAddr = permAddr;
			this.pincode = pincode;
			this.occupation = occupation;
			this.pancardNo = pancardNo;
			this.aadharNo = aadharNo;
		}




		@Override
		public String toString() {
			return "OwnerEO [ownerId=" + ownerId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", dateOfBirth=" + dateOfBirth + ", landlineNo=" + landlineNo + ", mobileNo=" + mobileNo
					+ ", gender=" + gender + ", tempAddr=" + tempAddr + ", permAddr=" + permAddr + ", pincode="
					+ pincode + ", occupation=" + occupation + ", pancardNo=" + pancardNo + ", aadharNo=" + aadharNo
					+ "]";
		}


		public Integer getOwnerId() {
			return ownerId;
		}

		public void setOwnerId(Integer ownerId) {
			this.ownerId = ownerId;
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

		public String getLandlineNo() {
			return landlineNo;
		}

		public void setLandlineNo(String landlineNo) {
			this.landlineNo = landlineNo;
		}

		public String getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getTempAddr() {
			return tempAddr;
		}

		public void setTempAddr(String tempAddr) {
			this.tempAddr = tempAddr;
		}

		public String getPermAddr() {
			return permAddr;
		}

		public void setPermAddr(String permAddr) {
			this.permAddr = permAddr;
		}

		public Integer getPincode() {
			return pincode;
		}

		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}

		public String getOccupation() {
			return occupation;
		}

		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}

		public String getPancardNo() {
			return pancardNo;
		}

		public void setPancardNo(String pancardNo) {
			this.pancardNo = pancardNo;
		}

		public String getAadharNo() {
			return aadharNo;
		}

		public void setAadharNo(String aadharNo) {
			this.aadharNo = aadharNo;
		}

	}

