
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.RdvDispo;
import fr.cda.controle.dto.RdvDispoDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class RdvDispoConverter {

	public  RdvDispoDTO EntityToDTO(RdvDispo s) {
		ModelMapper mapper = new ModelMapper();
		RdvDispoDTO map = mapper.map(s, RdvDispoDTO.class);
		return map;
	}
	public List<RdvDispoDTO> EntityToDTO(List<RdvDispo> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public RdvDispo dTOToEntity(RdvDispoDTO s) {
		ModelMapper mapper = new ModelMapper();
		RdvDispo map = mapper.map(s, RdvDispo.class);
		return map;
	}
	public List<RdvDispo> dTOToEntity(List<RdvDispoDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
