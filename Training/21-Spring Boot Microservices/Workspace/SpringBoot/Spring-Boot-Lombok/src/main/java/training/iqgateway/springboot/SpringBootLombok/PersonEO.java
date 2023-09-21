package training.iqgateway.springboot.SpringBootLombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonEO {

	private int id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
}
