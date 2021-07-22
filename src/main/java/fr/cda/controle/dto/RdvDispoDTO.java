package fr.cda.controle.dto;


import lombok.Data;

@Data
public class RdvDispoDTO {

	private int id_rdvDispo;
	private String jour;
	private String debut_heure;
	private String fin_heure;
	private String duree;
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public String getDebut_heure() {
		return debut_heure;
	}
	public void setDebut_heure(String debut_heure) {
		this.debut_heure = debut_heure;
	}
	public String getFin_heure() {
		return fin_heure;
	}
	public void setFin_heure(String fin_heure) {
		this.fin_heure = fin_heure;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public int getId_rdvDispo() {
		return id_rdvDispo;
	}
	public void setId_rdvDispo(int id_rdvDispo) {
		this.id_rdvDispo = id_rdvDispo;
	}

	
}
