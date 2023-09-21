package backend.medicalservice.Appointments.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.Appointments.entities.BillingEO;
import backend.medicalservice.Appointments.repositories.BillingRepository;
import backend.medicalservice.Appointments.services.BillingService;

/**
 * Implementation of the BillingService interface that provides methods for managing billing-related operations.
 */
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired BillingRepository billingRepRef;
	
	/**
     * Adds a new billing record to the system.
     *
     * @param bill The BillingEO object representing the billing information to be added.
     */
	@Override
	public void addBill(BillingEO bill) {
		// TODO Auto-generated method stub
		billingRepRef.save(bill);
	}

}
