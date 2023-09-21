package tms.rto.transfervehicle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService{
	
	@Autowired
	private OwnerEORepository ownerRepoRef;

	@Override
	public OwnerEO findByPanCardNo(String PanCard) {
		OwnerEO OwnerDetailsbyPan = ownerRepoRef.findByPanCardNo(PanCard);
		return OwnerDetailsbyPan;
	}

	@Override
	public OwnerEO findById(Integer ownId) {
		OwnerEO OwnerDetailsbyId = ownerRepoRef.findByOwnerId(ownId);
		return OwnerDetailsbyId;
	}


	
}
