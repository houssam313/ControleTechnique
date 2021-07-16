package fr.cda.controle.dto;

import java.util.Set;

import javax.persistence.CascadeType;

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
public class RdvPrisDTO {


	private AccountDTO accountDTO;
	private Set<ActionsDTO> listActionsDTO;
	private String immatriculation;
	private String date;
	private String debut_heure;
	private String fin_heure;
}
