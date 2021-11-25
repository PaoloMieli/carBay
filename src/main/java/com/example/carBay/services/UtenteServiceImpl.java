package com.example.carBay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.carBay.intefaces.UtenteService;
import com.example.carBay.model.Utente;
import com.example.carBay.repository.UtenteRepository;

@Service
public class UtenteServiceImpl implements UtenteService{
	
	@Autowired
	private UtenteRepository utenteRepository;

	@Override
	public Utente loadUtenteByUsername(String username)
            throws UsernameNotFoundException {
    	
        Utente utente = utenteRepository.getUtenteByUsername(username);
         
        if (utente == null) {
            throw new UsernameNotFoundException("Utente non trovato");
        }
         
        return utente;
	}

    @Override
    public void save(Utente utente){

        utenteRepository.save(utente);
    }
	
}
