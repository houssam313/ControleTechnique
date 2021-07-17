package fr.cda.controle.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="recu")
public class Recu {

	@Id
	private String id_recu;
	
	private double montant;
	
	private String date;
	
	@ManyToOne (cascade = CascadeType.REMOVE) 
	@JoinColumn( name="id_examen")
	private Examen examen;

	
	public Recu() {
		super();
	}

	public Recu(double montant, String date, Examen examen) {
		super();
		this.montant = montant;
		this.date = date;
		this.examen = examen;
	}

	public String getId_recu() {
		return id_recu;
	}

	public void setId_recu(String id_recu) {
		this.id_recu = id_recu;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	@Override
	public String toString() {
		return "Recu [id_recu=" + id_recu + ", montant=" + montant + ", date=" + date + ", examen=" + examen + "]";
	}
		
		
	
	
	
	
	
	
	
}
