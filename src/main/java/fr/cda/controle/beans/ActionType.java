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
	
	
	
}
