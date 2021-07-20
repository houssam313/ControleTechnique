
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.controle.beans.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

	Account findByEmail(String email);

	@Transactional
	void deleteByEmail(String email);

	
	
}

