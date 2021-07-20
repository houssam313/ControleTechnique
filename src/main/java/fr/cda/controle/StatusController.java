package fr.cda.controle;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.StatusDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.StatusService;


@RestController
public class StatusController {
	
	@Autowired
	private StatusService statusService;
	
	
	@GetMapping("/status/{type}")
	public StatusDTO getStatus(@PathVariable("type") String type) throws NotFoundException {
		StatusDTO statusDTO = statusService.getStatus(type);
		return statusDTO;
	}
	
	@GetMapping("/allStatus")
	public List<StatusDTO> getAllStatus() throws NotFoundException {
		List<StatusDTO> liststatusDTO = statusService.getAllStatus();
		return liststatusDTO;
	}
	
	@PostMapping("/addStatus")
	public StatusDTO addStatus(@RequestBody StatusDTO statusDTO) {
		return statusService.addStatus(statusDTO);
	}
	
	@PutMapping("/updateStatus/{id}")
	public StatusDTO updateStatus(@PathVariable("id") int id, @RequestBody StatusDTO statusDTO) throws NotFoundException  {
		return statusService.update(id,statusDTO);
	}
	
	
	@DeleteMapping("/deleteStatus/{id}")
	public void deleteStatus(@PathVariable("id") int id) throws NotFoundException  {
		 statusService.delete(id);
	}
}
