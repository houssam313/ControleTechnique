package fr.cda.controle.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	
	
	@ManyToOne (cascade = CascadeType.REMOVE) 
	@JoinColumn( name="id_typevehicule")
	private VehiculeType  vehiculeType;
	
	
	
}
