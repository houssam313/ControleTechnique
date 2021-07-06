package fr.cda.controle.beans;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="passer")
public class Passer {

	@ManyToOne()
	@JoinColumn(name = "id_examen")
	private Account account;


	@ManyToOne()
	@JoinColumn(name = "immatriculation")
	private ActionType actionType;

	
	@ManyToOne()
	@JoinColumn(name = "id_bilan")
	private RdvPris rdvPris;
	
}
