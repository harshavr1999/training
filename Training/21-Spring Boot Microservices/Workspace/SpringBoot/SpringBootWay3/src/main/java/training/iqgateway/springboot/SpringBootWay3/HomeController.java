package training.iqgateway.springboot.SpringBootWay3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "Welcome to REST Controller from Spring Boot App";
	}
}
