package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="account")
public class Account {

	@Id
	private String id_user;
	
	@Column(name="mot_de_passe")
	private String password;
	
	@ManyToOne (cascade = CascadeType.REMOVE) 
	@JoinColumn( name="id_role")
	private Userrole userrole;
	
	@ManyToOne (cascade = CascadeType.REMOVE) 
	@JoinColumn( name="id_status")
	private Status status;
		
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="account")
	private Set<RdvPris> listRdvpris;
	
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="id_actions.account")
	private Set<Actions> listActions;
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="account")
	private Set<Examen> listExamen;		
	
	private String duree;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String adresse;
	
	
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	public Userrole getUserrole() {
		return userrole;
	}
	public void setUserrole(Userrole userrole) {
		this.userrole = userrole;
	}
	public Set<RdvPris> getListRdvpris() {
		return listRdvpris;
	}
	public void setListRdvpris(Set<RdvPris> listRdvpris) {
		this.listRdvpris = listRdvpris;
	}
	@Override
	public String toString() {
		return "Account [id_user=" + id_user + ", userrole=" + userrole + ", status=" + status + ", duree=" + duree
				+ ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", email=" + email + ", adresse=" + adresse
				+ "]";
	}
	
	
	
}
