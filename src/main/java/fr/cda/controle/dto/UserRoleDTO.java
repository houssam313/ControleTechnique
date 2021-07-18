package fr.cda.controle.dto;

import java.util.Set;


import lombok.Data;

@Data
public class UserRoleDTO {


	private int id;
	private String role;
	
	private Set<AccountDTO> listaccountDTO;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<AccountDTO> getListaccountDTO() {
		return listaccountDTO;
	}

	public void setListaccountDTO(Set<AccountDTO> listaccountDTO) {
		this.listaccountDTO = listaccountDTO;
	}

	public UserRoleDTO(String role_user, Set<AccountDTO> listaccountDTO) {
		super();
		this.role = role_user;
		this.listaccountDTO = listaccountDTO;
	}

	public UserRoleDTO() {
		super();
	}

	@Override
	public String toString() {
		return "UserRoleDTO [id=" + id + ", role=" + role + ", listaccountDTO=" + listaccountDTO + "]";
	}
	
	
	
}
