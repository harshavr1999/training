package backend.medicalservice.AdminClerk.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.AdminClerk.entities.FeedbackEO;
import backend.medicalservice.AdminClerk.repositories.FeedbackRepository;
import backend.medicalservice.AdminClerk.services.FeedbackService;

/**
 * Implementation of the FeedbackService interface that provides methods for managing feedback entities.
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired FeedbackRepository feedbackRepRef;

	/**
     * Adds a new feedback entry to the system.
     *
     * @param feedback The FeedbackEO object representing the feedback to be added.
     */
	@Override
	public void addFeedback(FeedbackEO feedback) {
		// TODO Auto-generated method stub
		feedbackRepRef.save(feedback);
	}

	/**
     * Retrieves a list of all feedback entries.
     *
     * @return A list of FeedbackEO objects representing all feedback entries.
     */
	@Override
	public List<FeedbackEO> feedbackList() {
		// TODO Auto-generated method stub
		List<FeedbackEO> feedbacks = new ArrayList<>();
		feedbackRepRef.findAll().forEach(feedbacks::add);
		
		return feedbacks;
	}
	
}
