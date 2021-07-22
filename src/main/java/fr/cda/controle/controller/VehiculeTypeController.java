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

import fr.cda.controle.dto.VehiculeTypeDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.VehiculeTypeService;


@RestController
public class VehiculeTypeController {
	
	@Autowired
	private VehiculeTypeService vehiculeTypeService;
	
	
	@GetMapping("/vehiculeType/{id}")
	public VehiculeTypeDTO getVehiculeType(@PathVariable("id") int id) throws NotFoundException {
		VehiculeTypeDTO vehiculeTypeDTO = vehiculeTypeService.getVehiculeType(id);
		return vehiculeTypeDTO;
	}
	
	@GetMapping("/allVehiculeType")
	public List<VehiculeTypeDTO> getAllVehiculeType() throws NotFoundException {
		List<VehiculeTypeDTO> listVehiculeTypeDTO = vehiculeTypeService.getAllVehiculeType();
		return listVehiculeTypeDTO;
	}
	

}
