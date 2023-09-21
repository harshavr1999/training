package backend.medicalservice.AdminClerk.services;

import java.util.List;

import backend.medicalservice.AdminClerk.entities.FeedbackEO;

/**
 * This service interface defines the operations related to feedback.
 */
public interface FeedbackService {

	/**
     * Add a new feedback entity to the system.
     *
     * @param feedback The feedback entity to be added.
     */
	public void addFeedback(FeedbackEO feedback);
	
	/**
     * Retrieve a list of all feedback entities.
     *
     * @return A list containing all feedback entities in the system.
     */
	public List<FeedbackEO> feedbackList();
	
}
