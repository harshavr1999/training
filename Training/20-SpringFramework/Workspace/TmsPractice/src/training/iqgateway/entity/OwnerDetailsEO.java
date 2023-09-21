package training.iqgateway.entity;

public class OwnerDetailsEO {
    private Integer ownerID;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String address;
    private String aadharNumber;
    private String panNumber;
    private String gender;
    
    public OwnerDetailsEO(){
        
    }

	public OwnerDetailsEO(Integer ownerID, String firstName, String lastName, String mobileNumber, String address,
			String aadharNumber, String panNumber, String gender) {
		super();
		this.ownerID = ownerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.gender = gender;
	}

	public Integer getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(Integer ownerID) {
		this.ownerID = ownerID;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "OwnerDetailsEO [ownerID=" + ownerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", aadharNumber=" + aadharNumber
				+ ", panNumber=" + panNumber + ", gender=" + gender + "]";
	}
    
    
}
