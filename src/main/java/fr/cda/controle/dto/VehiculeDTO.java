package fr.cda.controle.dto;

import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
public class VehiculeDTO {


	private String immatriculation;
	
	private String proprietaire;
	private String date_mis_en_circulation;
	private String annee;
	private String modele;
	private int puissance;
	private String carburant;
	

	private VehiculeTypeDTO  vehiculeTypeDTO;
	

	private Set<PasserDTO>  listPasserDTO;
	

	private Set<ExamenDTO>  listExamenDTO;


	
	
	
}
