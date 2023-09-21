package training.iqgateway.ratingdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.iqgateway.ratingdataservice.models.Rating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	@RequestMapping("/{userId}")
	public Rating getRating(@PathVariable("userId") String userId){
		
		return new Rating("1", 5);
	}
	
	@RequestMapping("users/{userId}")
	public List<Rating> getUserRating(@PathVariable("userId") String userId){
		List<Rating> ratings = Arrays.asList(
				
				new Rating("1", 4), 
				new Rating("2", 5)

			);
		
		return ratings;
	}
	
}
