package fr.cda.controle.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.cda.controle.beans.Account;
import fr.cda.controle.converter.AccountConverter;
import fr.cda.controle.dto.AccountDTO;
import fr.cda.controle.errors.AlreadyExistException;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.StatusRepository;
import fr.cda.controle.repositories.UserRoleRepository;


@Service
@Transactional
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private AccountConverter accountConverter;
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@Autowired
	private StatusRepository statusRepository;

	public AccountDTO getAccount(String email )  throws NotFoundException {
		Account account= accountRepository.findByEmail(email);
		if(account== null) {
			throw new NotFoundException();
		}
		return accountConverter.EntityToDTO(account);
	}
	
	  public List<AccountDTO> getAllAccount() throws NotFoundException {
	  List<Account> listAccount = accountRepository.findAll(); 
	  if(listAccount == null)
	  { 
		  throw new NotFoundException(); 
	  }
	  System.out.println(accountRepository.findAll()); 
	  return  accountConverter.EntityToDTO(listAccount); 
	  }
	  
	
		public AccountDTO addAccount(AccountDTO AccountDTO) throws AlreadyExistException {

			String email = AccountDTO.getEmail();
			Account Account = accountRepository.findByEmail(email);
			if (Account == null) {
				accountRepository.save(accountConverter.dTOToEntity(AccountDTO));
			} else {
				throw new AlreadyExistException();
			}

			return AccountDTO;
		}

		@Transactional
		public void delete(String email) throws NotFoundException {
			Account account = accountRepository.findByEmail(email);
			System.out.println(account);
			if (account == null) {
				throw new NotFoundException();
			} else {
				accountRepository.deleteByEmail(email);
			}
		}

	
		public AccountDTO update(AccountDTO a2) throws NotFoundException {
			
			Account a= accountRepository.findByEmail(a2.getEmail());
			if (a == null) {
				throw new NotFoundException();
			} else {
				
				a.setNom(a2.getNom());
				a.setPrenom(a2.getPrenom());
				a.setAdresse(a2.getAdresse());
				a.setDuree(a2.getDuree());
				a.setTel(a2.getTel());
				a.setStatus(statusRepository.findByType(a2.getStatus()));
				a.setUserRole(userRoleRepository.findByRole(a2.getUserRole()));
				accountRepository.save(a);
				return accountConverter.EntityToDTO(a);
			
				
			}
		}
	 
		  
		 
	
	
	

}
