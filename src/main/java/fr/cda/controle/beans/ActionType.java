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
	
	@OneToMany( fetch = FetchType.EAGER, mappedBy="id_actions.actionType")
	private Set<Actions> listActions;

	public ActionType() {
		super();
	}

	public ActionType(String type_action) {
		super();
		this.type_action = type_action;
		
	}

	public String getType_action() {
		return type_action;
	}

	public void setType_action(String type_action) {
		this.type_action = type_action;
	}

	public Set<Actions> getListActions() {
		return listActions;
	}

	public void setListActions(Set<Actions> listActions) {
		this.listActions = listActions;
	}

	@Override
	public String toString() {
		return "ActionType [id_action=" + id_action + ", type_action=" + type_action + ", listActions=" + listActions
				+ "]";
	}
	
	
	
}
