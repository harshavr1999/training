package training.iqgateway.business.impl;

import training.iqgateway.business.CopOperations;
import training.iqgateway.entity.OffenceDetailsEO;

public class CopOperationsImpl implements CopOperations {
	
	public OffenceDetailsEO offenceDetailsRef;
	

	public CopOperationsImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CopOperationsImpl(OffenceDetailsEO offenceDetailsRef) {
		super();
		this.offenceDetailsRef = offenceDetailsRef;
	}

	public OffenceDetailsEO getOffenceDetailsRef() {
		return offenceDetailsRef;
	}

	public void setOffenceDetailsRef(OffenceDetailsEO offenceDetailsRef) {
		this.offenceDetailsRef = offenceDetailsRef;
	}

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

}
