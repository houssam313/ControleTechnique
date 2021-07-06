package fr.cda.controle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.cda.controle.beans.Account;
import fr.cda.controle.beans.ActionType;
import fr.cda.controle.beans.Examen;
import fr.cda.controle.beans.Rdvpris;
import fr.cda.controle.beans.Status;
import fr.cda.controle.beans.Userrole;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.ActionTypeRepository;
import fr.cda.controle.repositories.ExamenRepository;
import fr.cda.controle.repositories.RdvdispoRepository;
import fr.cda.controle.repositories.StatusRepository;
import fr.cda.controle.repositories.UserroleRepository;

@Controller
public class Testcontroller {

	@Autowired
	ActionTypeRepository  actionRepository;
	@Autowired
	ExamenRepository  examenRepository;
	@Autowired
	AccountRepository  accountRepository;
	
	@Autowired
	UserroleRepository  useroleRepository;
	
	
	
	
	
	@RequestMapping(value = "/addaction", method = RequestMethod.GET)
	public String ac() {
		ActionType p=new ActionType(1,"test");
		 
		  actionRepository.save(p);
		return "home";
	}
	
	
/*	
	@RequestMapping(value = "/addaccount", method = RequestMethod.GET)
	public String ex() {
		
		
		
		
		Date d= new Date(01/12/1984);
		Account e=new Account 	("er", "toto", Userrole userrole, Status status, Set<Rdvpris> listRdvpris,
				String duree, String nom, String prenom, String tel, String email, String adresse)
		accountRepository.save(e);
		return "home";
	}
	
*/	
	@RequestMapping(value = "/adduserole", method = RequestMethod.GET)
	public String usrole() {
		
		
		
		
		
		Userrole u=new Userrole(1, "jul");
		useroleRepository.save(u);
		return "home";
	}
	
	
	
	
/*	
	@RequestMapping(value = "/addexamen", method = RequestMethod.GET)
	public String exa() {
		
		
		
		
		Date d= new Date(01/12/1984);
		Examen e=new Examen	(98, 2.3, 5.6, d, 5.9, "jo",2.3, 4.8, 7.8, 8.9, true);
			
		  examenRepository.save(e);
		return "home";
	}
*/	
	
	
	
}
