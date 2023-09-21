package training.iqgateway.business.impl;

import training.iqgateway.business.RtoOperations;
import training.iqgateway.entity.OffenceEO;
import training.iqgateway.entity.OwnerDetailsEO;
import training.iqgateway.entity.RegDetailsEO;
import training.iqgateway.entity.VehicleDetailsEO;

public class RtoOperationsImpl implements RtoOperations {
	
	public VehicleDetailsEO vehicleRef;
	public RegDetailsEO regRef;
	public OwnerDetailsEO ownerRef;
	public OffenceEO offenceRef;

	public RtoOperationsImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RtoOperationsImpl(VehicleDetailsEO vehicleRef, RegDetailsEO regRef, OwnerDetailsEO ownerRef,
			OffenceEO offenceRef) {
		super();
		this.vehicleRef = vehicleRef;
		this.regRef = regRef;
		this.ownerRef = ownerRef;
		this.offenceRef = offenceRef;
	}
	

	public VehicleDetailsEO getVehicleRef() {
		return vehicleRef;
	}

	public void setVehicleRef(VehicleDetailsEO vehicleRef) {
		this.vehicleRef = vehicleRef;
	}

	public RegDetailsEO getRegRef() {
		return regRef;
	}

	public void setRegRef(RegDetailsEO regRef) {
		this.regRef = regRef;
	}

	public OwnerDetailsEO getOwnerRef() {
		return ownerRef;
	}

	public void setOwnerRef(OwnerDetailsEO ownerRef) {
		this.ownerRef = ownerRef;
	}

	public OffenceEO getOffenceRef() {
		return offenceRef;
	}

	public void setOffenceRef(OffenceEO offenceRef) {
		this.offenceRef = offenceRef;
	}

	@Override
	public Integer addVehicleDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer modifyVehicleDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer vehicleRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transferVehicle() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer addOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer modifyOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addOffence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer modifyOffence() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteOffence() {
		// TODO Auto-generated method stub
		return null;
	}

}
