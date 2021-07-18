
package fr.cda.controle.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.UserRole;




@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {

	UserRole findByRole(String role);

	
	
	
}

