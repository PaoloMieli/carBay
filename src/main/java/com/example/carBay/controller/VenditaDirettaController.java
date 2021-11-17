package com.example.carBay.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.carBay.model.Utente;
import com.example.carBay.model.VenditaDiretta;
import com.example.carBay.repository.VenditaDirettaRepository;
import com.example.carBay.services.MioUtenteDettagli;
import com.example.carBay.services.UtenteDettagliServiceImpl;

@Controller	
public class VenditaDirettaController{
	
	@Autowired
	private VenditaDirettaRepository venditaDirettaRepository;
	@Autowired
	private  UtenteDettagliServiceImpl  utenteDettagliServiceImpl;

	@GetMapping("/venditaDiretta")
	public String mostraFormVenditaDiretta(Model model) {

	   model.addAttribute("venditaDiretta", new VenditaDiretta()); 
	   return "venditaDiretta";
	}

//
//	@PostMapping("/confermaCreazioneVenditaDiretta")
//	public String salvaVenditaDiretta(@ModelAttribute VenditaDiretta venditaDiretta) {
//	    //System.out.println("name="+utente.getNome()); //use a logger if you have one available
//	    venditaDirettaRepository.save(venditaDiretta);
//	    return "index";
//	}
	
	@PostMapping("/vendi")
	public String salvaVenditaDiretta(
			@ModelAttribute VenditaDiretta venditaDiretta, 
			@RequestParam("pippo") MultipartFile multipartFile) throws IOException {
	    //System.out.println("name="+utente.getNome()); //use a logger if you have one available
	    venditaDiretta.setImmagine(multipartFile.getBytes());
	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();        
	    MioUtenteDettagli utente =(MioUtenteDettagli) utenteDettagliServiceImpl.loadUserByUsername(authentication.getName());
	    Utente u= new Utente();
//	    u.setUsername(utente.getUsername());
	    u.setId(utente.getId());
	    venditaDiretta.setUtente(u);
		venditaDirettaRepository.save(venditaDiretta);//comprare riso al curry
	    return "vendi";
	}
	
	
//	@PostMapping("/confermaCreazioneVenditaDiretta")
//	public String salvaVenditaDiretta(@ModelAttribute VenditaDiretta venditaDiretta) throws IOException{
//	    //System.out.println("name="+utente.getNome()); //use a logger if you have one available
//	    venditaDiretta.setImmagine(venditaDiretta.getMultipartFile().getBytes());
//		venditaDirettaRepository.save(venditaDiretta);
//	    return "index";
//	}
	
	
//	@PostMapping("/confermaCreazioneVenditaDiretta")
//	public RedirectView salvaAnnuncio(@ModelAttribute VenditaDiretta venditaDiretta,
//            @RequestParam("immagine") MultipartFile multipartFile) throws IOException {
//         
//        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        venditaDiretta.setImmagini(fileName);
//         
//        VenditaDiretta annuncioSalvato = venditaDirettaRepository.save(venditaDiretta);
// 
//        String uploadDir = "venditaDiretta-immagini/" + annuncioSalvato.getId();
// 
//        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//        
//        return new RedirectView("/venditaDiretta");
//    }

}
