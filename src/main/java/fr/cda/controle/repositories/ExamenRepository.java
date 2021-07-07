
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.cda.controle.beans.Examen;


@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {

	
	
}

