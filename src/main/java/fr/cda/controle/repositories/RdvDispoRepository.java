
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.RdvDispo;


@Repository
public interface RdvDispoRepository extends JpaRepository<RdvDispo, Integer> {

	
	
}

