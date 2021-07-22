package fr.cda.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.beans.UserRole;
import fr.cda.controle.dto.UserRoleDTO;
import fr.cda.controle.service.UserRoleService;

@RestController
public class UserRoleController {

	@Autowired
	private UserRoleService userRoleService;

	@GetMapping("/userRole/{role}")
	public UserRoleDTO getUserRole(@PathVariable("role") String role) {
		UserRoleDTO userRoleDTO = userRoleService.getUserRole(role);
		return userRoleDTO;
	}

	@GetMapping("/allUserRole")
	public List<UserRoleDTO> getAllUserRole() {
		List<UserRoleDTO> listuserRoleDTO = userRoleService.getAllUserRole();
		return listuserRoleDTO;
	}

	@PostMapping("/addUserRole")
	public UserRole adduserRole(@RequestBody UserRoleDTO userRoleDTO) {
		return userRoleService.save(userRoleDTO);
	}

	@PutMapping("/updateUserRole/")
	public UserRole updateUserRole( @RequestBody UserRoleDTO userRoleDTO) {
		return userRoleService.update(userRoleDTO);
	}

	@DeleteMapping("/deleteUserRole/")
	public void deleteuserRole(@RequestBody UserRoleDTO userRoleDTO) {
		userRoleService.delete(userRoleDTO);
	}

}
