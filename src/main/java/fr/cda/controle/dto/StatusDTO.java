package fr.cda.controle.dto;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
public class StatusDTO {

	private String type;
	private Set<AccountDTO> listaccountDTO;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set<AccountDTO> getListaccountDTO() {
		return listaccountDTO;
	}
	public void setListaccountDTO(Set<AccountDTO> listaccountDTO) {
		this.listaccountDTO = listaccountDTO;
	}
	 
	
	
}
