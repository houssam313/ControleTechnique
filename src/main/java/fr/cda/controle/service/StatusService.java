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

	public StatusDTO getStatus(int id) {
		return statusConverter.EntityToDTO(statusRepository.findById(id).get());
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
		
		 statusRepository.save(status);
		return status;
		
	
	}
	
	
	
	

}
