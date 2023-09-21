package backend.medicalservice.Messages.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
    public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/ws/**") 
        .allowedOrigins("http://localhost:3000") 
        .allowedMethods("POST,GET,DELETE,PUT,OPTIONS") 
        .allowCredentials(true)
        .allowedHeaders("Content-Type,X-Auth-Token,Origin,Authorization")
        .exposedHeaders("Access-Control-Allow-Origin")
        .exposedHeaders("Access-Control-Allow-Methods");
		
    }
	
}
