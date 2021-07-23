package fr.cda.controle.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.VehiculeDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.VehiculeService;



@RestController
public class VehiculeController {
	
	@Autowired
	private VehiculeService vehiculeService;
	
	
	@GetMapping("/vehicule/{imm}")
	public VehiculeDTO getVehicule(@PathVariable("imm") String imm) throws NotFoundException {
		VehiculeDTO vehiculeDTO = vehiculeService.getVehicule(imm);
		return vehiculeDTO;
	}
	
	@GetMapping("/allVehicule")
	public List<VehiculeDTO> getAllVehicule() throws NotFoundException {
		List<VehiculeDTO> listVehiculeDTO = vehiculeService.getAllVehicule();
		return listVehiculeDTO;
	}
	
	
	/* {
		    "immatriculation": "000000044",
		    "proprietaire": "Jo",
		    "date_mis_en_circulation": "2020-03-12",
		    "annee": "2009",
		    "modele": "ES7",
		    "puissance": 93,
		    "carburant": "Ess",
		    "vehiculeType": "small_vehicle"
		}*/
	@PostMapping("/addVehicule")
	public VehiculeDTO addVehicule(@RequestBody VehiculeDTO vehiculeDTO) {
		return vehiculeService.addVehicule(vehiculeDTO);
	}
	
	
	/* update : {
				    "immatriculation": "000000022",
				    "proprietaire": "Jo",
				    "date_mis_en_circulation": "2010-03-12",
				    "annee": "2009",
				    "modele": "ES7",
				    "puissance": 93,
				    "carburant": "Ess",
				    "vehiculeType": "small_vehicle"
					}*/
	@PutMapping("/updateVehicule/")
	public VehiculeDTO updateVehicule( @RequestBody VehiculeDTO VehiculeDTO) throws NotFoundException  {
		return vehiculeService.update(VehiculeDTO);
	}
	
	
	@DeleteMapping("/deleteVehicule/{imm}")
	public void deleteVehicule(@PathVariable("imm") String imm) throws NotFoundException  {
		 vehiculeService.delete(imm);
	}
}
