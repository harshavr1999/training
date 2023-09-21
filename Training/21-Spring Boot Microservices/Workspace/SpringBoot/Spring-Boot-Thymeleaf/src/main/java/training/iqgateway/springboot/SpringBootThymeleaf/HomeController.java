package training.iqgateway.springboot.SpringBootThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User givenUser){
		ModelAndView modelAndViewRef = new ModelAndView();
		
		modelAndViewRef.setViewName("user-data");
		modelAndViewRef.addObject("user", givenUser);
		
		return modelAndViewRef;
	}
}
