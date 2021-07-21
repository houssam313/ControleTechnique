
package fr.cda.controle.repositories;

import java.util.List;

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


	Actions findById_actionsAccountAndActionTypeAndRdvPris(Account account, ActionType actionType, int id);
	
	
	@Query("select c from Carriere c where  c.id.iddept =?1 "+" and c.id.date = "
			+ "(select max(c2.id.date) from Carriere c2 where c2.id.idemp = c.id.idemp )" )
	List<Carriere> findListActuel(@Param("iddept") Dept dept);
	
}

