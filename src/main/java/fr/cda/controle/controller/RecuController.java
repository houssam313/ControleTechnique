package fr.cda.controle.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.RecuDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.RecuService;


@RestController
public class RecuController {
	
	@Autowired
	private RecuService recuService;
	
	
	@GetMapping("/recu/{id}")
	public RecuDTO getRecu(@PathVariable("id") int id) throws NotFoundException {
		RecuDTO recuDTO = recuService.getRecu(id);
		return recuDTO;
	}
	
	@GetMapping("/allRecu")
	public List<RecuDTO> getAllRecu() throws NotFoundException {
		List<RecuDTO> listRecuDTO = recuService.getAllRecu();
		return listRecuDTO;
	}
	
	@PostMapping("/addRecu")
	public RecuDTO addRecu(@RequestBody RecuDTO recuDTO) {
		return recuService.addRecu(recuDTO);
	}
	
	
	@DeleteMapping("/deleteRecu/{id}")
	public void deleteRecu(@PathVariable("id") int id) throws NotFoundException  {
		 recuService.delete(id);
	}
}
