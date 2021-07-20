package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.org.apache.xerces.internal.util.Status;

import dto.RdvprisDTO;
import fr.cda.controle.repositories.RdvprisRepository;
import util.Rdvprisconverter;

@Service
public class Rdvdisposervice {
	@Autowired
	private  RdvprisRepository RdvprisRepository;
	
	@Autowired
	private  Rdvprisconverter RdvprisConverter;

	public RdvprisDTO getStatus(String type ) {
		return Rdvprisconverter.EntityToDTO(RdvprisRepository.findByType(type));
	}

	public List<RdvprisDTO> getAllStatus() {	
		return Rdvprisconverter.EntityToDTO(RdvprisRepository.findAll());
	}

	public Rdvpris save(RdvprisDTO statusDTO) {
		Rdvpris Rdvpris = RdvprisRepository.save(Rdvprisconverter.dTOToEntity(RdvprisDTO));
		return Rdvpris;
	}

	public void delete(int id) {
		RdvprisRepository.deleteById(id);
		
	}

	public Status update(int id,RdvprisDTO RdvprisDTO) {
		Rdvpris Rdvpris = RdvprisConverter.dTOToEntity(RdvprisDTO);
		Rdvpris statusplus = RdvprisRepository.findById(id).get();
		statusplus.setType(status.getType());
		statusRepository.save(statusplus);
		return statusplus;
	}
	
	
	
	
}
