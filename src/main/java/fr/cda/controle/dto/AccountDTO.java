package fr.cda.controle.dto;

import java.util.Set;

import javax.transaction.Transactional;

import lombok.Data;

@Data
@Transactional
public class AccountDTO {

	private String userRole;
	private String status;
	private Set<Integer> listRdvprisn;
	private Set<Integer> listExamenn;
	private Set<String> listVehicule;

	// private List<integer> listRdvpris;

	private String duree;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String adresse;

	public AccountDTO() {
		super();
	}

	public AccountDTO(String userRole, String status, String duree, String nom, String prenom, String tel, String email,
			String adresse) {
		super();
		this.userRole = userRole;
		this.status = status;
		this.duree = duree;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.adresse = adresse;
	}

	public Set<String> getListVehicule() {
		return listVehicule;
	}

	public void setListVehicule(Set<String> listVehicule) {
		this.listVehicule = listVehicule;
	}

	public Set<Integer> getListRdvprisn() {
		return listRdvprisn;
	}

	public void setListRdvprisn(Set<Integer> listRdvprisn) {
		this.listRdvprisn = listRdvprisn;
	}

	public Set<Integer> getListExamenn() {
		return listExamenn;
	}

	public void setListExamenn(Set<Integer> listExamenn) {
		this.listExamenn = listExamenn;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserRole() {
		return userRole;
	}

	public String getStatus() {
		return status;
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

	@Override
	public String toString() {
		return "AccountDTO [userRole=" + userRole + ", status=" + status + ", listRdvprisn=" + listRdvprisn
				+ ", listExamenn=" + listExamenn + ", duree=" + duree + ", nom=" + nom + ", prenom=" + prenom + ", tel="
				+ tel + ", email=" + email + ", adresse=" + adresse + "]";
	}

}
