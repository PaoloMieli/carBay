package com.example.carBay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;

//import com.example.carBay.model.Utente;
import com.example.carBay.repository.UtenteRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	@GetMapping("/login1")
	public String mostraLogin() {
	    return "login";
	}
	
//	@PostMapping("/confermaLogin")
//	public String loginUtente(@ModelAttribute Utente utente) {
//	    //System.out.println("name="+utente.getUsername()); //use a logger if you have one available
//	    //utenteRepository.save(utente);
//	    return "confermaLogin";
//	}

}
