package com.example.carBay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carBay.model.Modello;
import com.example.carBay.repository.ModelloRepository;


@Service
public class ModelloService {

	@Autowired
    private ModelloRepository modelloRepository;

	
	public List<Modello> getAllModelli(){
		
		return modelloRepository.findAll();
	}
}
