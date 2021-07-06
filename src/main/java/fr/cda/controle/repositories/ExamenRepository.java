package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cda.controle.beans.ActionType;
import fr.cda.controle.beans.Examen;

public interface ExamenRepository extends JpaRepository<Examen, Integer>{

}
