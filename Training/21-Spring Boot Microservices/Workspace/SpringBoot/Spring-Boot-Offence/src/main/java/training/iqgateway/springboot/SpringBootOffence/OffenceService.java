package training.iqgateway.springboot.SpringBootOffence;

import java.util.List;

public interface OffenceService {

	public List<OffenceEO> getAllOffences();
	
	public void addOffence(OffenceEO offenceEO);
	
	public OffenceEO getOffenceByType(String gType);
	
}
