package fr.cda.controle.beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private List<Account> Listaccount;
	
	
	public void setId_status(int id_status) {
		this.id_status = id_status;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setListaccount(List<Account> Listaccount) {
		this.Listaccount = Listaccount;
	}


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

	public void SetId_status(int id_status) {
		this.id_status = id_status;
	}

	public String getType() {
		return type;
	}

	public void SetType(String type) {
		this.type = type;
	}

	
	public List<Account> getListaccount() {
		return Listaccount;
	}

	public void SetListaccount(List<Account> Listaccount) {
		this.Listaccount = Listaccount;
	}

	@Override
	public String toString() {
		return  type ;
	}

	
	
}
