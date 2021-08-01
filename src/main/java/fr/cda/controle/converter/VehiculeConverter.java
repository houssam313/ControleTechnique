
package fr.cda.controle.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Vehicule;
import fr.cda.controle.dto.VehiculeDTO;
import fr.cda.controle.repositories.AccountRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class VehiculeConverter {

	
	@Autowired
	private AccountRepository accountRepository;
	
	public  VehiculeDTO EntityToDTO(Vehicule s) {
		ModelMapper mapper = new ModelMapper();
		VehiculeDTO map = mapper.map(s, VehiculeDTO.class);
		map.setVehiculeType(s.getVehiculeType().getType());
		map.setEmail(s.getAccount().getEmail());
		return map;
	}
	public List<VehiculeDTO> EntityToDTO(List<Vehicule> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Vehicule dTOToEntity(VehiculeDTO s) {
		ModelMapper mapper = new ModelMapper();
		Vehicule map = mapper.map(s, Vehicule.class);
		map.setAccount(accountRepository.findByEmail(s.getEmail()));
		return map;
	}
	public List<Vehicule> dTOToEntity(List<VehiculeDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
