package tms.rto.transfervehicle;


public interface OwnerService {
	
	
	public OwnerEO findByPanCardNo(String PanCard);
	
	
	public OwnerEO findById(Integer ownId);
}
