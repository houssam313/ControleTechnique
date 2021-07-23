package fr.cda.controle.dto;

import java.util.Set;

import javax.transaction.Transactional;

import lombok.Data;

@Data
@Transactional
public class AccountDTO {

	private String password;
	private String userRole;
	private String status;
	
	private Set<RdvPrisDTO> listRdvpris;
	private Set<ExamenDTO> listExamen;
	
	//private List<integer>  listRdvpris;
	
	private String duree;
	private String nom;
	private String prenom;
	private String tel;
	private String email;
	private String adresse;

	public AccountDTO() {
		super();
	}

	public AccountDTO(String password, String userRole, String status, String duree, String nom, String prenom,
			String tel, String email, String adresse) {
		super();
		this.password = password;
		this.userRole = userRole;
		this.status = status;
		this.duree = duree;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.adresse = adresse;
	}


	public Set<RdvPrisDTO> getListRdvpris() {
		return listRdvpris;
	}

	public void setListRdvpris(Set<RdvPrisDTO> listRdvpris) {
		this.listRdvpris = listRdvpris;
	}

	public Set<ExamenDTO> getListExamen() {
		return listExamen;
	}

	public void setListExamen(Set<ExamenDTO> listExamen) {
		this.listExamen = listExamen;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "AccountDTO [nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}

}
