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
@Table(name="status")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_status;
	
	private String type;
	
	  @OneToMany( fetch = FetchType.EAGER, mappedBy="status")
	  private Set<Account> listaccount;
	 
	
	

	public Status() {
		super();
	}

	public Status(String type) {
		super();
		this.type = type;
	}

	public int getId_status() {
		return id_status;
	}

	public void setId_status(int id_status) {
		this.id_status = id_status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public Set<Account> getListaccount() {
		return listaccount;
	}

	public void setListaccount(Set<Account> listaccount) {
		this.listaccount = listaccount;
	}

	@Override
	public String toString() {
		return  type ;
	}

	
	
}
