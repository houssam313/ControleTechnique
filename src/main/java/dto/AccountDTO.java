package dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import fr.cda.controle.beans.Rdvpris;
import fr.cda.controle.beans.Status;
import fr.cda.controle.beans.Userrole;

public class AccountDTO {

private String id_user;
	


	private String password;
	
	private UserroleDTO userroleDTO;
	
	
	private StatusDTO statusDTO;

	private Set<RdvprisDTO> listRdvprisDTO;
			
	private String duree;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String adresse;
	
	
	
	
	
	
}
