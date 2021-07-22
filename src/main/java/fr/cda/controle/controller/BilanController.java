package fr.cda.controle.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.BilanDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.BilanService;


@RestController
public class BilanController {
	
	@Autowired
	private BilanService BilanService;
	
	
	@GetMapping("/bilan/{id}")
	public BilanDTO getBilan(@PathVariable("id") int id) throws NotFoundException {
		BilanDTO bilanDTO = BilanService.getBilan(id);
		return bilanDTO;
	}
	
	
	

}
