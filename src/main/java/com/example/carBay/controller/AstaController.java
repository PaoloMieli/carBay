package com.example.carBay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.carBay.model.Utente;
import com.example.carBay.repository.AstaRepository;

public class AstaController {

	@Autowired
	private AstaRepository astaRepository;
	
	@GetMapping("/registrazione")
	public String mostraRegistrazione(Model model) {

	   model.addAttribute("utente", new Utente()); 
	   return "registrazione";
	}



	@PostMapping("/confermaRegistrazione")
	public String salvaUtente(@ModelAttribute Utente utente) {
	    System.out.println("name="+utente.getNome());
	    return "confermaRegistrazione";
	}
}
