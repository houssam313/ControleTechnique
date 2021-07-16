package fr.cda.controle.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
public class RdvdispoDTO {


	private String jour;
	private String debut_heure;
	private String fin_heure;
	private String duree;

}
