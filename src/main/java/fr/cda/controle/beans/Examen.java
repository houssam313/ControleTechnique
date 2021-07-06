package fr.cda.controle.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="examen")
public class Examen {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_examen;
	
	private Double ripage;
	
	private Double dyssimetrie;
	
	private Date date;
	
	private Double force_verticale;
	
	private String id_user;
	
	private Double desequilibre;
	
	private Double force_freinage;
	
	private Double co;
	
	private Double feux;
	
	private Boolean resultat;
	
	

	public Examen(int id_examen, Double ripage, Double dyssimetrie, Date date, Double force_verticale, String id_user,
			Double desequilibre, Double force_freinage, Double co, Double feux, Boolean resultat) {
		super();
		this.id_examen = id_examen;
		this.ripage = ripage;
		this.dyssimetrie = dyssimetrie;
		this.date = date;
		this.force_verticale = force_verticale;
		this.id_user = id_user;
		this.desequilibre = desequilibre;
		this.force_freinage = force_freinage;
		this.co = co;
		this.feux = feux;
		this.resultat = resultat;
	}
	public Examen() {
		
	}
	
	
	
}
