package com.example.carBay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.carBay.model.Utente;

@Controller
public class AreaPersonaleController {
	
	@GetMapping("/areaPersonale")
	public String mostraAreaPersonale() {
	    return "areaPersonale";
	}

	
//	@PostMapping("/")
//	public String salvaUtente(@ModelAttribute Utente utente) {
//	    
//	    return "";
//	}
}
