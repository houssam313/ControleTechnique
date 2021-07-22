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
public class IdActionsDTO {

	private String id_user;
	private int id_action;
	private int id_rdv;
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public int getId_action() {
		return id_action;
	}
	public void setId_action(int id_action) {
		this.id_action = id_action;
	}
	public int getId_rdv() {
		return id_rdv;
	}
	public void setId_rdv(int id_rdv) {
		this.id_rdv = id_rdv;
	}

	
	
}
