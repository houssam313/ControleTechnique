
package fr.cda.controle.converter;

import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Account;
import fr.cda.controle.dto.AccountDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class AccountConverter {

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
		return map;
	}
	public List<Account> dTOToEntity(List<AccountDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
