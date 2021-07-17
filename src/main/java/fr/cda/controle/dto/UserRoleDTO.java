package fr.cda.controle.dto;

import java.util.Set;


import lombok.Data;

@Data
public class UserRoleDTO {


	private String role_user;
	
	private Set<AccountDTO> listaccountDTO;
	
	
	
}
