
package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.cda.controle.beans.Examen;
import fr.cda.controle.beans.Vehicule;


@Repository
public interface ExamenRepository extends JpaRepository<Examen, Integer> {

	Examen findByDateAndVehicule(String date, Vehicule vehicule);

	
	
}

