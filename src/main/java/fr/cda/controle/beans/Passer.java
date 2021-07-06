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
	
}
