package fr.cda.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.controle.beans.Status;
import fr.cda.controle.converter.StatusConverter;
import fr.cda.controle.dto.StatusDTO;
import fr.cda.controle.repositories.StatusRepository;

@Service
public class StatusService {
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired
	private StatusConverter statusConverter;

	public StatusDTO getStatus(String type ) {
		return statusConverter.EntityToDTO(statusRepository.findByType(type));
	}

	public List<StatusDTO> getAllStatus() {	
		return statusConverter.EntityToDTO(statusRepository.findAll());
	}

	public Status save(StatusDTO statusDTO) {
		Status status = statusRepository.save(statusConverter.dTOToEntity(statusDTO));
		return status;
	}

	public void delete(int id) {
		statusRepository.deleteById(id);
		
	}

	public Status update(int id,StatusDTO statusDTO) {
		Status status = statusConverter.dTOToEntity(statusDTO);
		Status statusplus = statusRepository.findById(id).get();
		statusplus.setType(status.getType());
		statusRepository.save(statusplus);
		return statusplus;
	}
	
	
	
	

}
