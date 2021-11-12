package com.example.carBay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UtenteDettagliServiceImpl implements UserDetailsService{

	
	@Autowired
    private UtenteRepository utenteRepository;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
    	//Utente utente = utenteRepository.getUtenteByUsername(username);
        Utente utente = utenteRepository.findByUsername(username);
         
        if (utente == null) {
            throw new UsernameNotFoundException("Utente non trovato");
        }
         
        return new MioUtenteDettagli(utente);
    }
}
