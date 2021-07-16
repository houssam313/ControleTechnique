package fr.cda.controle.dto;

import java.util.Set;


import lombok.Data;

@Data
public class UserroleDTO {


	private String role_user;
	
	private Set<AccountDTO> listaccountDTO;
	
	
	
}
