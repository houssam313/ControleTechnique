package fr.cda.controle.beans;

import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vehicule")
public class Vehicule {

	@Id
	private String immatriculation;
	
	private String proprietaire;
	private String date_mis_en_circulation;
	private String annee;
	private String modele;
	private int puissance;
	private String carburant;
	
	@ManyToOne () 
	@JoinColumn( name="id_typevehicule")
	private VehiculeType  vehiculeType;
	
	@OneToMany (fetch = FetchType.EAGER , mappedBy="id_passer.vehicule") 
	private Set<Passer>  listPasser;
	
	@OneToMany (fetch = FetchType.EAGER , mappedBy="vehicule") 
	private Set<Examen>  listExamen;

	
	public Vehicule() {
		super();
	}


	public Vehicule(String immatriculation, String proprietaire, String date_mis_en_circulation, String annee,
			String modele, int puissance, String carburant, VehiculeType vehiculeType) {
		super();
		this.immatriculation = immatriculation;
		this.proprietaire = proprietaire;
		this.date_mis_en_circulation = date_mis_en_circulation;
		this.annee = annee;
		this.modele = modele;
		this.puissance = puissance;
		this.carburant = carburant;
		this.vehiculeType = vehiculeType;
	}


	public String getImmatriculation() {
		return immatriculation;
	}


	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}


	public String getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
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


	public VehiculeType getVehiculeType() {
		return vehiculeType;
	}


	public void setVehiculeType(VehiculeType vehiculeType) {
		this.vehiculeType = vehiculeType;
	}



	@Override
	public String toString() {
		return "Vehicule [immatriculation=" + immatriculation + ", proprietaire=" + proprietaire
				+ ", date_mis_en_circulation=" + date_mis_en_circulation + ", annee=" + annee + ", modele=" + modele
				+ ", puissance=" + puissance + ", carburant=" + carburant 
				+ "]";
	}
	
	
	
}
