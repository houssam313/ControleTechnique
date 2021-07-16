
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.cda.controle.beans.Bilan;
import fr.cda.controle.beans.Recu;



@Repository
public interface RecuRepository extends JpaRepository<Recu, Integer> {

	
	
}

