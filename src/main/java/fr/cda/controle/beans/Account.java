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
	private UserRole userRole;
	
	@ManyToOne (cascade = CascadeType.REMOVE) 
	@JoinColumn( name="id_status")
	private Status status;
		
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="account")
	private Set<RdvPris> listRdvpris;
	
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="id_actions.account")
	private Set<Actions> listAction;
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy ="account")
	private Set<Examen> listExamen;		
	
	private String duree;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String adresse;
	
	
	public Account() {
		super();
	}
	
	
	public Account(String password, UserRole userrole, Status status, String duree, String nom, String prenom, String tel,
			String email, String adresse) {
		super();
		this.password = password;
		this.userRole = userrole;
		this.status = status;
		this.duree = duree;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.adresse = adresse;
	}
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
	
	
	
	public UserRole getUserrole() {
		return userRole;
	}
	public void setUserrole(UserRole userRole) {
		this.userRole = userRole;
	}
	public Set<RdvPris> getListRdvpris() {
		return listRdvpris;
	}
	public void setListRdvpris(Set<RdvPris> listRdvpris) {
		this.listRdvpris = listRdvpris;
	}
	@Override
	public String toString() {
		return "Account [id_user=" + id_user + ", userrole=" + userRole + ", status=" + status + ", duree=" + duree
				+ ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", email=" + email + ", adresse=" + adresse
				+ "]";
	}
	
	
}
