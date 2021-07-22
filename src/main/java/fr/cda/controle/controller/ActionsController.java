package fr.cda.controle.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.ActionTypeDTO;
import fr.cda.controle.dto.ActionsDTO;
import fr.cda.controle.dto.IdActionsDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.ActionTypeService;
import fr.cda.controle.service.ActionsService;


@RestController
public class ActionsController {
	
	@Autowired
	private ActionsService actionsService;
	
	// get action by sending IdActions(iduser,idactiontype,idrdv,date(string))
	@PostMapping("/action")
	public ActionsDTO getActionType(@RequestBody IdActionsDTO id ) throws NotFoundException {
		ActionsDTO actionDTO = actionsService.getAction(id);
		return actionDTO;
	}
	
	
	// get all actions
	@GetMapping("/allActions")
	public List<ActionsDTO> getAllactionType() throws NotFoundException {
		List<ActionsDTO> listactionsDTO = actionsService.getAllActions();
		return listactionsDTO;
	}
	
	
	/* send dto   {
		    "id_user": "1",
		    "id_action": 1,
		    "id_rdv": 1,
		    "date": "2025-03-22",
		    "motif": "neant"
	}*/
	@PostMapping("/addAction")
	public ActionsDTO addAction(@RequestBody ActionsDTO actionDTO) {
		actionsService.addAction(actionDTO);
		return actionDTO;
	}
	 
}
