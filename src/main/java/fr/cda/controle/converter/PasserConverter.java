
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Passer;
import fr.cda.controle.dto.PasserDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class PasserConverter {

	public  PasserDTO EntityToDTO(Passer s) {
		ModelMapper mapper = new ModelMapper();
		PasserDTO map = mapper.map(s, PasserDTO.class);
		return map;
	}
	public List<PasserDTO> EntityToDTO(List<Passer> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Passer dTOToEntity(PasserDTO s) {
		ModelMapper mapper = new ModelMapper();
		Passer map = mapper.map(s, Passer.class);
		return map;
	}
	public List<Passer> dTOToEntity(List<PasserDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
