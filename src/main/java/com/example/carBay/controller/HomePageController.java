package com.example.carBay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	
	@GetMapping("/homepage")
	public String mostraLogin() {
	    return "homepage";
	}
}
