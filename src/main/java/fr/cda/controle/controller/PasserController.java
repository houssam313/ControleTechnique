package fr.cda.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.PasserDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.PasserService;

@RestController
@Transactional
public class PasserController {

	@Autowired
	private PasserService passerService;



	@GetMapping("/allPasser")
	public List<PasserDTO> getAllPasser() throws NotFoundException {
		List<PasserDTO> listPasserDTO = passerService.getAllPasser();
		return listPasserDTO;
	}

	@PostMapping("/addPasser")
	public PasserDTO addPasser(@RequestBody PasserDTO PasserDTO) {
		return passerService.addPasser(PasserDTO);
	}
	


}
