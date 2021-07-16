package fr.cda.controle.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passer")
public class Passer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne (cascade = CascadeType.ALL)
    @MapsId
	private Examen examen;

	@ManyToOne()
	@JoinColumn(name = "immatriculation")
	private Vehicule vehicule;

	@ManyToOne()
	@JoinColumn(name = "id_bilan")
	private Bilan bilan;

	
	
	
	public Passer() {
		super();
	}

	public Passer(Examen examen, Vehicule vehicule, Bilan bilan) {
		super();
		this.examen = examen;
		this.vehicule = vehicule;
		this.bilan = bilan;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Bilan getBilan() {
		return bilan;
	}

	public void setBilan(Bilan bilan) {
		this.bilan = bilan;
	}

	@Override
	public String toString() {
		return "Passer [examen=" + examen + ", vehicule=" + vehicule + ", bilan=" + bilan + "]";
	}
	
	
	
}
