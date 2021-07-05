package fr.cda.controle.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rdvdispo")
public class Rdvdispo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_rdvdispo;
	
	private String jour;
	private String debut_heure;
	private String fin_heure;
	private String duree;
	
	
	public int getId_rdvdispo() {
		return id_rdvdispo;
	}
	public void setId_rdvdispo(int id_rdvdispo) {
		this.id_rdvdispo = id_rdvdispo;
	}
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
	@Override
	public String toString() {
		return "Rdvdispo [id_rdvdispo=" + id_rdvdispo + ", jour=" + jour + ", debut_heure=" + debut_heure
				+ ", fin_heure=" + fin_heure + ", duree=" + duree + "]";
	}
	
	
	
	
}
