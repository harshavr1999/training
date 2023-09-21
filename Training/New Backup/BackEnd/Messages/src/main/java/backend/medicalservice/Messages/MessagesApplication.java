package backend.medicalservice.Messages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * The main class for the Messages application. This class is responsible for
 * initializing and running the Spring Boot application.
 */
@SpringBootApplication
public class MessagesApplication {
	
	/**
     * Creates and configures a CORS filter bean. This filter allows cross-origin
     * requests and sets up CORS configuration for the application.
     *
     * @return A FilterRegistrationBean for the CORS filter.
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
     * The main method to start the Messages application.
     *
     * @param args The command line arguments passed to the application.
     */
	public static void main(String[] args) {
		SpringApplication.run(MessagesApplication.class, args);
	}

}
