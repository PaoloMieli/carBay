package com.example.carBay.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.carBay.model.Ruolo;
import com.example.carBay.model.Utente;

public class MioUtenteDettagli implements UserDetails{

	private Utente utente;
    
    public MioUtenteDettagli(Utente utente) {
        this.utente = utente;
    }
 
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Ruolo> ruoli = utente.getRuoli();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
         
        for (Ruolo ruolo : ruoli) {
            authorities.add(new SimpleGrantedAuthority(ruolo.getRuolo()));
        }
         
        return authorities;
    }
 
    @Override
    public String getPassword() {
        return utente.getPassword();
    }
 
    @Override
    public String getUsername() {
        return utente.getUsername();
    }
 
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
 
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
 
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	   public Long getId() {
			return utente.getId();
		}
	   
	   public String getNome() {
			return utente.getNome();
		}
		
		
		//-----------------
		public String getCognome() {
			return utente.getCognome();
		}
		
		//-----------------
		
		
		//-----------------
		public String getDataNascita() {
			return utente.getDataNascita();
		}
		
		//-----------------
		public String getCodiceFiscale() {
			return utente.getCodiceFiscale();
		}
		
		//-----------------
		public String getIndirizzo() {
			return utente.getIndirizzo();
		}
		
		//-----------------
		public String getEmail() {
			return utente.getEmail();
		}
		
		//-----------------
		public String getTelefono() {
			return utente.getTelefono();
		}
		
		
	
		
		//-----------------
		public Set<Ruolo> getRuoli() {
				return utente.getRuoli();
			}
	
}
