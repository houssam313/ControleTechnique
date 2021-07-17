
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.UserRole;
import fr.cda.controle.dto.UserRoleDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class UserRoleConverter {

	public  UserRoleDTO EntityToDTO(UserRole s) {
		ModelMapper mapper = new ModelMapper();
		UserRoleDTO map = mapper.map(s, UserRoleDTO.class);
		return map;
	}
	public List<UserRoleDTO> EntityToDTO(List<UserRole> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public UserRole dTOToEntity(UserRoleDTO s) {
		ModelMapper mapper = new ModelMapper();
		UserRole map = mapper.map(s, UserRole.class);
		return map;
	}
	public List<UserRole> dTOToEntity(List<UserRoleDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
