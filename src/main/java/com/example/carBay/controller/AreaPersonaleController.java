package com.example.carBay.controller;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.carBay.model.Utente;
import com.example.carBay.repository.UtenteRepository;
//import com.example.carBay.services.MioUtenteDettagli;
import com.example.carBay.services.UtenteServiceImpl;

@Controller
public class AreaPersonaleController {
	
	@Autowired
	private UtenteRepository utenteRepository;
	
	@Autowired
	private UtenteServiceImpl utenteServiceImpl;
	
	
//	@GetMapping("/areaPersonale")
//	public String mostraAreaPersonale(Model model) {
//		//MioUtenteDettagli utente = (MioUtenteDettagli) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		Utente utente = utenteServiceImpl.loadUtenteByUsername(authentication.getName());
//		model.addAttribute("utente", utente);
//	    return "areaPersonale";
//	}
//	
//	@PostMapping("/areaPersonale")
//	public String aggiornaDatiUtente(@ModelAttribute("utente") Utente utente){
//		
//		
//		utenteRepository.save(utente);
//		return "redirect:/homepage";
//	}
	
	
	
	@GetMapping("/areaPersonale")
	public ModelAndView showUserDetails() {
		ModelAndView mav = new ModelAndView("areaPersonale");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();        
	    Utente utente = utenteServiceImpl.loadUtenteByUsername(authentication.getName());
	    mav.addObject("utente", utente);
	    return mav;
	}
	
	@GetMapping("/areaPersonaleModifica")
	public ModelAndView showUpdateForm(@RequestParam Long utenteId) {
		ModelAndView mav = new ModelAndView("areaPersonaleForm");
		Utente utente= utenteRepository.findById(utenteId).get();
		mav.addObject("utente", utente);
		return mav;
	}
	
	
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute Utente utente) {
		utenteRepository.save(utente);
		return "redirect:/areaPersonale";
	}

}