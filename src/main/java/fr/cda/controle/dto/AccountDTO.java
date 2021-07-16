package fr.cda.controle.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
public class AccountDTO {

	private String id_user;
	
	private String password;
	

	private UserroleDTO userroleDTO;
	

	private StatusDTO statusDTO;
		
	private Set<RdvPrisDTO> listRdvprisDTO;
		
	private Set<ActionsDTO> listActionsDTO;
	
	private Set<ExamenDTO> listExamenDTO;		
	
	private String duree;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String adresse;
	
	
	
}
