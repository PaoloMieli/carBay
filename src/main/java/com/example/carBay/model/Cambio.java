package com.example.carBay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//public enum Cambio {
//	
//	MANUALE("cambio manuale"),
//	SEQUENZIALE("cambio sequenziale"),
//	AUTOMATICO("cambio automatico");
//	
//	private String tipoCambio;
//    
//	Cambio(final String tipoCambio) {
//        this.tipoCambio = tipoCambio;
//    }
//    
//    public String getTipoCambio() {
//        return tipoCambio;
//    }
//}

@Entity
public class Cambio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cambio;

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public Long getId() {
		return id;
	}
	
	
}