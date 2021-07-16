package dto;

import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import fr.cda.controle.beans.Account;

public class ActionTypeDTO {

	private int id_action;
	
	private String type_action;
	
	
	private Set<AccountDTO> listaccountDTO;

	
	
}
