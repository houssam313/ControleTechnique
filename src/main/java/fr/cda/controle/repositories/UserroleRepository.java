
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import fr.cda.controle.beans.Userrole;


@Repository
public interface UserroleRepository extends JpaRepository<Userrole, Integer> {

	
	
}

