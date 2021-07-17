
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import fr.cda.controle.beans.RdvPris;


@Repository
public interface RdvPrisRepository extends JpaRepository<RdvPris, Integer> {

	
	
}

