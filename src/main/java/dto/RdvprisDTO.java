package dto;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fr.cda.controle.beans.Account;

public class RdvprisDTO {
	private int id_rdv;
	
	

	private AccountDTO accountDTO;

	
	private String immatriculation;
	private String date;
	private String debut_heure;
	private String fin_heure;
	
	
}
