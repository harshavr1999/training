package training.iqgateway.springboot.SpringBootOffence;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOffenceApplication implements CommandLineRunner {
	
	@Autowired
	OffenceService offenceServiceRef;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOffenceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		OffenceEO offenceEO = new OffenceEO(3,"Tripple Riding",500,"Two Wheeler");
//		
//		offenceServiceRef.addOffence(offenceEO);
//		
		List<OffenceEO> offenceList = offenceServiceRef.getAllOffences();
		
		for (Iterator iterator = offenceList.iterator(); iterator.hasNext();) {
			OffenceEO offenceListEO = (OffenceEO) iterator.next();
			System.out.println(offenceListEO);
		}
		
	}

}
