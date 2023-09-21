package backend.medicalservice.AdminClerk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.medicalservice.AdminClerk.entities.FeedbackEO;
import backend.medicalservice.AdminClerk.services.FeedbackService;

/**
 * Controller class handling feedback-related operations.
 */
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired FeedbackService feedbackServiceRef;
	
	/**
     * Fetches all feedback entries from the database.
     *
     * @return A list of FeedbackEO objects representing all feedback entries.
     */
	@GetMapping("/allFeedbacks")
	public List<FeedbackEO> fetchAllfeedbacks(){
		return feedbackServiceRef.feedbackList();
	}
	
	/**
     * Adds a new feedback entry to the database.
     *
     * @param feedback The FeedbackEO object representing the feedback entry to be added.
     */
	@PostMapping("/addFeedback")
	public void addFeedback(@RequestBody FeedbackEO feedback){
		feedbackServiceRef.addFeedback(feedback);
	}
}
