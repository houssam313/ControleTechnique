
package fr.cda.controle.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cda.controle.beans.IdPasser;
import fr.cda.controle.beans.Passer;
import fr.cda.controle.dto.PasserDTO;
import fr.cda.controle.repositories.BilanRepository;
import fr.cda.controle.repositories.ExamenRepository;
import fr.cda.controle.repositories.VehiculeRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class PasserConverter {

	
	@Autowired
	private ExamenRepository examenRepository;
	
	
	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	
	@Autowired
	private BilanRepository bilanRepository;
	
	
	public  PasserDTO EntityToDTO(Passer s) {
		ModelMapper mapper = new ModelMapper();
		PasserDTO map = mapper.map(s, PasserDTO.class);
		map.setIdbilan(s.getId_passer().getBilan().getId());
		map.setIdexamen(s.getId_passer().getExamen().getId());
		map.setIdvehicule(s.getId_passer().getVehicule().getImmatriculation());
		return map;
	}
	
	
	public List<PasserDTO> EntityToDTO(List<Passer> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Passer dTOToEntity(PasserDTO s) {
		ModelMapper mapper = new ModelMapper();
		Passer map = mapper.map(s, Passer.class);
		IdPasser  idPasser = new IdPasser(examenRepository.findById(s.getIdexamen()).get(),
				vehiculeRepository.findById(s.getIdvehicule()).get(),
				bilanRepository.findById(s.getIdbilan()).get());
		map.setId_passer(idPasser);
		return map;
	}
	public List<Passer> dTOToEntity(List<PasserDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
