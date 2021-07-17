package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.CascadeType;

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
@Table(name="rdvpris")
public class RdvPris {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_rdv;
	
	
	@ManyToOne (cascade = CascadeType.REMOVE) 
	@JoinColumn( name="id_user", nullable = false)
	private Account account;

	
	@OneToMany( fetch = FetchType.EAGER, mappedBy="id_actions.rdvPris")
	private Set<Actions> listActions;
	
	
	private String immatriculation;
	private String date;
	private String debut_heure;
	private String fin_heure;
	
	
	public RdvPris() {
		super();
	}
	
	public RdvPris( Account account,  String immatriculation, String date,
			String debut_heure, String fin_heure) {
		super();
		this.account = account;
		this.immatriculation = immatriculation;
		this.date = date;
		this.debut_heure = debut_heure;
		this.fin_heure = fin_heure;
	}
	public int getId_rdv() {
		return id_rdv;
	}
	public void setId_rdv(int id_rdv) {
		this.id_rdv = id_rdv;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDebut_heure() {
		return debut_heure;
	}
	public void setDebut_heure(String debut_heure) {
		this.debut_heure = debut_heure;
	}
	public String getFin_heure() {
		return fin_heure;
	}
	public void setFin_heure(String fin_heure) {
		this.fin_heure = fin_heure;
	}
	@Override
	public String toString() {
		return "Rdvpris [id_rdv=" + id_rdv + ", account=" + account + ", immatriculation=" + immatriculation + ", date="
				+ date + ", debut_heure=" + debut_heure + ", fin_heure=" + fin_heure + "]";
	}
	
	
	
}
