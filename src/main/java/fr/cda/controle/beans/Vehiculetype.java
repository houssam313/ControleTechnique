package fr.cda.controle.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

	@Entity
	@Table(name="vehiculetype")
	public class Vehiculetype {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id_typevehicule;
		
		String type_vehicule;
		
		//======================= GETTER SETTER FOR id_typevehicule ============================
		public int getId_typevehicule() {
			return id_typevehicule;
		}
		public void setId_typevehicule(int id_typevehicule) {
			this.id_typevehicule = id_typevehicule;
		}
		
		//======================= GETTER SETTER FOR Type_vehicule ============================	
		public String getType_vehicule() {
			return type_vehicule;
		}
		public void setType_vehicule(String type_vehicule) {
			this.type_vehicule = type_vehicule;
		}
				
		//========================= BUILDER ========================
	
		public Vehiculetype(String type_vehicule) {
			super();
			this.type_vehicule = type_vehicule;
		}
	
	
}


//  voiçi mes table pour PostgreSQL vehiculetype, vehicule,bilan