package com.example.carBay;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class LoginController {
	
	private UtenteRepository utenteRepository;
	
	@GetMapping("/login")
	public String mostraLogin() {

	    return "login";
	}
	
	@PostMapping("/confermaLogin")
	public String loginUtente(@ModelAttribute Utente utente) {
	    System.out.println("name="+utente.getNome()); //use a logger if you have one available
	    utenteRepository.save(utente);
	    return "confermaLogin";
	}

}
