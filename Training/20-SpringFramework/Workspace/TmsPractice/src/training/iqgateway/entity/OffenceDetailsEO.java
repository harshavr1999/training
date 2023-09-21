package training.iqgateway.entity;

import java.io.FileInputStream;
import java.sql.Timestamp;

public class OffenceDetailsEO {
    private int offenceDetailsID;
    private String vehicleNumber;
    private int OffenceID;
    private Timestamp offenceDateAndTime;
    private FileInputStream offenceProof;
    private String status;
    private String reportedBy;

    public OffenceDetailsEO(){
        
    }

	public OffenceDetailsEO(int offenceDetailsID, String vehicleNumber, int offenceID, Timestamp offenceDateAndTime,
			FileInputStream offenceProof, String status, String reportedBy) {
		super();
		this.offenceDetailsID = offenceDetailsID;
		this.vehicleNumber = vehicleNumber;
		OffenceID = offenceID;
		this.offenceDateAndTime = offenceDateAndTime;
		this.offenceProof = offenceProof;
		this.status = status;
		this.reportedBy = reportedBy;
	}

	public int getOffenceDetailsID() {
		return offenceDetailsID;
	}

	public void setOffenceDetailsID(int offenceDetailsID) {
		this.offenceDetailsID = offenceDetailsID;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getOffenceID() {
		return OffenceID;
	}

	public void setOffenceID(int offenceID) {
		OffenceID = offenceID;
	}

	public Timestamp getOffenceDateAndTime() {
		return offenceDateAndTime;
	}

	public void setOffenceDateAndTime(Timestamp offenceDateAndTime) {
		this.offenceDateAndTime = offenceDateAndTime;
	}

	public FileInputStream getOffenceProof() {
		return offenceProof;
	}

	public void setOffenceProof(FileInputStream offenceProof) {
		this.offenceProof = offenceProof;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReportedBy() {
		return reportedBy;
	}

	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}

	@Override
	public String toString() {
		return "OffenceDetailsEO [offenceDetailsID=" + offenceDetailsID + ", vehicleNumber=" + vehicleNumber
				+ ", OffenceID=" + OffenceID + ", offenceDateAndTime=" + offenceDateAndTime + ", offenceProof="
				+ offenceProof + ", status=" + status + ", reportedBy=" + reportedBy + "]";
	}
    
    
}
