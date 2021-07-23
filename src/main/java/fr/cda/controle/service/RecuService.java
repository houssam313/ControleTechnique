package fr.cda.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.controle.beans.Recu;
import fr.cda.controle.converter.RecuConverter;
import fr.cda.controle.dto.RecuDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.ExamenRepository;
import fr.cda.controle.repositories.RecuRepository;

@Service
public class RecuService {
	
	@Autowired
	private RecuRepository recuRepository;
	
	@Autowired
	private RecuConverter recuConverter;
	
	@Autowired
	private ExamenRepository examenRepository;

	public RecuDTO getRecu(int id )  throws NotFoundException {
		Recu recu= recuRepository.findById(id).get();
		if(recu== null) {
			throw new NotFoundException();
		}
		return recuConverter.EntityToDTO(recu);
	}

	public List<RecuDTO> getAllRecu() throws NotFoundException {	
		List<Recu> listRecu = recuRepository.findAll();
		if(listRecu == null) {
			throw new NotFoundException();
		}
		return recuConverter.EntityToDTO(listRecu);
	}

	public RecuDTO addRecu(RecuDTO recuDTO) throws AlreadyExistException{
		
		Recu recu = recuRepository.findByDateAndExamen(recuDTO.getDate(),examenRepository.findById(recuDTO.getIdexamen()).get() );
		if(recu == null)
		{
			recuRepository.save(recuConverter.dTOToEntity(recuDTO));
		} else {
			throw new AlreadyExistException();
		}
		
		return recuDTO;
	}

	public void delete(int id) throws NotFoundException {
		Recu recu = recuRepository.findById(id).get();
		if(recu == null) {
			throw new NotFoundException();
		}
		else
		{
			recuRepository.deleteById(id);
		}
	}


		
	}
	
	
	
	


