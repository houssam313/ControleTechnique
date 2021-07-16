
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Recu;
import fr.cda.controle.dto.RecuDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class RecuConverter {

	public  RecuDTO EntityToDTO(Recu s) {
		ModelMapper mapper = new ModelMapper();
		RecuDTO map = mapper.map(s, RecuDTO.class);
		return map;
	}
	public List<RecuDTO> EntityToDTO(List<Recu> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Recu dTOToEntity(RecuDTO s) {
		ModelMapper mapper = new ModelMapper();
		Recu map = mapper.map(s, Recu.class);
		return map;
	}
	public List<Recu> dTOToEntity(List<RecuDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
