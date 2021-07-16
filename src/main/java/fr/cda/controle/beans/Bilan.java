package fr.cda.controle.beans;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="bilan")
public class Bilan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_bilan;
	
	private int id_typevehicule;
	private double ripage_min;
	private double ripage_max;
	private double dissymetrie_min;
	private double dissymetrie_max;
	private double force_verticale_min;
	private double force_verticale_max;
	private double desequilibre_min;
	private double desequilibre_max;
	private double force_freinage_min;
	private double force_freinage_max;
	private double co_min;
	private double co_max;
	
	
	@OneToOne( fetch = FetchType.EAGER)
	@JoinColumn(name ="bilan")
	VehiculeType vehiculeType;
	
	@OneToMany (cascade = CascadeType.REMOVE, mappedBy="bilan") 
	private Set<Passer>  listPasser;
	
	
	public Bilan() {
		super();
	}


	public Bilan(int id_typevehicule, double ripage_min, double ripage_max, double dissymetrie_min,
			double dissymetrie_max, double force_verticale_min, double force_verticale_max, double desequilibre_min,
			double desequilibre_max, double force_freinage_min, double force_freinage_max, double co_min, double co_max) {
		super();
		this.id_typevehicule = id_typevehicule;
		this.ripage_min = ripage_min;
		this.ripage_max = ripage_max;
		this.dissymetrie_min = dissymetrie_min;
		this.dissymetrie_max = dissymetrie_max;
		this.force_verticale_min = force_verticale_min;
		this.force_verticale_max = force_verticale_max;
		this.desequilibre_min = desequilibre_min;
		this.desequilibre_max = desequilibre_max;
		this.force_freinage_min = force_freinage_min;
		this.force_freinage_max = force_freinage_max;
		this.co_min = co_min;
		this.co_max = co_max;

	}


	public int getId_bilan() {
		return id_bilan;
	}


	public void setId_bilan(int id_bilan) {
		this.id_bilan = id_bilan;
	}


	public int getId_typevehicule() {
		return id_typevehicule;
	}


	public void setId_typevehicule(int id_typevehicule) {
		this.id_typevehicule = id_typevehicule;
	}


	public double getRipage_min() {
		return ripage_min;
	}


	public void setRipage_min(double ripage_min) {
		this.ripage_min = ripage_min;
	}


	public double getRipage_max() {
		return ripage_max;
	}


	public void setRipage_max(double ripage_max) {
		this.ripage_max = ripage_max;
	}


	public double getDissymetrie_min() {
		return dissymetrie_min;
	}


	public void setDissymetrie_min(double dissymetrie_min) {
		this.dissymetrie_min = dissymetrie_min;
	}


	public double getDissymetrie_max() {
		return dissymetrie_max;
	}


	public void setDissymetrie_max(double dissymetrie_max) {
		this.dissymetrie_max = dissymetrie_max;
	}


	public double getForce_verticale_min() {
		return force_verticale_min;
	}


	public void setForce_verticale_min(double force_verticale_min) {
		this.force_verticale_min = force_verticale_min;
	}


	public double getForce_verticale_max() {
		return force_verticale_max;
	}


	public void setForce_verticale_max(double force_verticale_max) {
		this.force_verticale_max = force_verticale_max;
	}


	public double getDesequilibre_min() {
		return desequilibre_min;
	}


	public void setDesequilibre_min(double desequilibre_min) {
		this.desequilibre_min = desequilibre_min;
	}


	public double getDesequilibre_max() {
		return desequilibre_max;
	}


	public void setDesequilibre_max(double desequilibre_max) {
		this.desequilibre_max = desequilibre_max;
	}


	public double getForce_freinage_min() {
		return force_freinage_min;
	}


	public void setForce_freinage_min(double force_freinage_min) {
		this.force_freinage_min = force_freinage_min;
	}


	public double getForce_freinage_max() {
		return force_freinage_max;
	}


	public void setForce_freinage_max(double force_freinage_max) {
		this.force_freinage_max = force_freinage_max;
	}


	public double getCo_min() {
		return co_min;
	}


	public void setCo_min(double co_min) {
		this.co_min = co_min;
	}


	public double getCo_max() {
		return co_max;
	}


	public void setCo_max(double co_max) {
		this.co_max = co_max;
	}




	@Override
	public String toString() {
		return "Bilan [id_bilan=" + id_bilan + ", id_typevehicule=" + id_typevehicule + ", ripage_min=" + ripage_min
				+ ", ripage_max=" + ripage_max + ", dissymetrie_min=" + dissymetrie_min + ", dissymetrie_max="
				+ dissymetrie_max + ", force_verticale_min=" + force_verticale_min + ", force_verticale_max="
				+ force_verticale_max + ", desequilibre_min=" + desequilibre_min + ", desequilibre_max="
				+ desequilibre_max + ", force_freinage_min=" + force_freinage_min + ", force_freinage_max="
				+ force_freinage_max + ", co_min=" + co_min + ", co_max=" + co_max + ", vehiculeType=" + vehiculeType
				+ "]";
	}
	
	
	

}
