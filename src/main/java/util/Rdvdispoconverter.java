package util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import dto.RdvdispoDTO;
import fr.cda.controle.beans.Rdvdispo;

@Component
public class Rdvdispoconverter {

	public RdvdispoDTO EntityToDTO( Rdvdispo d) {
		ModelMapper mapper = new ModelMapper();
		RdvdispoDTO map = mapper.map(d, RdvdispoDTO.class);
		return map;
	}

	public List<RdvdispoDTO> EntityToDTO(List< Rdvdispo > d) {

		return d.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}
	

	public  Rdvdispo dTOToEntity(RdvdispoDTO d) {
		ModelMapper mapper = new ModelMapper();
		 Rdvdispo  map = mapper.map(d,  Rdvdispo .class);
		return map;
	}
	
	public List< Rdvdispo> dTOToEntity(List<RdvdispoDTO> d) {

		return d.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}
	
	
	
}
