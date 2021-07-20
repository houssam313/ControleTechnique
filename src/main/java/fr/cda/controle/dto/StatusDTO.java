package fr.cda.controle.dto;

import java.util.List;
import lombok.Data;

@Data
public class StatusDTO {

	private String type;
	
	

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "StatusDTO [type=" + type + "]";
	}

	
	 
	
	
}
