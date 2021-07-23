package fr.cda.controle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.cda.controle.beans.VehiculeType;


@Repository
public interface VehiculeTypeRepository extends JpaRepository<VehiculeType, Integer> {

	VehiculeType findByType(String vehiculeType);

	
	
}

