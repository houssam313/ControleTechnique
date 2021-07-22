package fr.cda.controle.dto;

import lombok.Data;

@Data
public class IdActionsDTO {

	private String id_user;
	private int id_action;
	private int id_rdv;
	
	private String date;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
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
