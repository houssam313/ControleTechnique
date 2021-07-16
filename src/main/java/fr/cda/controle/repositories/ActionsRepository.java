
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.Actions;
import fr.cda.controle.beans.IdActions;


@Repository
public interface ActionsRepository extends JpaRepository<Actions, IdActions> {

	
	
}

