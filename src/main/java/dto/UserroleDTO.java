package dto;

import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import fr.cda.controle.beans.Account;

public class UserroleDTO {

	private int id_role;
	private String role_user;

	private Set<AccountDTO> listaccountDTO;
	
	
	
	
	
	
}
