package tms.rto.transfervehicle;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class OffenceDetailsServiceImpl implements OffenceDetailsService {

	
	@Autowired
	private OffenceDetailsEORepository offenceDetRepoRef;

	@Override
	public List<OffenceDetailsEO> findById(String vehicleNum) {
		
		List<OffenceDetailsEO> offenceList = new ArrayList<>();
		offenceDetRepoRef.findById(vehicleNum).forEach(offenceList::add);
		return offenceList;
	}

	



}
