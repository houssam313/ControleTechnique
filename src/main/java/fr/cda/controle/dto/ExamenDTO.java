package fr.cda.controle.dto;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
public class ExamenDTO {

	private int id;
	private double ripage;
	private double dissymetrie;
	private String date;
	private double force_verticale;
	private double desequilibre;
	private double force_freinage;
	private double co;
	private boolean resultat;
	private String id_user;
	private String immatriculation;
	private int visit_number;
	
	
	public int getVisit_number() {
		return visit_number;
	}
	public void setVisit_number(int visit_number) {
		this.visit_number = visit_number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRipage() {
		return ripage;
	}
	public void setRipage(double ripage) {
		this.ripage = ripage;
	}
	public double getDissymetrie() {
		return dissymetrie;
	}
	public void setDissymetrie(double dissymetrie) {
		this.dissymetrie = dissymetrie;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getForce_verticale() {
		return force_verticale;
	}
	public void setForce_verticale(double force_verticale) {
		this.force_verticale = force_verticale;
	}
	public double getDesequilibre() {
		return desequilibre;
	}
	public void setDesequilibre(double desequilibre) {
		this.desequilibre = desequilibre;
	}
	public double getForce_freinage() {
		return force_freinage;
	}
	public void setForce_freinage(double force_freinage) {
		this.force_freinage = force_freinage;
	}
	public double getCo() {
		return co;
	}
	public void setCo(double co) {
		this.co = co;
	}
	public boolean isResultat() {
		return resultat;
	}
	public void setResultat(boolean resultat) {
		this.resultat = resultat;
	}
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	

}
