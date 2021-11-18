package com.example.carBay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.example.carBay.model.Utente;
import com.example.carBay.repository.UtenteRepository;
import com.example.carBay.services.MioUtenteDettagli;

@Controller
public class AreaPersonaleController {
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	
	@GetMapping("/areaPersonale")
	public String mostraAreaPersonale(Model model) {
		MioUtenteDettagli utente = (MioUtenteDettagli) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("utente", utente);
	    return "areaPersonale";
	}

	
//	@PostMapping("/")
//	public String salvaUtente(@ModelAttribute Utente utente) {
//	    
//	    return "";
//	}
}
