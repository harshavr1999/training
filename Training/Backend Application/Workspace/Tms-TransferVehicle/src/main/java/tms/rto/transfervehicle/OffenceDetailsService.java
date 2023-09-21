package tms.rto.transfervehicle;

import java.util.List;

public interface OffenceDetailsService {
	
	
	public List<OffenceDetailsEO> findById(String vehicleNum);

}
