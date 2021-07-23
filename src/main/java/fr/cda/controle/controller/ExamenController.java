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

import fr.cda.controle.dto.ExamenDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.ExamenService;

@RestController
public class ExamenController {
	
	@Autowired
	private ExamenService examenService;
	
	
	@GetMapping("/examen/{id}")
	public ExamenDTO getExamen(@PathVariable("id") int id) throws NotFoundException {
		ExamenDTO examenDTO = examenService.getExamen(id);
		return examenDTO;
	}
	
	@GetMapping("/allExamen")
	public List<ExamenDTO> getAllExamen() throws NotFoundException {
		List<ExamenDTO> listExamenDTO = examenService.getAllExamen();
		return listExamenDTO;
	}
	
	
	
	/* Ajouter examen
	 * {
	 "ripage": 455, 
	 "dissymetrie" : 448,
	 "date": "2020-03-21",
   	"force_verticale" : 12,
	 "desequilibre": 17,
	 "force_freinage": 19,
	 "co":7,
	 "resultat": true,
	 "id_user" : "1",
	 "immatriculation": "000000044",
	 "visit_number" : 1
		}
	 */
	@PostMapping("/addExamen")
	public ExamenDTO addExamen(@RequestBody ExamenDTO examenDTO) {
		return examenService.addExamen(examenDTO);
	}
	
	
	/* update :     {
        "id": 3,
        "ripage": 4,
        "dissymetrie": 8,
        "date": "2020-03-21",
        "force_verticale": 12,
        "desequilibre": 17,
        "force_freinage": 21,
        "co": 7,
        "resultat": true,
        "id_user": 1,
        "immatriculation": "000000000",
        "visit_number": 1
    }*/
	@PutMapping("/updateExamen")
	public ExamenDTO updateExamen( @RequestBody ExamenDTO examenDTO) throws NotFoundException  {
		return examenService.update(examenDTO);
	}
	
	
	@DeleteMapping("/deleteExamen/{id}")
	public void deleteExamen(@PathVariable("id") int id) throws NotFoundException  {
		 examenService.delete(id);
	}
}
