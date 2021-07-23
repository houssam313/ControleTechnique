
package fr.cda.controle.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cda.controle.beans.Recu;
import fr.cda.controle.dto.RecuDTO;
import fr.cda.controle.repositories.ExamenRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;


@Component
public class RecuConverter {
	
	@Autowired
	private ExamenRepository examenRepository;

	public  RecuDTO EntityToDTO(Recu s) {
		ModelMapper mapper = new ModelMapper();
		RecuDTO map = mapper.map(s, RecuDTO.class);
		map.setIdexamen(s.getExamen().getId());
		return map;
	}
	public List<RecuDTO> EntityToDTO(List<Recu> s) {
		return s.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());
	}
	public Recu dTOToEntity(RecuDTO s) {
		ModelMapper mapper = new ModelMapper();
		Recu map = mapper.map(s, Recu.class);
		map.setExamen(examenRepository.findById(s.getIdexamen()).get());
		return map;
	}
	public List<Recu> dTOToEntity(List<RecuDTO> s) {
		return s.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());
	}
}
