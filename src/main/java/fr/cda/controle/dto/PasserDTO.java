package fr.cda.controle.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
public class PasserDTO implements Serializable{

	private ExamenDTO examenDTO;
	private VehiculeDTO vehiculeDTO;
	private BilanDTO bilanDTO;
	
}
