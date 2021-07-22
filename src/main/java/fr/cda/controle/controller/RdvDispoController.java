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

import fr.cda.controle.dto.RdvDispoDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.RdvDispoService;



@RestController
public class RdvDispoController {
	
	@Autowired
	private RdvDispoService rdvDispoService;
	
	
	@GetMapping("/rdvDispo/{id}")
	public RdvDispoDTO getRdvDispo(@PathVariable("id") int id) throws NotFoundException {
		RdvDispoDTO rdvDispoDTO = rdvDispoService.getRdvDispo(id);
		return rdvDispoDTO;
	}
	
	@GetMapping("/allRdvDispo")
	public List<RdvDispoDTO> getAllRdvDispo() throws NotFoundException {
		List<RdvDispoDTO> listRdvDispoDTO = rdvDispoService.getAllRdvDispo();
		return listRdvDispoDTO;
	}
	
}
