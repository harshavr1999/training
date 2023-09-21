package backend.medicalservice.Appointments.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.medicalservice.Appointments.entities.BillingEO;
import backend.medicalservice.Appointments.services.BillingService;

/**
 * Controller class for managing billing-related operations.
 */
@RestController
@RequestMapping("/billing")
public class BillingController {

	@Autowired BillingService billingServiceRef;
	
	/**
     * Adds a new billing record.
     *
     * @param bill The BillingEO object representing the billing record to be added.
     */
	@PostMapping("/addBill")
	public void addNewBill(@RequestBody BillingEO bill){
		billingServiceRef.addBill(bill);
	}
	
}
