package com.example.carBay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller	
public class VenditaDirettaController{
	
	@Autowired
	private VenditaDirettaRepository venditaDirettaRepository;

	@GetMapping("/venditaDiretta")
	public String mostraFormVenditaDiretta(Model model) {

	   model.addAttribute("venditaDiretta", new VenditaDiretta()); 
	   return "venditaDiretta";
	}


	@PostMapping("/confermaCreazioneVenditaDiretta")
	public String salvaVenditaDiretta(@ModelAttribute VenditaDiretta venditaDiretta) {
	    //System.out.println("name="+utente.getNome()); //use a logger if you have one available
	    venditaDirettaRepository.save(venditaDiretta);
	    return "index";
	}
}
