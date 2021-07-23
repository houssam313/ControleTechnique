
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cda.controle.beans.Examen;
import fr.cda.controle.beans.IdPasser;
import fr.cda.controle.beans.Passer;
import fr.cda.controle.dto.PasserDTO;


@Repository
public interface PasserRepository extends JpaRepository<Passer, IdPasser> {


	
}

