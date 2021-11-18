package com.example.carBay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimentazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String alimentazione;
	

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}
	
	
	
//	BENZINA("alimentazione a benzina"),
//	GASOLIO("alimentazione a gasolio"),
//	IBRIDOELETTRICO("alimentazione ibrida"),
//	GPL("alimentazione a gas"),
//	ELETTRICO("alimentazione elettrica");
	
	
//	private String tipoAlimentazione;
//    
//	Alimentazione(final String tipoAlimentazione) {
//        this.tipoAlimentazione = tipoAlimentazione;
//    }
//    
//    public String getTipoAlimentazione() {
//        return tipoAlimentazione;
//    }
}