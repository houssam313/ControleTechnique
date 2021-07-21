package fr.cda.controle;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.ActionTypeDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.ActionTypeService;


@RestController
public class ActionTypeController {
	
	@Autowired
	private ActionTypeService actionTypeService;
	
	
	@GetMapping("/actionType/{type}")
	public ActionTypeDTO getActionType(@PathVariable("type") String type) throws NotFoundException {
		ActionTypeDTO actionTypeDTO = actionTypeService.getActionType(type);
		System.out.println(actionTypeService.getActionType("reserve"));
		return actionTypeDTO;
	}
	
	@GetMapping("/allActionType")
	public List<ActionTypeDTO> getAllactionType() throws NotFoundException {
		List<ActionTypeDTO> listactionTypeDTO = actionTypeService.getAllActionType();
		return listactionTypeDTO;
	}
	
	

	 
}
