package com.example.carBay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendiController {
	
	
	@GetMapping("/vendi")
	public String mostraVendi(Model model) {

	   return "vendi";
	}

}
