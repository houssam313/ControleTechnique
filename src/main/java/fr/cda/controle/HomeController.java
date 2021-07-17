package fr.cda.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.cda.controle.repositories.AccountRepository;

import fr.cda.controle.repositories.StatusRepository;
import fr.cda.controle.repositories.UserRoleRepository;


@Controller
public class HomeController {
	
	
	
	@Autowired
	StatusRepository  statusRepository;
	@Autowired
	UserRoleRepository  userroleRepository;
	@Autowired
	AccountRepository  accountRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		//System.out.println(accountRepository.findById("1").get().toString());
		//System.out.println( statusRepository.findById(1).get().getListaccount());
		
		return "home";
	}
	
}
