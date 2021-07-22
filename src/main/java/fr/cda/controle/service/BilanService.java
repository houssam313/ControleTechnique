package fr.cda.controle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.controle.beans.Bilan;
import fr.cda.controle.converter.BilanConverter;
import fr.cda.controle.dto.BilanDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.BilanRepository;
import fr.cda.controle.repositories.VehiculeTypeRepository;

@Service
public class BilanService {
	
	@Autowired
	private BilanRepository bilanRepository;
	
	@Autowired
	private VehiculeTypeRepository vehiculeTypeRepository ;
	
	@Autowired
	private BilanConverter bilanConverter;

	public BilanDTO getBilan(int id )  throws NotFoundException {
		Bilan bilan= bilanRepository.findById(id).get();
		if(bilan== null) {
			throw new NotFoundException();
		}
		return bilanConverter.EntityToDTO(bilan);
	}

}
