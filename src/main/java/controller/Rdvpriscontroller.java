package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.RdvprisDTO;
import fr.cda.controle.beans.Rdvpris;


import service.Rdvprisservice;

@RestController

public class Rdvpriscontroller {

	@Autowired
	private Rdvprisservice rdvprisService;
	
	@PostMapping("/addRdvpris")
	public Rdvpris addStatus(@RequestBody RdvprisDTO rdvprisDTO) {
		return  rdvprisService.save(rdvprisDTO);
	}
	
}
