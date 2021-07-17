package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehiculetype")
public class VehiculeType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_typevehicule;
	
	private String type_vehicule;
	
	@OneToMany( fetch = FetchType.EAGER, mappedBy="vehiculeType")
	private Set<Vehicule> listVehicules;
	
	
	@OneToOne( fetch = FetchType.EAGER)
	@JoinColumn(name = "id_typevehicule")
	Bilan bilan;
	
	
	public VehiculeType() {
		super();
	}

	public VehiculeType(String type_vehicule, Bilan bilan) {
		super();
		this.type_vehicule = type_vehicule;
		this.bilan = bilan;
	}

	public int getId_typevehicule() {
		return id_typevehicule;
	}

	public Set<Vehicule> getListVehicules() {
		return listVehicules;
	}

	public void setListVehicules(Set<Vehicule> listVehicules) {
		this.listVehicules = listVehicules;
	}

	public void setId_typevehicule(int id_typevehicule) {
		this.id_typevehicule = id_typevehicule;
	}

	public String getType_vehicule() {
		return type_vehicule;
	}

	public void setType_vehicule(String type_vehicule) {
		this.type_vehicule = type_vehicule;
	}


	public Set<Vehicule> getListVhicules() {
		return listVehicules;
	}

	public void setListVhicules(Set<Vehicule> listVhicules) {
		this.listVehicules = listVhicules;
	}

	public Bilan getBilan() {
		return bilan;
	}

	public void setBilan(Bilan bilan) {
		this.bilan = bilan;
	}

	@Override
	public String toString() {
		return "VehiculeType [id_typevehicule=" + id_typevehicule + ", type_vehicule=" + type_vehicule
				+ "]";
	}
	
	
	
}
