package backend.medicalservice.Appointments.services;

import backend.medicalservice.Appointments.entities.BillingEO;

/**
 * This interface defines methods for managing billing-related operations.
 */
public interface BillingService {
	
	/**
     * Adds a new billing record to the system.
     *
     * @param bill The BillingEO object representing the billing information to be added.
     */
	public void addBill(BillingEO bill);

}
