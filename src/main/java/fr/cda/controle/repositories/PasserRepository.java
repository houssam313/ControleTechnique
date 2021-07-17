
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Examen;
import fr.cda.controle.beans.Passer;


@Repository
public interface PasserRepository extends JpaRepository<Passer, Examen> {
	
}

