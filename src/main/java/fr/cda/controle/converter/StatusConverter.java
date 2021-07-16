
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Status;
import fr.cda.controle.dto.StatusDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class StatusConverter {

	public  StatusDTO EntityToDTO(Status s) {
		ModelMapper mapper = new ModelMapper();
		StatusDTO map = mapper.map(s, StatusDTO.class);
		return map;
	}
	public List<StatusDTO> EntityToDTO(List<Status> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Status dTOToEntity(StatusDTO s) {
		ModelMapper mapper = new ModelMapper();
		Status map = mapper.map(s, Status.class);
		return map;
	}
	public List<Status> dTOToEntity(List<StatusDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
