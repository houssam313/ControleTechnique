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

import fr.cda.controle.dto.RdvPrisDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.RdvPrisService;

@RestController
public class RdvPrisController {

	@Autowired
	private RdvPrisService rdvPrisService;

	@GetMapping("/rdvPris/{id}")
	public RdvPrisDTO getRdvPris(@PathVariable("id") int id) throws NotFoundException {
		RdvPrisDTO RdvPrisDTO = rdvPrisService.getRdvPris(id);
		return RdvPrisDTO;
	}

	@GetMapping("/allRdvPris")
	public List<RdvPrisDTO> getAllRdvPris() throws NotFoundException {
		List<RdvPrisDTO> listRdvPrisDTO = rdvPrisService.getAllRdvPris();
		return listRdvPrisDTO;
	}

	@PostMapping("/addRdv")
	public RdvPrisDTO addRdvPris(@RequestBody RdvPrisDTO rdvPrisDTO) throws AlreadyExistException {
		return rdvPrisService.addRdvPris(rdvPrisDTO);
	}

	
	@PutMapping("/updateRdv")
	public RdvPrisDTO updateRdvPris(@RequestBody RdvPrisDTO rdvPrisDTO) throws NotFoundException {
		return rdvPrisService.update(rdvPrisDTO);
	}
	 

	@DeleteMapping("/deleteRdvPris/{id}")
	public void deleteRdvPris(@PathVariable("id") int id) throws NotFoundException {
		rdvPrisService.delete(id);
	}

}
