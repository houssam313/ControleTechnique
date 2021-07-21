
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.ActionType;


@Repository
public interface ActionTypeRepository extends JpaRepository<ActionType, Integer> {

	ActionType findByType(String type);

	
	
}

