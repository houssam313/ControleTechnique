package fr.cda.controle.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="recu")
public class Recu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_recu")
	private int id;
	
	private double montant;
	
	private String date;
	
	@ManyToOne () 
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

	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Recu [id_recu=" + id + ", montant=" + montant + ", date=" + date + ", examen=" + examen + "]";
	}
		
		
	
	
	
	
	
	
	
}
