package com.example.carBay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carBay.model.Carrozzeria;
import com.example.carBay.repository.CarrozzeriaRepository;

@Service
public class CarrozzeriaService {
	@Autowired
    private CarrozzeriaRepository carrozzeriaRepository;

	
	public List<Carrozzeria> getAllCarrozzerie(){
		
		return carrozzeriaRepository.findAll();
	}
	
}
