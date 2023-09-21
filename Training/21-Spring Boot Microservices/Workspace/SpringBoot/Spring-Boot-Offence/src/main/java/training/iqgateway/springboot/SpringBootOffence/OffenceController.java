package training.iqgateway.springboot.SpringBootOffence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OffenceController {
	
	@Autowired
	private OffenceService offenceŚerviceRef;
	
	@RequestMapping
	public List<OffenceEO> fetchAllOffences(){
		return offenceŚerviceRef.getAllOffences();
	}
	
	@RequestMapping(value="/add-offence", method=RequestMethod.POST)
	public void addOffence(@RequestBody OffenceEO offenceEO){
		offenceŚerviceRef.addOffence(offenceEO);
	}
	
}
