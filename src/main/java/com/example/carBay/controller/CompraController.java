package com.example.carBay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.carBay.model.VenditaDiretta;
import com.example.carBay.services.VenditaDirettaService;

@Controller
public class CompraController {
	
	
	@Autowired
	private VenditaDirettaService venditaDirettaService;
	

	@GetMapping("/compra")
	public String ricerca(VenditaDiretta venditaDiretta, Model model, String keyword) {
		
		if(keyword != null) {
			List<VenditaDiretta> list = venditaDirettaService.getByKeyword(keyword);
			model.addAttribute("list", list);
		}else {
			List<VenditaDiretta> list = venditaDirettaService.getAllVendite();
			model.addAttribute("list", list);
		}
		
	    return "compra";
	}

	/*
	@GetMapping("/compra2")
	public List<VenditaDiretta> ricerca2(VenditaDiretta venditaDiretta, String keyword) {

		List<VenditaDiretta> list;

		if(keyword != null) {
			 list = venditaDirettaService.getByKeyword(keyword);

		}else {
			 list = venditaDirettaService.getAllVendite();

		}

		return list;
	}
	*/
}
