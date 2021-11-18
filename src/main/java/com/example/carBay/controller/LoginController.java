package com.example.carBay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.carBay.repository.UtenteRepository;

@Controller
public class LoginController {
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	@GetMapping("/login1")
	public String mostraLogin() {
	    return "login";
	}


}
