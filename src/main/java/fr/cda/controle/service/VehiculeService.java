package fr.cda.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.controle.beans.Vehicule;
import fr.cda.controle.beans.VehiculeType;
import fr.cda.controle.converter.VehiculeConverter;
import fr.cda.controle.dto.VehiculeDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.VehiculeRepository;
import fr.cda.controle.repositories.VehiculeTypeRepository;

@Service
public class VehiculeService {
	
	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	@Autowired
	private VehiculeConverter vehiculeConverter;
	
	
	@Autowired
	VehiculeTypeRepository vehiculeTypeRepository;

	public VehiculeDTO getVehicule(String type )  throws NotFoundException {
		Vehicule vehicule= vehiculeRepository.findById(type).get();
		if(vehicule== null) {
			throw new NotFoundException();
		}
		return vehiculeConverter.EntityToDTO(vehicule);
	}

	public List<VehiculeDTO> getAllVehicule() throws NotFoundException {	
		List<Vehicule> listVehicule = vehiculeRepository.findAll();
		if(listVehicule == null) {
			throw new NotFoundException();
		}
		return vehiculeConverter.EntityToDTO(listVehicule);
	}

	public VehiculeDTO addVehicule(VehiculeDTO vehiculeDTO) throws AlreadyExistException{
		
		
		Vehicule vehicule = vehiculeRepository.findById(vehiculeDTO.getImmatriculation()).orElse(null);
		if(vehicule == null)
		{
			VehiculeType type = vehiculeTypeRepository.findByType(vehiculeDTO.getVehiculeType());
			 vehicule = vehiculeConverter.dTOToEntity(vehiculeDTO);
			vehicule.setVehiculeType(type);
			
			vehiculeRepository.save(vehicule);
		} else {
			throw new AlreadyExistException();
		}
		
		return vehiculeDTO;
	}

	public void delete(String id) throws NotFoundException {
		Vehicule vehicule = vehiculeRepository.findById(id).get();
		if(vehicule == null) {
			throw new NotFoundException();
		}
		else
		{
			vehiculeRepository.deleteById(id);
		}
	}

	public VehiculeDTO update(VehiculeDTO vehiculeDTO) throws NotFoundException {
	
		Vehicule vehicule = vehiculeRepository.findById(vehiculeDTO.getImmatriculation()).get();
		if(vehicule == null)
		{
			throw new NotFoundException();
		} else {
			vehicule =  vehiculeConverter.dTOToEntity(vehiculeDTO);
			VehiculeType type = vehiculeTypeRepository.findByType(vehiculeDTO.getVehiculeType());
			vehicule.setVehiculeType(type);
			vehiculeRepository.save(vehicule);
			return vehiculeDTO;
		}
		
	}
	
	
	
	

}
