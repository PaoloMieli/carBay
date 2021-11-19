package com.example.carBay.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carBay.model.VenditaDiretta;
import com.example.carBay.repository.VenditaDirettaRepository;

@Service
public class VenditaDirettaService {

	 @Autowired
	 private VenditaDirettaRepository venditaDirettaRepository;
	 
	 public List<VenditaDiretta> getAllVendite(){
		 
		 List<VenditaDiretta> list = (List<VenditaDiretta>) venditaDirettaRepository.findAll();
		 
		 return list;
	 }
	 
	 public List<VenditaDiretta> getByKeyword(String keyword){
		 
		 return venditaDirettaRepository.findByKeyword(keyword);
	 }
}
