package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="userrole")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role;
	
	@Column(name="role")
	private String role;
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy="userRole")
	private Set<Account> listaccount;

	public UserRole(int id_role, String role, Set<Account> listaccount) {
		super();
		this.id_role = id_role;
		this.role = role;
		this.listaccount = listaccount;
	}

	public UserRole() {
		super();
	}

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<Account> getListaccount() {
		return listaccount;
	}

	public void setListaccount(Set<Account> listaccount) {
		this.listaccount = listaccount;
	}


	
	
	
}
