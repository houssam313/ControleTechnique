
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import fr.cda.controle.beans.Rdvpris;


@Repository
public interface RdvprisRepository extends JpaRepository<Rdvpris, Integer> {

	
	
}

