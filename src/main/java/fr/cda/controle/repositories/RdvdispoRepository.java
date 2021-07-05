
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Rdvdispo;


@Repository
public interface RdvdispoRepository extends JpaRepository<Rdvdispo, Integer> {

	
	
}

