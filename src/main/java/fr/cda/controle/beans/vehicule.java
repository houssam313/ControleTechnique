package fr.cda.controle.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



	@Entity
	@Table(name="vehicule")
	public class vehicule { 
		
		@Id
		String immatriculation;                     //PK
		
		@OneToOne(cascade={CascadeType.ALL})     //to PERSIST, MERGE, REMOVE, REFRESH, DETACH.
		@JoinColumn(name="id_typevehicule")
	    Vehiculetype id_typevehicule; 				//FK
		
		String proprietaire;		
		String date_mis_en_circulation;    
		String annee;
		String modele; 
		int puissance; 
		String carburant;
		
		//======================= GETTER SETTER  ============================
		//================== immat=========================
		public String getImmatriculation() {
			return immatriculation;
		}
		public void setImmatriculation(String immatriculation) {
			this.immatriculation = immatriculation;
		}
		
		
		//====Id_typevehicule  ===
		public Vehiculetype getId_typevehicule() {
			return id_typevehicule;
		}
		public void setId_typevehicule(Vehiculetype id_typevehicule) {
			this.id_typevehicule = id_typevehicule;
		}
		
		
		//================== proprietaire =========================
		public String getProprietaire() {
			return proprietaire;
		}
		public void setProprietaire(String proprietaire) {
			this.proprietaire = proprietaire;
		}	
		
		//================== date_mis_en_circulation=========================
		public String getDate_mis_en_circulation() {
			return date_mis_en_circulation;
		}
		public void setDate_mis_en_circulation(String date_mis_en_circulation) {
			this.date_mis_en_circulation = date_mis_en_circulation;
		}
		
		//================== annee =========================
		public String getAnnee() {
			return annee;
		}
		public void setAnnee(String annee) {
			this.annee = annee;
		}
		
		//================== modele =========================
		public String getModele() {
			return modele;
		}
		public void setModele(String modele) {
			this.modele = modele;
		}
		
		//================== puissance =========================
		public int getPuissance() {
			return puissance;
		}
		public void setPuissance(int puissance) {
			this.puissance = puissance;
		}
		
		
		//================== carburant =========================
		public String getCarburant() {
			return carburant;
		}
		public void setCarburant(String carburant) {
			this.carburant = carburant;
		} 
		
		

		
	
		
	
		
		
	
		
	
	
			
	} 
	
	
