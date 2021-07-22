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
	
	private String type;
	
	@OneToMany( fetch = FetchType.EAGER, mappedBy="id_actions.actionType")
	private Set<Actions> listActions;

	public ActionType() {
		super();
	}

	public int getId_action() {
		return id_action;
	}

	public void setId_action(int id_action) {
		this.id_action = id_action;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ActionType(String type_action) {
		super();
		this.type = type_action;
		
	}

	public String getType_action() {
		return type;
	}

	public void setType_action(String type_action) {
		this.type = type_action;
	}

	public Set<Actions> getListActions() {
		return listActions;
	}

	public void setListActions(Set<Actions> listActions) {
		this.listActions = listActions;
	}

	@Override
	public String toString() {
		return "ActionType =" + type ;
				
	}
	
	
	
}
