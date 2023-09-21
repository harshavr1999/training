package backend.medicalservice.Appointments.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.medicalservice.Appointments.entities.BillingEO;
import backend.medicalservice.Appointments.repositories.BillingRepository;
import backend.medicalservice.Appointments.services.BillingService;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired BillingRepository billingRepRef;
	
	@Override
	public void addBill(BillingEO bill) {
		// TODO Auto-generated method stub
		billingRepRef.save(bill);
	}

}
