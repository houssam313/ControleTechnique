
package fr.cda.controle.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.RdvPris;


@Repository
public interface RdvPrisRepository extends JpaRepository<RdvPris, Integer> {

	RdvPris findByAccount(Account account);

	RdvPris findById(int id);

	
	
}

