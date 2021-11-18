package com.example.carBay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carBay.model.Marca;
import com.example.carBay.repository.MarcaRepository;



@Service
public class MarcaService {

	@Autowired
    private MarcaRepository marcaRepository;

	
	public List<Marca> getAllMarche(){
		
		return marcaRepository.findAll();
	}
}
