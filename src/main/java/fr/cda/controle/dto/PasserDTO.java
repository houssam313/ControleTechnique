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

	private int idexamen;
	private String idvehicule;
	private int idbilan;
	
	
	public int getIdexamen() {
		return idexamen;
	}
	public void setIdexamen(int idexamen) {
		this.idexamen = idexamen;
	}
	public String getIdvehicule() {
		return idvehicule;
	}
	public void setIdvehicule(String idvehicule) {
		this.idvehicule = idvehicule;
	}
	public int getIdbilan() {
		return idbilan;
	}
	public void setIdbilan(int idbilan) {
		this.idbilan = idbilan;
	}
	
	
	
	
	
}
