
package fr.cda.controle.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class IdActions implements Serializable {

	private static final long serialVersionUID = 1L;


	@ManyToOne()
	@JoinColumn(name = "id_user")
	private Account account;


	@ManyToOne()
	@JoinColumn(name = "id_action")
	private ActionType actionType;

	
	@ManyToOne()
	@JoinColumn(name = "id_rdv")
	private RdvPris rdvPris;
	
	private Date date;
}


	


	


