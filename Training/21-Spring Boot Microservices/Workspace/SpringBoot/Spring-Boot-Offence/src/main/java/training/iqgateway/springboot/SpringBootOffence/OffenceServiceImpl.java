package training.iqgateway.springboot.SpringBootOffence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffenceServiceImpl implements OffenceService {

	@Autowired
	private OffenceRepository offenceRepRef;
	
	@Override
	public List<OffenceEO> getAllOffences() {
		// TODO Auto-generated method stub
		List<OffenceEO> offenceList = new ArrayList<>();
		offenceRepRef.findAll().forEach(offenceList::add);
		return offenceList;
	}

	@Override
	public void addOffence(OffenceEO offenceEO) {
		// TODO Auto-generated method stub
		
		offenceRepRef.save(offenceEO);

	}

	@Override
	public OffenceEO getOffenceByType(String gType) {
		// TODO Auto-generated method stub
		OffenceEO offenceEORef = offenceRepRef.findByOffenceType(gType);
		return offenceEORef;
	}

}
