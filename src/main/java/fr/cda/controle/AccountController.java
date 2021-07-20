package fr.cda.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cda.controle.dto.AccountDTO;
import fr.cda.controle.errors.NotFoundException;
import fr.cda.controle.service.AccountService;

@RestController
@Transactional
public class AccountController {

	@Autowired
	private AccountService AccountService;

	@GetMapping("/account/{account}")
	public AccountDTO getAccount(@PathVariable("account") String a) throws NotFoundException {
		AccountDTO accountDTO = AccountService.getAccount(a);
		return accountDTO;
	}

	@GetMapping("/allAccount")
	public List<AccountDTO> getAllAccount() throws NotFoundException {
		List<AccountDTO> listAccountDTO = AccountService.getAllAccount();
		return listAccountDTO;
	}

	@PostMapping("/addAccount")
	public AccountDTO addAccount(@RequestBody AccountDTO AccountDTO) {
		return AccountService.addAccount(AccountDTO);
	}

	@PutMapping("/updateAccount/{email}")
	public AccountDTO updateAccount(@PathVariable("email") String email, @RequestBody AccountDTO AccountDTOnew)
			throws NotFoundException {
		return AccountService.update(email, AccountDTOnew);
	}

	@DeleteMapping("/deleteAccount/{email}")
	public void deleteAccount(@PathVariable("email") String email) throws NotFoundException {
		AccountService.delete(email);
	}

}
