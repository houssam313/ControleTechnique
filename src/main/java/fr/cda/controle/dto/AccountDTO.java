package fr.cda.controle.dto;

import java.util.Set;

import lombok.Data;

@Data
public class AccountDTO {

	
	private String password;
	private UserRoleDTO userRoleDTO;
	private StatusDTO statusDTO;	
	private Set<RdvPrisDTO> listRdvprisDTO;	
	private Set<ActionsDTO> listActionDTO;
	private Set<ExamenDTO> listExamenDTO;		
	
	private String duree;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String adresse;
	
	
	
}
