
package fr.cda.controle.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Examen;
import fr.cda.controle.dto.ExamenDTO;
import fr.cda.controle.repositories.AccountRepository;
import fr.cda.controle.repositories.VehiculeRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class ExamenConverter {
	
	@Autowired
	private VehiculeRepository  vehiculeRepository;
	
	@Autowired
	private AccountRepository accountRepository;

	public  ExamenDTO EntityToDTO(Examen s) {
		ModelMapper mapper = new ModelMapper();
		ExamenDTO map = mapper.map(s, ExamenDTO.class);
		map.setId_user(s.getAccount().getId_user());
		map.setImmatriculation(s.getVehicule().getImmatriculation());
		return map;
	}
	public List<ExamenDTO> EntityToDTO(List<Examen> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Examen dTOToEntity(ExamenDTO s) {
		ModelMapper mapper = new ModelMapper();
		Examen map = mapper.map(s, Examen.class);
		map.setVehicule(vehiculeRepository.findById(s.getImmatriculation()).get());
		map.setAccount(accountRepository.findById(s.getId_user()).get());
		return map;
	}
	public List<Examen> dTOToEntity(List<ExamenDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
