package fr.cda.controle.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="passer")
public class Passer {
	
	@EmbeddedId
	private IdPasser  id_passer;

	public IdPasser getId_passer() {
		return id_passer;
	}

	public void setId_passer(IdPasser id_passer) {
		this.id_passer = id_passer;
	}
		
}
