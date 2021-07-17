package fr.cda.controle.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rdvDispo")
public class RdvDispo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_rdvDispo;
	
	private String jour;
	private String debut_heure;
	private String fin_heure;
	private String duree;
	
	
	public RdvDispo() {
		super();
	}
	public RdvDispo( String jour, String debut_heure, String fin_heure, String duree) {
		super();
		this.jour = jour;
		this.debut_heure = debut_heure;
		this.fin_heure = fin_heure;
		this.duree = duree;
	}
	public int getId_rdvDispo() {
		return id_rdvDispo;
	}
	public void setId_rdvDispo(int id_rdvDispo) {
		this.id_rdvDispo = id_rdvDispo;
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
		return "rdvDispo [id_rdvDispo=" + id_rdvDispo + ", jour=" + jour + ", debut_heure=" + debut_heure
				+ ", fin_heure=" + fin_heure + ", duree=" + duree + "]";
	}
	
	
	
	
}
