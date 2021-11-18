package com.example.carBay.controller;

import java.io.IOException;
import java.util.List;

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

import com.example.carBay.model.Alimentazione;
import com.example.carBay.model.Cambio;
import com.example.carBay.model.Carrozzeria;
import com.example.carBay.model.Marca;
import com.example.carBay.model.Modello;
import com.example.carBay.model.Trazione;
import com.example.carBay.model.Utente;
import com.example.carBay.model.VenditaDiretta;
//import com.example.carBay.repository.AlimentazioneRepository;
import com.example.carBay.repository.VenditaDirettaRepository;
import com.example.carBay.services.AlimentazioneService;
import com.example.carBay.services.CambioService;
import com.example.carBay.services.CarrozzeriaService;
import com.example.carBay.services.MarcaService;
import com.example.carBay.services.MioUtenteDettagli;
import com.example.carBay.services.ModelloService;
import com.example.carBay.services.TrazioneService;
import com.example.carBay.services.UtenteDettagliServiceImpl;
import com.example.carBay.services.UtenteServiceImpl;

@Controller	
public class VenditaDirettaController{
	
	@Autowired
	private VenditaDirettaRepository venditaDirettaRepository;
//	@Autowired
//	private  UtenteDettagliServiceImpl  utenteDettagliServiceImpl; //togliere impl
	@Autowired
	private AlimentazioneService alimentazioneService;
	@Autowired
	private CambioService cambioService;
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private TrazioneService trazioneService;
	
	@Autowired
	private ModelloService modelloService;
	@Autowired
	private MarcaService marcaService;
	
	@Autowired
	private UtenteServiceImpl utenteServiceImpl;

	@GetMapping("/venditaDiretta")
	public String mostraFormVenditaDiretta(Model model) {
		List<Alimentazione> alimentazioni = alimentazioneService.getAllAlimentazioni();
		model.addAttribute("alimentazioni" , alimentazioni);
		
		List<Cambio> cambi = cambioService.getAllCambi();
		model.addAttribute("cambi" , cambi);
		List<Trazione> trazioni = trazioneService.getAllTrazioni();
		model.addAttribute("trazioni" , trazioni);
		
		List<Carrozzeria> carrozzerie = carrozzeriaService.getAllCarrozzerie();
		model.addAttribute("carrozzerie" , carrozzerie);
		
		List<Modello> modelli = modelloService.getAllModelli();
		model.addAttribute("modelli" , modelli);
		List<Marca> marche = marcaService.getAllMarche();
		model.addAttribute("marche" , marche);
		
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
	    //MioUtenteDettagli utente =(MioUtenteDettagli) utenteDettagliServiceImpl.loadUserByUsername(authentication.getName());
	    Utente utente = utenteServiceImpl.loadUtenteByUsername(authentication.getName());
	    
	    
	    //Utente u= new Utente();
//	    u.setUsername(utente.getUsername());
	    //u.setId(utente.getId());
	    //venditaDiretta.setUtente(u);
	    venditaDiretta.setUtente(utente);
		venditaDirettaRepository.save(venditaDiretta);
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
