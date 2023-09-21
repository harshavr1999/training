package training.iqgateway.business.impl;

import training.iqgateway.business.ClerkOperations;
import training.iqgateway.entity.OffenceDetailsEO;

public class ClerkOperationsImpl implements ClerkOperations {
	
	public ClerkOperationsImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public OffenceDetailsEO getOffenceDetailsRef() {
		return offenceDetailsRef;
	}


	public void setOffenceDetailsRef(OffenceDetailsEO offenceDetailsRef) {
		this.offenceDetailsRef = offenceDetailsRef;
	}


	public ClerkOperationsImpl(OffenceDetailsEO offenceDetailsRef) {
		super();
		this.offenceDetailsRef = offenceDetailsRef;
	}

	public OffenceDetailsEO offenceDetailsRef; 
	
	@Override
	public Integer addOffenceToVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Offence added to "+offenceDetailsRef.getVehicleNumber());
		return null;
	}

	@Override
	public Integer clearOffence() {
		// TODO Auto-generated method stub
		System.out.println("Offence cleared to "+offenceDetailsRef.getVehicleNumber());
		return null;
	}

	@Override
	public Void reportGeneration() {
		// TODO Auto-generated method stub
		System.out.println("Report Generated Successfully");
		return null;
	}

}
