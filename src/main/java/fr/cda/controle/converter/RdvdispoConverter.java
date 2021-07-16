
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Rdvdispo;
import fr.cda.controle.dto.RdvdispoDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class RdvdispoConverter {

	public  RdvdispoDTO EntityToDTO(Rdvdispo s) {
		ModelMapper mapper = new ModelMapper();
		RdvdispoDTO map = mapper.map(s, RdvdispoDTO.class);
		return map;
	}
	public List<RdvdispoDTO> EntityToDTO(List<Rdvdispo> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Rdvdispo dTOToEntity(RdvdispoDTO s) {
		ModelMapper mapper = new ModelMapper();
		Rdvdispo map = mapper.map(s, Rdvdispo.class);
		return map;
	}
	public List<Rdvdispo> dTOToEntity(List<RdvdispoDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
