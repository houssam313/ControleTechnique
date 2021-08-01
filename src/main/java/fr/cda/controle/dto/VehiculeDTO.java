package fr.cda.controle.dto;

import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.cda.controle.beans.VehiculeType;
import lombok.Data;

@Data
public class VehiculeDTO {


	private String immatriculation;
	private String email;
	private String date_mis_en_circulation;
	private String annee;
	private String modele;
	private int puissance;
	private String carburant;
	private String vehiculeType;

	
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate_mis_en_circulation() {
		return date_mis_en_circulation;
	}
	public void setDate_mis_en_circulation(String date_mis_en_circulation) {
		this.date_mis_en_circulation = date_mis_en_circulation;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	public String getVehiculeType() {
		return vehiculeType;
	}
	public void setVehiculeType(String vehiculeType) {
		this.vehiculeType = vehiculeType;
	}

	
	
}
