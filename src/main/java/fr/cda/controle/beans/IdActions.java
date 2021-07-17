
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	public RdvPris getRdvPris() {
		return rdvPris;
	}

	public void setRdvPris(RdvPris rdvPris) {
		this.rdvPris = rdvPris;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}


	


	


