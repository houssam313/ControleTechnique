package fr.cda.controle.dto;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
public class BilanDTO {


	private double ripage_min;
	private double ripage_max;
	private double dissymetrie_min;
	private double dissymetrie_max;
	private double force_verticale_min;
	private double force_verticale_max;
	private double desequilibre_min;
	private double desequilibre_max;
	private double force_freinage_min;
	private double force_freinage_max;
	private double co_min;
	private double co_max;

	private VehiculeTypeDTO vehiculeTypeDTO;
	
	private Set<PasserDTO>  listPasserDTO;
	
	

}
