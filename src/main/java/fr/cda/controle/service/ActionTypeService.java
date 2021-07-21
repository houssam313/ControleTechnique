package fr.cda.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.controle.beans.ActionType;
import fr.cda.controle.converter.ActionTypeConverter;
import fr.cda.controle.dto.ActionTypeDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.ActionTypeRepository;

@Service
public class ActionTypeService {
	
	@Autowired
	private ActionTypeRepository actionTypeRepository;
	
	@Autowired
	private ActionTypeConverter actionTypeConverter;

	public ActionTypeDTO getActionType(String type )  throws NotFoundException {
		ActionType actionType= actionTypeRepository.findByType(type);
		System.out.println(actionTypeRepository.findByType("reserve"));
		if(actionType== null) {
			throw new NotFoundException();
		}
		return actionTypeConverter.EntityToDTO(actionType);
	}

	public List<ActionTypeDTO> getAllActionType() throws NotFoundException {	
		List<ActionType> listActionType = actionTypeRepository.findAll();
		if(listActionType == null) {
			throw new NotFoundException();
		}
		System.out.println(actionTypeRepository.findAll());
		return actionTypeConverter.EntityToDTO(listActionType);
	}
	

}
