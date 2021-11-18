package com.example.carBay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carBay.model.Cambio;
import com.example.carBay.repository.CambioRepository;

@Service
public class CambioService {
	@Autowired
    private CambioRepository cambioRepository;

	
	public List<Cambio> getAllCambi(){
		
		return cambioRepository.findAll();
	}
	
}
