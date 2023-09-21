package backend.medicalservice.Appointments.entities;

public class UpdateStatusRequest {

	private String status;
	
	public UpdateStatusRequest() {
		// TODO Auto-generated constructor stub
	}

	public UpdateStatusRequest(String status) {
		super();
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UpdateStatusRequest [status=" + status + "]";
	}
	
	
	
}
