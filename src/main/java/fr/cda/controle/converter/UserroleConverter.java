
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Userrole;
import fr.cda.controle.dto.UserroleDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class UserroleConverter {

	public  UserroleDTO EntityToDTO(Userrole s) {
		ModelMapper mapper = new ModelMapper();
		UserroleDTO map = mapper.map(s, UserroleDTO.class);
		return map;
	}
	public List<UserroleDTO> EntityToDTO(List<Userrole> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Userrole dTOToEntity(UserroleDTO s) {
		ModelMapper mapper = new ModelMapper();
		Userrole map = mapper.map(s, Userrole.class);
		return map;
	}
	public List<Userrole> dTOToEntity(List<UserroleDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
