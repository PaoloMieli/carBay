package com.example.carBay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AstaController {

	@GetMapping("/asta")
	public String mostraVendi(Model model) {

	   return "asta";
	}
}
