package fr.cda.controle;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.beans.Status;
import fr.cda.controle.dto.StatusDTO;
import fr.cda.controle.repositories.AccountRepository;

import fr.cda.controle.repositories.StatusRepository;
import fr.cda.controle.repositories.UserRoleRepository;
import fr.cda.controle.service.StatusService;


@RestController
public class StatusController {
	
	@Autowired
	private StatusService statusService;
	
	
	@GetMapping("/status/{type}")
	public StatusDTO getStatus(@PathVariable("type") String type) {
		StatusDTO statusDTO = statusService.getStatus(type);
		return statusDTO;
	}
	
	@GetMapping("/allStatus")
	public List<StatusDTO> getAllStatus() {
		List<StatusDTO> liststatusDTO = statusService.getAllStatus();
		return liststatusDTO;
	}
	
	@PostMapping("/addStatus")
	public Status addStatus(@RequestBody StatusDTO statusDTO) {
		return statusService.save(statusDTO);
	}
	
	@PutMapping("/updateStatus/{id}")
	public Status updateStatus(@PathVariable("id") int id, @RequestBody StatusDTO statusDTO) {
		return statusService.update(id,statusDTO);
	}
	
	
	@DeleteMapping("/deleteStatus/{id}")
	public void deleteStatus(@PathVariable("id") int id) {
		 statusService.delete(id);
	}
}
