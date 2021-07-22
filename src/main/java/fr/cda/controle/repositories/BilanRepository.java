
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.cda.controle.beans.Bilan;



@Repository
public interface BilanRepository extends JpaRepository<Bilan, Integer> {

	Bilan findByVehiculeType(int id);

	
	
}

