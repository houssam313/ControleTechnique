
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Actions;
import fr.cda.controle.dto.ActionsDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class ActionsConverter {

	public  ActionsDTO EntityToDTO(Actions s) {
		ModelMapper mapper = new ModelMapper();
		ActionsDTO map = mapper.map(s, ActionsDTO.class);
		return map;
	}
	public List<ActionsDTO> EntityToDTO(List<Actions> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Actions dTOToEntity(ActionsDTO s) {
		ModelMapper mapper = new ModelMapper();
		Actions map = mapper.map(s, Actions.class);
		return map;
	}
	public List<Actions> dTOToEntity(List<ActionsDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
