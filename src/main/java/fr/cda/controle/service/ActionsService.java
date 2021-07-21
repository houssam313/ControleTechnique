package fr.cda.controle.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.ActionType;
import fr.cda.controle.beans.Actions;
import fr.cda.controle.converter.ActionsConverter;
import fr.cda.controle.dto.AccountDTO;
import fr.cda.controle.dto.ActionsDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.ActionTypeRepository;
import fr.cda.controle.repositories.ActionsRepository;
import fr.cda.controle.repositories.StatusRepository;
import fr.cda.controle.repositories.UserRoleRepository;


@Service
@Transactional
public class ActionsService {
	
	@Autowired
	private ActionsRepository actionsRepository;
	
	@Autowired
	private ActionsConverter actionsConverter;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private ActionTypeRepository actionTypeRepository;

	public ActionsDTO getAction(ActionsDTO actionsDTO)  throws NotFoundException {
		
		Account account = accountRepository.findByEmail(actionsDTO.getEmail());
		ActionType actionType = actionTypeRepository.findByType(actionsDTO.getType());
		
		Actions action= actionsRepository.findByAccountAndActionTypeAndRdvPris(account,actionType,actionsDTO.getId());
		if(action== null) {
			throw new NotFoundException();
		}
		return ActionsConverter.EntityToDTO(account);
	}
	
	/*
	 * public List<AccountDTO> getAllAccount() throws NotFoundException {
	 * List<Account> listAccount = ActionsRepository.findAll(); if(listAccount ==
	 * null) { throw new NotFoundException(); }
	 * System.out.println(ActionsRepository.findAll()); return
	 * ActionsConverter.EntityToDTO(listAccount); }
	 * 
	 * 
	 * public AccountDTO addAccount(AccountDTO AccountDTO) throws
	 * AlreadyExistException {
	 * 
	 * String email = AccountDTO.getEmail(); Account Account =
	 * ActionsRepository.findByEmail(email); if (Account == null) {
	 * ActionsRepository.save(ActionsConverter.dTOToEntity(AccountDTO)); } else {
	 * throw new AlreadyExistException(); }
	 * 
	 * return AccountDTO; }
	 * 
	 * @Transactional public void delete(String email) throws NotFoundException {
	 * Account account = ActionsRepository.findByEmail(email);
	 * System.out.println(account); if (account == null) { throw new
	 * NotFoundException(); } else { ActionsRepository.deleteByEmail(email); } }
	 * 
	 * 
	 * public AccountDTO update(String email, AccountDTO a2) throws
	 * NotFoundException {
	 * 
	 * Account a= ActionsRepository.findByEmail(email); if (a == null) { throw new
	 * NotFoundException(); } else {
	 * 
	 * a.setNom(a2.getNom()); a.setPrenom(a2.getPrenom());
	 * a.setPassword(a2.getPassword()); a.setAdresse(a2.getAdresse());
	 * a.setEmail(a2.getEmail()); a.setDuree(a2.getDuree()); a.setTel(a2.getTel());
	 * a.setStatus(statusRepository.findByType(a2.getStatus()));
	 * a.setUserRole(userRoleRepository.findByRole(a2.getUserRole()));
	 * ActionsRepository.save(a); return ActionsConverter.EntityToDTO(a); } }
	 * 
	 */
		 
	
	
	

}
