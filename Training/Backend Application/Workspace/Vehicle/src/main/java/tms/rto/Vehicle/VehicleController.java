package tms.rto.Vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleServiceRef;
	
	@GetMapping("/allVehicles")
	public List<VehicleEO> fetchAllVehicles(){
		return vehicleServiceRef.getAllVehicles();
	}
	
	@PostMapping("/addVehicle")
	public void addVehicle(@RequestBody VehicleEO vehicleEO){
		vehicleServiceRef.addVehicle(vehicleEO);
	}
	
	@PutMapping("/updateVehicle")
	public void updateVehicle(@RequestBody VehicleEO vehicleEO){
		vehicleServiceRef.updateVehicle(vehicleEO);
	}
	
	@DeleteMapping("/deleteVehicle/{vehicleId}")
	public void deleteVehicle(@PathVariable("vehicleId") Integer vehicleId){
		vehicleServiceRef.deleteVehicle(vehicleId);
	}
	
	@GetMapping("/vehicleById/{vehicleId}")
	public VehicleEO findVehicleByVehicleId(@PathVariable("vehicleId") Integer vehicleId){
		return vehicleServiceRef.getVehicleByVehicleId(vehicleId);
	}
	@GetMapping("/allVehicleIds")
	public List<Integer> fetchAllVehicleIds(){
		return vehicleServiceRef.allVehicleIds();
	}
	
}
