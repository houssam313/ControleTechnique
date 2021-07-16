package fr.cda.controle.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="actions")
public class Actions {

	@EmbeddedId
	private IdActions  id_actions;
	
	private String motif;
	
	
	public Actions(IdActions id_actions, String motif) {
		super();
		this.id_actions = id_actions;
		this.motif = motif;
	}
	public Actions() {
		super();
	}
	public IdActions getId_actions() {
		return id_actions;
	}
	public void setId_actions(IdActions id_actions) {
		this.id_actions = id_actions;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	@Override
	public String toString() {
		return "Actions [id_actions=" + id_actions + ", motif=" + motif + "]";
	}
	
	
	
}
