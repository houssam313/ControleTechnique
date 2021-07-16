
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.RdvPris;
import fr.cda.controle.dto.RdvPrisDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class RdvPrisConverter {

	public  RdvPrisDTO EntityToDTO(RdvPris s) {
		ModelMapper mapper = new ModelMapper();
		RdvPrisDTO map = mapper.map(s, RdvPrisDTO.class);
		return map;
	}
	public List<RdvPrisDTO> EntityToDTO(List<RdvPris> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public RdvPris dTOToEntity(RdvPrisDTO s) {
		ModelMapper mapper = new ModelMapper();
		RdvPris map = mapper.map(s, RdvPris.class);
		return map;
	}
	public List<RdvPris> dTOToEntity(List<RdvPrisDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
