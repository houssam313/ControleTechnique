package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="action_type")
public class ActionType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_action;
	
	private String type_action;
	
	@OneToMany( fetch = FetchType.EAGER, mappedBy="status")
	private Set<Account> listaccount;

	
	
	
	public ActionType(int id_action, String type_action) {
		super();
		this.id_action = id_action;
		this.type_action = type_action;
	}

	public ActionType() {
		
	}



	public int getId_action() {
		return id_action;
	}




	public void setId_action(int id_action) {
		this.id_action = id_action;
	}




	public String getType_action() {
		return type_action;
	}




	public void setType_action(String type_action) {
		this.type_action = type_action;
	}
	
	
	
	
}
