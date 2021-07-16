package fr.cda.controle.dto;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.ActionType;
import fr.cda.controle.beans.RdvPris;
import lombok.Data;

@Data
public class ActionsDTO {

	
	private AccountDTO accountDTO;
	private ActionTypeDTO actionTypeDTO;
	private RdvPrisDTO rdvPrisDTO;
	private Date date;
	private String motif;
	
	
}
