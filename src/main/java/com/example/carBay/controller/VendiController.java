package com.example.carBay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.carBay.entita.Utente;
import com.example.carBay.interfacce.AstaRepository;

@Controller
public class VendiController {
	
	
	@GetMapping("/vendi")
	public String mostraVendi(Model model) {

	   return "vendi";
	}

}
