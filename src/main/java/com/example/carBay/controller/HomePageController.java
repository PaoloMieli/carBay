package com.example.carBay.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//import com.example.carBay.repository.UtenteRepository;

@Controller
public class HomePageController {
	
	@GetMapping("/homepage")
	public String mostraLogin() {
	    return "homepage";
	}
}
