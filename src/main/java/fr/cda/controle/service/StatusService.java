package fr.cda.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.controle.beans.Status;
import fr.cda.controle.converter.StatusConverter;
import fr.cda.controle.dto.StatusDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.StatusRepository;

@Service
public class StatusService {
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired
	private StatusConverter statusConverter;

	public StatusDTO getStatus(String type )  throws NotFoundException {
		Status status= statusRepository.findByType(type);
		if(status== null) {
			throw new NotFoundException();
		}
		return statusConverter.EntityToDTO(status);
	}

	public List<StatusDTO> getAllStatus() throws NotFoundException {	
		List<Status> listStatus = statusRepository.findAll();
		if(listStatus == null) {
			throw new NotFoundException();
		}
		System.out.println(statusRepository.findAll());
		return statusConverter.EntityToDTO(listStatus);
	}

	public StatusDTO addStatus(StatusDTO statusDTO) throws AlreadyExistException{
		
		String type = statusDTO.getType();
		Status status = statusRepository.findByType(type);
		if(status == null)
		{
			statusRepository.save(statusConverter.dTOToEntity(statusDTO));
		} else {
			throw new AlreadyExistException();
		}
		
		return statusDTO;
	}

	public void delete(int id) throws NotFoundException {
		Status status = statusRepository.findById(id).get();
		if(status == null) {
			throw new NotFoundException();
		}
		else
		{
			statusRepository.deleteById(id);
		}
	}

	public StatusDTO update(int id,StatusDTO statusDTO) throws NotFoundException {
		Status status = statusConverter.dTOToEntity(statusDTO);
		Status statusplus = statusRepository.findById(id).get();
		if(statusplus == null)
		{
			throw new NotFoundException();
		} else {
			statusplus.setType(status.getType());
			statusRepository.save(statusplus);
			return statusConverter.EntityToDTO(statusplus);
		}
		
	}
	
	
	
	

}
