package fr.cda.controle.beans;

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

@Entity
@Table(name="examen")
public class Examen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_examen;
	
	private double ripage;
	private double dissymetrie;
	private String date;
	private double force_verticale;
	private double desequilibre;
	private double force_freinage;
	private double co;
	
	@ManyToOne()
	@JoinColumn(name = "id_user")
	private Account account;
	
	@ManyToOne()
	@JoinColumn(name = "immatriculation")
	private Vehicule vehicule;
	
	
	private boolean resultat;
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="examen")
	private Set<Recu> listRecu;

	

	public Examen( double ripage, double dissymetrie, String date, double force_verticale,
			double desequilibre, double force_freinage, double co, Account account, Vehicule vehicule, boolean resultat
			) {
		super();
		this.ripage = ripage;
		this.dissymetrie = dissymetrie;
		this.date = date;
		this.force_verticale = force_verticale;
		this.desequilibre = desequilibre;
		this.force_freinage = force_freinage;
		this.co = co;
		this.account = account;
		this.vehicule = vehicule;
		this.resultat = resultat;
	}

	

	public Examen() {
		super();
	}



	public Set<Recu> getListRecu() {
		return listRecu;
	}



	public void setListRecu(Set<Recu> listRecu) {
		this.listRecu = listRecu;
	}



	public int getId_examen() {
		return id_examen;
	}


	public void setId_examen(int id_examen) {
		this.id_examen = id_examen;
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


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public Vehicule getVehicule() {
		return vehicule;
	}


	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}


	public boolean isResultat() {
		return resultat;
	}


	public void setResultat(boolean resultat) {
		this.resultat = resultat;
	}


	@Override
	public String toString() {
		return "Examen [id_examen=" + id_examen + ", ripage=" + ripage + ", dissymetrie=" + dissymetrie + ", date="
				+ date + ", force_verticale=" + force_verticale + ", desequilibre=" + desequilibre + ", force_freinage="
				+ force_freinage + ", co=" + co + ", account=" + account + ", vehicule=" + vehicule + ", resultat="
				+ resultat + "]";
	}
	
	
	
}
