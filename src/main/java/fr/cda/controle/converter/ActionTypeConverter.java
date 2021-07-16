
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.ActionType;
import fr.cda.controle.dto.ActionTypeDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class ActionTypeConverter {

	public  ActionTypeDTO EntityToDTO(ActionType s) {
		ModelMapper mapper = new ModelMapper();
		ActionTypeDTO map = mapper.map(s, ActionTypeDTO.class);
		return map;
	}
	public List<ActionTypeDTO> EntityToDTO(List<ActionType> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public ActionType dTOToEntity(ActionTypeDTO s) {
		ModelMapper mapper = new ModelMapper();
		ActionType map = mapper.map(s, ActionType.class);
		return map;
	}
	public List<ActionType> dTOToEntity(List<ActionTypeDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
