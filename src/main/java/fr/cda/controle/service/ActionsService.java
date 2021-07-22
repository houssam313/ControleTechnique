package fr.cda.controle.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import fr.cda.controle.beans.Actions;
import fr.cda.controle.beans.IdActions;
import fr.cda.controle.beans.RdvPris;
import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.ActionType;
import fr.cda.controle.converter.ActionsConverter;
import fr.cda.controle.dto.ActionsDTO;
import fr.cda.controle.dto.IdActionsDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.ActionsRepository;
import fr.cda.controle.repositories.RdvPrisRepository;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.ActionTypeRepository;


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
	private RdvPrisRepository  rdvPrisRepository;
	
	@Autowired
	private ActionTypeRepository actionTypeRepository;
	
	
	public ActionsDTO getAction(IdActionsDTO id) throws NotFoundException {
		
		Account account = accountRepository.findById(id.getId_user()).get();
		RdvPris rdvPris = rdvPrisRepository.findById(id.getId_rdv());
		ActionType actionType = actionTypeRepository.findById(id.getId_action()).get();
		IdActions idActions = new IdActions(account,actionType,rdvPris);
		Actions action = actionsRepository.findById(idActions).get();

		if(action== null) {
			throw new NotFoundException();
		}
		return actionsConverter.EntityToDTO(action);

	}
	

	public List<ActionsDTO> getAllActions() throws NotFoundException {
		List<Actions> listActions = actionsRepository.findAll();
		if (listActions == null) {
			throw new NotFoundException();
		}

		return actionsConverter.EntityToDTO(listActions);
	}


	public Actions addAction(ActionsDTO id)  throws AlreadyExistException{
		Account account = accountRepository.findById(id.getId_user()).get();
		RdvPris rdvPris = rdvPrisRepository.findById(id.getId_rdv());
		ActionType actionType = actionTypeRepository.findById(id.getId_action()).get();
		IdActions idActions = new IdActions(account,actionType,rdvPris);
		Actions action = actionsRepository.findById(idActions).get();
		if(action== null) {
			actionsRepository.save(action);
		} else {
			throw new AlreadyExistException(); 
		}
		return action;
	}

	 
	/* * public ActionsDTO addActions(ActionsDTO ActionsDTO) throws
	 * AlreadyExistException {
	 * 
	 * String email = ActionsDTO.getEmail(); Actions Actions =
	 * ActionsRepository.findByEmail(email); if (Actions == null) {
	 * ActionsRepository.save(ActionsConverter.dTOToEntity(ActionsDTO)); } else {
	 * throw new AlreadyExistException(); }
	 * 
	 * return ActionsDTO; }
	 * 
	 * @Transactional public void delete(String email) throws NotFoundException {
	 * Actions Actions = ActionsRepository.findByEmail(email);
	 * System.out.println(Actions); if (Actions == null) { throw new
	 * NotFoundException(); } else { ActionsRepository.deleteByEmail(email); } }
	 * 
	 * 
	 * public ActionsDTO update(String email, ActionsDTO a2) throws
	 * NotFoundException {
	 * 
	 * Actions a= ActionsRepository.findByEmail(email); if (a == null) { throw new
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
