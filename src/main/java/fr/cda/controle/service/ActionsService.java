package fr.cda.controle.service;




import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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
		
	
		LocalDate date = LocalDate.parse(id.getDate());
		IdActions idActions = new IdActions(account,actionType,rdvPris, date);
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

	public Actions addAction(ActionsDTO id) throws AlreadyExistException {
		Account account = accountRepository.findById(id.getId_user()).get();
		RdvPris rdvPris = rdvPrisRepository.findById(id.getId_rdv());
		ActionType actionType = actionTypeRepository.findById(id.getId_action()).get();
		LocalDate date = LocalDate.parse(id.getDate());
		IdActions idActions = new IdActions(account, actionType, rdvPris, date);
		 Actions action =  actionsRepository.findById(idActions).get();
		if (action== null) {
			action= new Actions(idActions,id.getMotif());
			actionsRepository.save(action);
		} else {
			throw new AlreadyExistException();
		}
		return action;
	}
	 

}
