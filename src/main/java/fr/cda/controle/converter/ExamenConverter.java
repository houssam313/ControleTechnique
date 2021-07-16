
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Examen;
import fr.cda.controle.dto.ExamenDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class ExamenConverter {

	public  ExamenDTO EntityToDTO(Examen s) {
		ModelMapper mapper = new ModelMapper();
		ExamenDTO map = mapper.map(s, ExamenDTO.class);
		return map;
	}
	public List<ExamenDTO> EntityToDTO(List<Examen> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Examen dTOToEntity(ExamenDTO s) {
		ModelMapper mapper = new ModelMapper();
		Examen map = mapper.map(s, Examen.class);
		return map;
	}
	public List<Examen> dTOToEntity(List<ExamenDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
