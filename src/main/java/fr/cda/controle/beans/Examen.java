package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.Column;
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

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="examen")
public class Examen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name="id_examen")
	private int id;
	private int visit_number;
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
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "immatriculation")
	private Vehicule vehicule;
	
	
	private boolean resultat;
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="examen")
	private Set<Recu> listRecu;

	public Examen(int id, int visit_number, double ripage, double dissymetrie, String date, double force_verticale,
			double desequilibre, double force_freinage, double co, Account account, Vehicule vehicule,
			boolean resultat) {
		super();
		this.id = id;
		this.visit_number = visit_number;
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





	public int getVisit_number() {
		return visit_number;
	}



	public void setVisit_number(int visit_number) {
		this.visit_number = visit_number;
	}



	public Set<Recu> getListRecu() {
		return listRecu;
	}



	public void setListRecu(Set<Recu> listRecu) {
		this.listRecu = listRecu;
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
		return "Examen [id_examen=" + id + ", ripage=" + ripage + ", dissymetrie=" + dissymetrie + ", date="
				+ date + ", force_verticale=" + force_verticale + ", desequilibre=" + desequilibre + ", force_freinage="
				+ force_freinage + ", co=" + co + ", account=" + account + ", vehicule=" + vehicule + ", resultat="
				+ resultat + "]";
	}
	
	
	
}
