package fr.cda.controle.dto;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
public class ExamenDTO {


	private double ripage;
	private double dissymetrie;
	private String date;
	private double force_verticale;
	private double desequilibre;
	private double force_freinage;
	private double co;
	private boolean resultat;
	private AccountDTO accountDTO;
	private VehiculeDTO vehiculeDTO;
	private Set<RecuDTO> listRecuDTO;

}
