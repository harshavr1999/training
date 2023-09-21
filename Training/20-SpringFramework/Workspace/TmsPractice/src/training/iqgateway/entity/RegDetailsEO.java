package training.iqgateway.entity;

import java.sql.Date;

public class RegDetailsEO {
    private String vehicleNumber;
    private Date regDate;
    private Integer ownerID;
    private Integer vehicleID;
    private String distributorName;
      
    public RegDetailsEO(){
    }

	public RegDetailsEO(String vehicleNumber, Date regDate, Integer ownerID, Integer vehicleID,
			String distributorName) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.regDate = regDate;
		this.ownerID = ownerID;
		this.vehicleID = vehicleID;
		this.distributorName = distributorName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Integer getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(Integer ownerID) {
		this.ownerID = ownerID;
	}

	public Integer getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(Integer vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	@Override
	public String toString() {
		return "RegDetailsEO [vehicleNumber=" + vehicleNumber + ", regDate=" + regDate + ", ownerID=" + ownerID
				+ ", vehicleID=" + vehicleID + ", distributorName=" + distributorName + "]";
	}
    
    
}
