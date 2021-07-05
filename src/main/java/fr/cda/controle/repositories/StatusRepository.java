
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Status;


@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {

	
	
}

