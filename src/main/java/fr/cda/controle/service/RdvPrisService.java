package fr.cda.controle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.RdvPris;
import fr.cda.controle.converter.RdvPrisConverter;
import fr.cda.controle.dto.RdvPrisDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.RdvPrisRepository;

@Service
public class RdvPrisService {
	
	@Autowired
	private RdvPrisRepository rdvPrisRepository;
	
	@Autowired
	private RdvPrisConverter rdvPrisConverter;
	
	@Autowired
	private AccountRepository accountRepository;

	public RdvPrisDTO getRdvPris(int id )  throws NotFoundException {
		
		
		RdvPris rdvPris= rdvPrisRepository.findById(id);
		if(rdvPris== null) {
			throw new NotFoundException();
		}
		return rdvPrisConverter.EntityToDTO(rdvPris);
		
	}
	
	
	public List<RdvPrisDTO> getListRdvPris(String email) throws NotFoundException {
		
		Account a = accountRepository.findByEmail(email);
		Set<RdvPris> listrdvPris = a.getListRdvpris();
		List<RdvPris> list = new ArrayList<>(listrdvPris);
		List<RdvPrisDTO> listDto = rdvPrisConverter.EntityToDTO(list);
		return listDto;
	}
	
	

	public List<RdvPrisDTO> getAllRdvPris() throws NotFoundException {	
		List<RdvPris> listRdvPris = rdvPrisRepository.findAll();
		if(listRdvPris == null) {
			throw new NotFoundException();
		}
		return rdvPrisConverter.EntityToDTO(listRdvPris);
	}

	public RdvPrisDTO addRdvPris(RdvPrisDTO rdvPrisDTO) throws AlreadyExistException{
		
		Account account = accountRepository.findByNom(rdvPrisDTO.getNom());
		RdvPris rdvPris = rdvPrisRepository.findById(rdvPrisDTO.getId());
		if(rdvPris == null)
		{
			rdvPris = rdvPrisConverter.dTOToEntity(rdvPrisDTO);
			rdvPris.setAccount(account);
			rdvPrisRepository.save(rdvPris);
		} else {
			throw new AlreadyExistException();
		}
		
		return rdvPrisDTO;
	}

	public void delete(int id ) throws NotFoundException {
		
		
		RdvPris rdvPris = rdvPrisRepository.findById(id);
		if(rdvPris == null) {
			throw new NotFoundException();
		}
		else
		{
			rdvPrisRepository.deleteById(id);
		}
	}

	
	public RdvPrisDTO update(RdvPrisDTO rdvPrisDTO) throws NotFoundException {

		Account account = accountRepository.findByNom(rdvPrisDTO.getNom());
		RdvPris rdvPris = rdvPrisRepository.findById(rdvPrisDTO.getId());
		if (rdvPris == null) {
			throw new NotFoundException();
		} else {
			rdvPris.setDate(rdvPrisDTO.getDate());
			rdvPris.setImmatriculation(rdvPrisDTO.getImmatriculation());
			rdvPris.setDebut_heure(rdvPrisDTO.getDebut_heure());
			rdvPris.setFin_heure(rdvPrisDTO.getFin_heure());
			rdvPris.setAccount(account);
			rdvPrisRepository.save(rdvPris);
			return rdvPrisConverter.EntityToDTO(rdvPris);
		}
	}

	
	
	
	

}
