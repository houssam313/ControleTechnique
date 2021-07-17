package fr.cda.controle.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="passer")
public class Passer {
	
	@EmbeddedId
	private IdPasser  id_passer;
		
}
