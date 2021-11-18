package com.example.carBay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carBay.model.Trazione;
import com.example.carBay.repository.TrazioneRepository;

@Service
public class TrazioneService {
	@Autowired
    private TrazioneRepository trazioneRepository;

	
	public List<Trazione> getAllTrazioni(){
		
		return trazioneRepository.findAll();
	}
	
}
