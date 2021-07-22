package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.Column;
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
	@Column(name="id_typevehicule")
	private int id;
	
	@Column(name="type_vehicule")
	private String type;
	
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
		this.type = type_vehicule;
		this.bilan = bilan;
	}



	public Set<Vehicule> getListVehicules() {
		return listVehicules;
	}

	public void setListVehicules(Set<Vehicule> listVehicules) {
		this.listVehicules = listVehicules;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type_vehicule) {
		this.type = type_vehicule;
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
		return "VehiculeType [id_typevehicule=" + id + ", type_vehicule=" + type
				+ "]";
	}
	
	
	
}
