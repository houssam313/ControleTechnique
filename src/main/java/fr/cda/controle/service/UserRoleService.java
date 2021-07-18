package fr.cda.controle.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.controle.beans.UserRole;
import fr.cda.controle.converter.UserRoleConverter;
import fr.cda.controle.dto.UserRoleDTO;
import fr.cda.controle.repositories.UserRoleRepository;

@Service
public class UserRoleService {

	@Autowired
	private UserRoleRepository userRoleRepository;

	@Autowired
	private UserRoleConverter userRoleConverter;

	public UserRoleDTO getUserRole(String role) {
		UserRoleDTO u = userRoleConverter.EntityToDTO(userRoleRepository.findByRole(role));
		return u;

	}

	public List<UserRoleDTO> getAllUserRole() {
		return userRoleConverter.EntityToDTO(userRoleRepository.findAll());
	}

	public UserRole save(UserRoleDTO UserRoleDTO) {
		UserRole userRole = userRoleRepository.save(userRoleConverter.dTOToEntity(UserRoleDTO));
		return userRole;
	}

	public void delete(UserRoleDTO userRoleDTO) {
		int id = userRoleDTO.getId();
		userRoleRepository.deleteById(id);

	}

	public UserRole update(UserRoleDTO userRoleDTO) {
		int id = userRoleDTO.getId();
		UserRole userRole = userRoleRepository.findById(id).get();
		userRole.setRole(userRoleDTO.getRole());
		userRoleRepository.save(userRole);
		return userRole;
	}

}
