package com.example.carBay.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.carBay.model.VenditaDiretta;
import com.example.carBay.repository.VenditaDirettaRepository;

@Controller	
public class VenditaDirettaController{
	
	@Autowired
	private VenditaDirettaRepository venditaDirettaRepository;

	@GetMapping("/venditaDiretta")
	public String mostraFormVenditaDiretta(Model model) {

	   model.addAttribute("venditaDiretta", new VenditaDiretta()); 
	   return "venditaDiretta";
	}


//	@PostMapping("/confermaCreazioneVenditaDiretta")
//	public String salvaVenditaDiretta(@ModelAttribute VenditaDiretta venditaDiretta) {
//	    //System.out.println("name="+utente.getNome()); //use a logger if you have one available
//	    venditaDirettaRepository.save(venditaDiretta);
//	    return "index";
//	}
	
	@PostMapping("/confermaCreazioneVenditaDiretta")
	public String salvaVenditaDiretta(@ModelAttribute VenditaDiretta venditaDiretta, MultipartFile multipartFile) throws IOException {
	    //System.out.println("name="+utente.getNome()); //use a logger if you have one available
	    venditaDiretta.setImmagine(multipartFile.getBytes());
		venditaDirettaRepository.save(venditaDiretta);
	    return "index";
	}
	
	
//	@PostMapping("/confermaCreazioneVenditaDiretta")
//	public String salvaVenditaDiretta(@ModelAttribute VenditaDiretta venditaDiretta){
//	    //System.out.println("name="+utente.getNome()); //use a logger if you have one available
//	    venditaDiretta.setImmagine(venditaDiretta.getMultipartFile.getBytes());
//		venditaDirettaRepository.save(venditaDiretta);
//	    return "index";
//	}
}
