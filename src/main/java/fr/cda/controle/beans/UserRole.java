package fr.cda.controle.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="userRole")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role;
	private String role_user;
	
	@OneToMany( fetch = FetchType.EAGER , mappedBy="userRole")
	private Set<Account> listaccount;
	
	
	
	
	
	public UserRole() {
		super();
	}
	public UserRole(String role_user) {
		super();
		this.role_user = role_user;
	}
	public int getId_role() {
		return id_role;
	}
	public void setId_role(int id_role) {
		this.id_role = id_role;
	}
	public String getRole_user() {
		return role_user;
	}
	public void setRole_user(String role_user) {
		this.role_user = role_user;
	}
	public Set<Account> getListaccount() {
		return listaccount;
	}
	public void setListaccount(Set<Account> listaccount) {
		this.listaccount = listaccount;
	}
	@Override
	public String toString() {
		return  role_user ;
	}
	
	
}
