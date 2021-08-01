package fr.cda.controle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.Examen;
import fr.cda.controle.beans.RdvPris;
import fr.cda.controle.beans.Vehicule;
import fr.cda.controle.converter.ExamenConverter;
import fr.cda.controle.dto.ExamenDTO;
import fr.cda.controle.dto.RdvPrisDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.ExamenRepository;
import fr.cda.controle.repositories.VehiculeRepository;


@Service
public class ExamenService {
	
	@Autowired
	private ExamenRepository examenRepository;
	
	@Autowired
	private ExamenConverter examenConverter;
	
	@Autowired
	private VehiculeRepository  vehiculeRepository;
	
	
	@Autowired
	private AccountRepository accountRepository;

	public ExamenDTO getExamen(int id )  throws NotFoundException {
		Examen examen= examenRepository.findById(id).get();
		if(examen== null) {
			throw new NotFoundException();
		}
		return examenConverter.EntityToDTO(examen);
	}

	public List<ExamenDTO> getAllExamen() throws NotFoundException {	
		List<Examen> listExamen = examenRepository.findAll();
		if(listExamen == null) {
			throw new NotFoundException();
		}
		return examenConverter.EntityToDTO(listExamen);
	}

	public ExamenDTO addExamen(ExamenDTO examenDTO) throws AlreadyExistException{
		
		Vehicule vehicule = vehiculeRepository.findById(examenDTO.getImmatriculation()).get();
		Examen examen = examenRepository.findByDateAndVehicule(examenDTO.getDate(), vehicule);
		if(examen == null)
		{
			Examen exam = examenConverter.dTOToEntity(examenDTO);
			
			examenRepository.save(exam);
		} else {
			throw new AlreadyExistException();
		}
		
		return examenDTO;
	}

	public void delete(int id) throws NotFoundException {
		Examen examen= examenRepository.findById(id).get();
		if(examen == null) {
			throw new NotFoundException();
		}
		else
		{
			examenRepository.deleteById(id);
		}
	}

	public ExamenDTO update(ExamenDTO examenDTO) throws NotFoundException {
	
		Examen examen = examenRepository.findById(examenDTO.getId()).get();
		if(examen == null)
		{
			throw new NotFoundException();
		} else {
			Examen exam = examenConverter.dTOToEntity(examenDTO);
			examenRepository.save(exam);
			return examenDTO;
		}
		
	}

	public List<ExamenDTO> getListExamen(String email) {

			Account a = accountRepository.findByEmail(email);
			Set<Examen> listExamen = a.getListExamen();
			List<Examen> list = new ArrayList<>(listExamen);
			List<ExamenDTO> listDto = examenConverter.EntityToDTO(list);
			return listDto;
		
	}
	
	
	
	

}
