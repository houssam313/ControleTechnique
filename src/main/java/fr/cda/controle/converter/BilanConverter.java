
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Bilan;
import fr.cda.controle.dto.BilanDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class BilanConverter {

	public  BilanDTO EntityToDTO(Bilan s) {
		ModelMapper mapper = new ModelMapper();
		BilanDTO map = mapper.map(s, BilanDTO.class);
		return map;
	}
	public List<BilanDTO> EntityToDTO(List<Bilan> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Bilan dTOToEntity(BilanDTO s) {
		ModelMapper mapper = new ModelMapper();
		Bilan map = mapper.map(s, Bilan.class);
		return map;
	}
	public List<Bilan> dTOToEntity(List<BilanDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
