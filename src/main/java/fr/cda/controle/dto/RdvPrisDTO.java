package fr.cda.controle.dto;

import lombok.Data;

@Data
public class RdvPrisDTO {

	private int id;
	private String email;
	private String immatriculation;
	private String date;
	private String debut_heure;

	
	
	


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getDate() {
		return date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id_rdv) {
		this.id = id_rdv;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDebut_heure() {
		return debut_heure;
	}
	public void setDebut_heure(String debut_heure) {
		this.debut_heure = debut_heure;
	}

	
	
}
