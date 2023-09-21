package tms.rto.transfervehicle;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin
@RequestMapping(value="/transfervehicle")
public class HomeController {
	
	@Autowired
	private RegistrationService RegistrationRef;
	
	@Autowired 
	private OffenceDetailsService offenceDetRef;

	@Autowired
	private VehicleService vehicleRef;
	
	@Autowired
	private OwnerService ownerRef;
	
	//@Autowired(required=true)

	
	//To save the details of current owner details, so that we can change ownerId Registartio table.
	
	public OwnerEO currentOwnerDetails;
	

	@GetMapping(value="/{vehicleNumber}")
	public TransferDetails fecthRegistrationsByVehicleNum(@PathVariable("vehicleNumber")String VehNumber)
	{
		
		//Step 1:- Call Registration repository and get Registration details
		RegistrationEO RegDetails=RegistrationRef.fectchDetailsByVehicleNumber(VehNumber);
		
		if(RegDetails ==null)
		{
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "VehicleNumber Doesn't exist");
		}
		else{
		//Step 2 :- Send VehicleNumber as parameter to OffeneceDetails to check to get th vehicl Details
		List<OffenceDetailsEO> offenceDetails= offenceDetRef.findById(RegDetails.getVehicleNumber());
		int count=0;
		for (Iterator<OffenceDetailsEO> iterator = offenceDetails.iterator(); iterator.hasNext();) {
			OffenceDetailsEO offenceDetailsEO = (OffenceDetailsEO) iterator.next();
			if(offenceDetailsEO.getOffenceStatus().equalsIgnoreCase("UNPAID"))
			{
				count++;
			}
		}
		
		
		
			//Return Error message if count >1
			if(count>0)
			{
				throw new ResponseStatusException(HttpStatus.RESET_CONTENT, "Pending Challanes");
			}
			else
			{
				//Step :-3 Get the Vehicle Details 
					//Send Vehicle_id from RegistrationEo object as parameter
				VehicleEO vehicleDetails =vehicleRef.findByvehicleId(RegDetails.getVehicleId());
				//Step :- 4 Get the Owner Details 
					//Send Owner_Id from RegistrationEO object as parameter
	
				OwnerEO ownerDetails=ownerRef.findById(RegDetails.getOwnerId());
			
				//Step :- 5  Create a class called TransferDetails to store all required that shloud be sent to front-end
					//Calling TransferVehicle Class to store final data
				TransferDetails TransferRef =new TransferDetails(vehicleDetails.getVehicleId(),vehicleDetails.getVehicleType(),vehicleDetails.getVehicleColor(),vehicleDetails.getModelNumber(),vehicleDetails.getDateOfManufacture(),vehicleDetails.getManufacturerName(),
				
						 ownerDetails.getOwnerId(),ownerDetails.getFirstName(),ownerDetails.getLastName(),ownerDetails.getTempAddr(),ownerDetails.getPermAddr(),ownerDetails.getMobileNo());
				 
				 return TransferRef;
				}
		}
		 
	}
	
	//This Logic can be integrated with OwnerModule getOwnerById function in future
	@GetMapping("owner/{pancardNo}")
	public OwnerEO getOwnerDetails(@PathVariable("pancardNo")String pancardNo)
	{
		OwnerEO newOwnerDetails=ownerRef.findByPanCardNo(pancardNo);
		if(newOwnerDetails==null)
		{
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Owner Doesn't exist");
		}
		else{
		currentOwnerDetails= newOwnerDetails;
		return newOwnerDetails;
		}
	}
	
	@GetMapping("owner/savedetails/{newOwnerId}")
	public String saveTransferDetails(@PathVariable("newOwnerId")Integer ownId)
	{
		//int ownerId = currentOwnerDetails.getOwnerId();
		RegistrationRef.UpdateTransferDetails(ownId);
		
		return "Success";
	}
}
