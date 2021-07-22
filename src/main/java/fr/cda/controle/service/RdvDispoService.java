package fr.cda.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.cda.controle.beans.RdvDispo;
import fr.cda.controle.converter.RdvDispoConverter;
import fr.cda.controle.dto.RdvDispoDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.RdvDispoRepository;

@Service
public class RdvDispoService {
	
	@Autowired
	private RdvDispoRepository rdvDispoRepository;
	
	@Autowired
	private RdvDispoConverter rdvDispoConverter;

	public RdvDispoDTO getRdvDispo(int id )  throws NotFoundException {
		RdvDispo rdvDispo= rdvDispoRepository.findById(id).get();
		if(rdvDispo== null) {
			throw new NotFoundException();
		}
		return rdvDispoConverter.EntityToDTO(rdvDispo);
	}

	public List<RdvDispoDTO> getAllRdvDispo() throws NotFoundException {	
		List<RdvDispo> listRdvDispo = rdvDispoRepository.findAll();
		if(listRdvDispo == null) {
			throw new NotFoundException();
		}
		return rdvDispoConverter.EntityToDTO(listRdvDispo);
	}

}
