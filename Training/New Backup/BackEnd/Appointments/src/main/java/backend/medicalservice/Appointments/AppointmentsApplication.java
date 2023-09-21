package backend.medicalservice.Appointments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * The main class that initializes and runs the Spring Boot application for the Appointments module.
 */

@SpringBootApplication
public class AppointmentsApplication {

	/**
     * Creates a FilterRegistrationBean for handling Cross-Origin Resource Sharing (CORS).
     *
     * @return The configured FilterRegistrationBean for CORS handling.
     */
	@Bean
    public FilterRegistrationBean simpleCorsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOriginPattern("*");
        config.addAllowedHeader("Authorization");
        config.addAllowedHeader("Content-Type");
        config.addAllowedHeader("Accept");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("OPTIONS");
        config.setMaxAge(3600L);
        
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
//        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }
	
	/**
     * The entry point of the Spring Boot application.
     *
     * @param args The command line arguments passed to the application.
     */
	public static void main(String[] args) {
		SpringApplication.run(AppointmentsApplication.class, args);
	}

}
