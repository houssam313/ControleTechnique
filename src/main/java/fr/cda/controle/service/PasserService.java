package fr.cda.controle.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.controle.beans.IdPasser;
import fr.cda.controle.beans.Passer;
import fr.cda.controle.beans.Passer;
import fr.cda.controle.converter.PasserConverter;
import fr.cda.controle.dto.PasserDTO;
import fr.cda.controle.dto.PasserDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.BilanRepository;
import fr.cda.controle.repositories.ExamenRepository;
import fr.cda.controle.repositories.PasserRepository;
import fr.cda.controle.repositories.StatusRepository;
import fr.cda.controle.repositories.UserRoleRepository;
import fr.cda.controle.repositories.VehiculeRepository;


@Service
@Transactional
public class PasserService {
	
	@Autowired
	private PasserRepository passerRepository;
	
	@Autowired
	private ExamenRepository examenRepository;
	
	@Autowired
	private PasserConverter passerConverter;
	
	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	
	@Autowired
	private BilanRepository bilanRepository;


	  public List<PasserDTO> getAllPasser() throws NotFoundException {
	  List<Passer> listPasser = passerRepository.findAll(); 
	  if(listPasser == null)
	  { 
		  throw new NotFoundException(); 
	  }
	  return  passerConverter.EntityToDTO(listPasser); 
	  }
	  
	
		public PasserDTO addPasser(PasserDTO s) throws AlreadyExistException {

			IdPasser  idPasser = new IdPasser(examenRepository.findById(s.getIdexamen()).get(),
					vehiculeRepository.findById(s.getIdvehicule()).get(),
					bilanRepository.findById(s.getIdbilan()).get());
			if (!passerRepository.existsById(idPasser) )
			{
				passerRepository.save(passerConverter.dTOToEntity(s));
				
			} else
			{ throw new AlreadyExistException(); }
				 

			return s;
		}


}
