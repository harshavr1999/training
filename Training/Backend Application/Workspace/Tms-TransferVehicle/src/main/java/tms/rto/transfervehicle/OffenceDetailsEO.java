package tms.rto.transfervehicle;
import java.sql.Blob;
import java.sql.Time;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.MapsId;

import javax.persistence.Table;

//import lombok.Data;
@Entity
@Table(name="TM_OFFENCE_DETAILS")
//@Data
public class OffenceDetailsEO {

//			@MapsId
//			@ManyToOne()
//			@JoinColumn(name = "VEH_NO")
//	    	private RegistrationEO  registrationEO;
	    	 
			@Column(name="VEH_NO")
	    	private String vehicleNumber;
	    	
	    	
		    @Column(name="IMAGE")
		    private Blob image;
		    
		    
		    @Id
		    @Column(name="OFFENCE_DETAIL_ID")
		    private Integer offenceDetailId;

		    
		    @Column(name="OFFENCE_STATUS")
		    private String offenceStatus;

		    @Column(name="OFFENCE_ID")
		    private String offenceId;

		    @Column(name="TIME")
		    private Time  time;

		    @Column(name="PLACE")
		    private String place;

		    @Column(name="REPORTED_BY")
		    private String reportedBY;

		    
		    //No-Arg constructor
		    public OffenceDetailsEO()
		    {
		    	
		    }
		    
		    
		    
		    
		    
			public OffenceDetailsEO(String vehicleNumber, Blob image, Integer offenceDetailId, String offenceStatus,
					String offenceId, Time time, String place, String reportedBY) {
				super();
				this.vehicleNumber = vehicleNumber;
				this.image = image;
				this.offenceDetailId = offenceDetailId;
				this.offenceStatus = offenceStatus;
				this.offenceId = offenceId;
				this.time = time;
				this.place = place;
				this.reportedBY = reportedBY;
			}





			@Override
			public String toString() {
				return "OffenceDetailsEO [vehicleNumber=" + vehicleNumber + ", image=" + image + ", offenceDetailId="
						+ offenceDetailId + ", offenceStatus=" + offenceStatus + ", offenceId=" + offenceId + ", time="
						+ time + ", place=" + place + ", reportedBY=" + reportedBY + "]";
			}





			public String getVehicleNumber() {
				return vehicleNumber;
			}

			public void setVehicleNumber(String vehicleNumber) {
				this.vehicleNumber = vehicleNumber;
			}

			public Blob getImage() {
				return image;
			}

			public void setImage(Blob image) {
				this.image = image;
			}

			public Integer getOffenceDetailId() {
				return offenceDetailId;
			}

			public void setOffenceDetailId(Integer offenceDetailId) {
				this.offenceDetailId = offenceDetailId;
			}

			public String getOffenceStatus() {
				return offenceStatus;
			}

			public void setOffenceStatus(String offenceStatus) {
				this.offenceStatus = offenceStatus;
			}

			public String getOffenceId() {
				return offenceId;
			}

			public void setOffenceId(String offenceId) {
				this.offenceId = offenceId;
			}

			public Time getTime() {
				return time;
			}

			public void setTime(Time time) {
				this.time = time;
			}

			public String getPlace() {
				return place;
			}

			public void setPlace(String place) {
				this.place = place;
			}

			public String getReportedBY() {
				return reportedBY;
			}

			public void setReportedBY(String reportedBY) {
				this.reportedBY = reportedBY;
			}




}
