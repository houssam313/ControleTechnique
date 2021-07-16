package dto;

import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import fr.cda.controle.beans.Account;

public class StatusDTO {
	private int id_status;
	
	private String type;
	
	
	
	  private Set<AccountDTO> listaccountDTO;
	 
}
