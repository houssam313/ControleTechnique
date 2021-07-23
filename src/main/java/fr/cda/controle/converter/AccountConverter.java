
package fr.cda.controle.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Account;
import fr.cda.controle.dto.AccountDTO;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.StatusRepository;
import fr.cda.controle.repositories.UserRoleRepository;
import fr.cda.controle.service.AccountService;




@Component
public class AccountConverter {

	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@Autowired
	private StatusRepository statusRepository;
	
	
	public  AccountDTO EntityToDTO(Account s) {
		ModelMapper mapper = new ModelMapper();
		AccountDTO map = mapper.map(s, AccountDTO.class);
		
		return map;
	}
	public List<AccountDTO> EntityToDTO(List<Account> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	
	public Account dTOToEntity(AccountDTO s) {
		ModelMapper mapper = new ModelMapper();
		Account map = mapper.map(s, Account.class);
		map.setUserRole(userRoleRepository.findByRole(s.getUserRole()));
		map.setStatus(statusRepository.findByType(s.getStatus()));
		System.out.println(map);
		return map;
	}
	
	public List<Account> dTOToEntity(List<AccountDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
