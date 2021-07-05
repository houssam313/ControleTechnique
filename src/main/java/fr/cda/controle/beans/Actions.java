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
	
}
