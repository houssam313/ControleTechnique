package fr.cda.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.controle.beans.VehiculeType;
import fr.cda.controle.converter.VehiculeTypeConverter;
import fr.cda.controle.dto.VehiculeTypeDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.VehiculeTypeRepository;

@Service
public class VehiculeTypeService {
	
	@Autowired
	private VehiculeTypeRepository vehiculeTypeRepository;
	
	@Autowired
	private VehiculeTypeConverter vehiculeTypeConverter;

	public VehiculeTypeDTO getVehiculeType(int id )  throws NotFoundException {
		VehiculeType VehiculeType= vehiculeTypeRepository.findById(id).get();
		if(VehiculeType== null) {
			throw new NotFoundException();
		}
		return vehiculeTypeConverter.EntityToDTO(VehiculeType);
	}

	public List<VehiculeTypeDTO> getAllVehiculeType() throws NotFoundException {	
		List<VehiculeType> listVehiculeType = vehiculeTypeRepository.findAll();
		if(listVehiculeType == null) {
			throw new NotFoundException();
		}
		return vehiculeTypeConverter.EntityToDTO(listVehiculeType);
	}

}
