package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.org.apache.xerces.internal.util.Status;

import dto.RdvprisDTO;
import fr.cda.controle.beans.Rdvpris;

import fr.cda.controle.repositories.RdvprisRepository;
import util.Rdvprisconverter;


@Service
public class Rdvprisservice {


	@Autowired
	private  RdvprisRepository rdvprisRepository;
	
	@Autowired
	private  Rdvprisconverter rdvprisConverter;

	
	public RdvprisDTO getRdvpris(String type ) {
		return rdvprisConverter.EntityToDTO(rdvprisRepository.findByImmatriculation(type));
	}
	
	
	public List<RdvprisDTO> getAllRdvpris() {	
		return rdvprisConverter.EntityToDTO(rdvprisRepository.findAll());
	}
	

	public Rdvpris save(RdvprisDTO statusDTO) {
		Rdvpris Rdvpris = rdvprisRepository.save(rdvprisConverter.dTOToEntity(statusDTO));
		return Rdvpris;
	}

	public void delete(int id) {
		rdvprisRepository.deleteById(id);
		
	}

//	public Rdvpris update(int id,RdvprisDTO RdvprisDTO) {
//		Rdvpris Rdvpris = rdvprisConverter.dTOToEntity(RdvprisDTO);
//		Rdvpris statusplus = rdvprisRepository.findById(id).get();
//		statusplus.setType(Rdvpris.getType());
//		rdvprisRepository.save(statusplus);
//		return statusplus;
//	}
	
	
	
	
	
}
