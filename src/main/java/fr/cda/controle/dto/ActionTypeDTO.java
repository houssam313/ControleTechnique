package fr.cda.controle.dto;

import java.util.Set;

import lombok.Data;

@Data
public class ActionTypeDTO {


	private int id_action;
	
	private String type;
	
	private Set<ActionsDTO> listActions;

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

	public Set<ActionsDTO> getListActions() {
		return listActions;
	}

	public void setListActions(Set<ActionsDTO> listActions) {
		this.listActions = listActions;
	}

	
}
