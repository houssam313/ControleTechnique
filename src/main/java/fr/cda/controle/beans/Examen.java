package fr.cda.controle.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="examen")
public class Examen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_examen;
	
	
	private double ripage;
	private double dissymetrie;
	private String date;
	private double force_verticale;
	private double desequilibre;
	private double force_freinage;
	private double co;
	
	private Account account;
	
	private Vehicule vehicule;
	private boolean resultat;
	
}
