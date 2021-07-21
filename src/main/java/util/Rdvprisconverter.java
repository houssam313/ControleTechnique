package util;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import dto.RdvdispoDTO;
import dto.RdvprisDTO;
import fr.cda.controle.beans.Rdvdispo;
import fr.cda.controle.beans.Rdvpris;

@Component
public class Rdvprisconverter {

	public RdvprisDTO EntityToDTO( Rdvpris d) {
		ModelMapper mapper = new ModelMapper();
		RdvprisDTO map = mapper.map(d,  RdvprisDTO.class);
		return map;
	}
	

	public List<RdvprisDTO> EntityToDTO(List< Rdvpris > d) {

		return d.stream().map(x -> EntityToDTO(x)).collect(Collectors.toList());

	}
	
	public  Rdvpris dTOToEntity(RdvprisDTO d) {
		ModelMapper mapper = new ModelMapper();
		 Rdvpris  map = mapper.map(d,  Rdvpris .class);
		return map;
	}
	
	public List< Rdvpris> dTOToEntity(List<RdvprisDTO> d) {

		return d.stream().map(x -> dTOToEntity(x)).collect(Collectors.toList());

	}
	
	
}
