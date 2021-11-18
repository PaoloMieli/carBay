package com.example.carBay.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carBay.model.Alimentazione;
import com.example.carBay.repository.AlimentazioneRepository;


@Service
public class AlimentazioneService {
	
	@Autowired
    private AlimentazioneRepository alimentazioneRepository;

	
	public List<Alimentazione> getAllAlimentazioni(){
		
		return alimentazioneRepository.findAll();
	}
	
	
	
//	public AlimentazioneRepository getAlimentazioneRepository() {
//		return alimentazioneRepository;
//	}
//
//	public void setAlimentazioneRepository(AlimentazioneRepository alimentazioneRepository) {
//		this.alimentazioneRepository = alimentazioneRepository;
//	}

}
