package fr.cda.controle.beans;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="recu")
public class recu {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne(cascade={CascadeType.ALL}) 
	@JoinColumn(name = "examen", nullable = false)
	int id_recu; 
	
	int id_examen;
	BigDecimal montant; //ce type permets la précision et c' une facture, donc cela est necessaire.. 
	
	
	
	
	
	
	
	
	
	
	
}
