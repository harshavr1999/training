package backend.medicalservice.Messages.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for Cross-Origin Resource Sharing (CORS) settings.
 * This class configures CORS behavior for the application, allowing
 * or restricting cross-origin requests based on specified rules.
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

	/**
     * Configures Cross-Origin Resource Sharing (CORS) mappings for specific
     * URL patterns in the application.
     *
     * @param registry The CorsRegistry instance used to configure CORS settings.
     */
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
