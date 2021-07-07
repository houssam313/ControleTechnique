package dto;

import java.util.Date;

import lombok.Data;

@Data
public class ExamenDTO {
private int id_examen;
	
	private Double ripage;
	
	private Double dyssimetrie;
	
	private Date date;
	
	private Double force_verticale;
	
	private String id_user;
	
	private Double desequilibre;
	
	private Double force_freinage;
	
	private Double co;
	
	private Double feux;
	
	private Boolean resultat;
	
	

}
