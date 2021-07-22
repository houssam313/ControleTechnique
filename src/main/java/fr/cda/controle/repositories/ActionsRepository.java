
package fr.cda.controle.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.ActionType;
import fr.cda.controle.beans.Actions;
import fr.cda.controle.beans.IdActions;



@Repository
public interface ActionsRepository extends JpaRepository<Actions, IdActions> {





	
}

