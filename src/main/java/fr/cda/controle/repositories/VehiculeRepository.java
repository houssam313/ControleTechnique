
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.cda.controle.beans.Bilan;
import fr.cda.controle.beans.Vehicule;



@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, String> {

	
	
}

