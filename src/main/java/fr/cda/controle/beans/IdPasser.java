
package fr.cda.controle.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Embeddable
public class IdPasser implements Serializable {

	

	@OneToOne()
	@JoinColumn(name = "id_examen")
	private Examen examen;

	
	@ManyToOne()
	@JoinColumn(name = "immatriculation")
	private Vehicule vehicule;

	@ManyToOne()
	@JoinColumn(name = "id_bilan")
	private Bilan bilan;

	
	
	public IdPasser() {
		super();
	}

	public IdPasser(Examen examen, Vehicule vehicule, Bilan bilan) {
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
	
	
}


	


	


