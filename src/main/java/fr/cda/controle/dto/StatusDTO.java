package fr.cda.controle.dto;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
public class StatusDTO {

	private String type;
	private Set<AccountDTO> listaccountDTO;
	 
	
	
}
