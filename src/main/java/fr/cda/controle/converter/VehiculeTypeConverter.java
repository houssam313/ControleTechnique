
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.VehiculeType;
import fr.cda.controle.dto.VehiculeTypeDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class VehiculeTypeConverter {

	public  VehiculeTypeDTO EntityToDTO(VehiculeType s) {
		ModelMapper mapper = new ModelMapper();
		VehiculeTypeDTO map = mapper.map(s, VehiculeTypeDTO.class);
		return map;
	}
	public List<VehiculeTypeDTO> EntityToDTO(List<VehiculeType> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public VehiculeType dTOToEntity(VehiculeTypeDTO s) {
		ModelMapper mapper = new ModelMapper();
		VehiculeType map = mapper.map(s, VehiculeType.class);
		return map;
	}
	public List<VehiculeType> dTOToEntity(List<VehiculeTypeDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
