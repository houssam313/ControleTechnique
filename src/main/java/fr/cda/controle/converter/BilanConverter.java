
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
		map.setIdVehiculeType(s.getVehiculeType().getId());
		return map;
	}
	

	
}
