package training.iqgateway.springboot.SpringBootactuator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello User!";
	}
	
}
