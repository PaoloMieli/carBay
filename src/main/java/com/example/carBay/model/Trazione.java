package com.example.carBay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String trazione;

	public String getTrazione() {
		return trazione;
	}

	public void setTrazione(String trazione) {
		this.trazione = trazione;
	}

	public Long getId() {
		return id;
	}

}


//public enum Trazione {
//	ANTERIORE("trazione anteriore"),
//	POSTERIORE("trazione posteriore"),
//	INTEGRALE("trazione integrale");
//	
//	private String tipoTrazione;
//    
//	Trazione(final String tipoTrazione) {
//        this.tipoTrazione = tipoTrazione;
//    }
//    
//    public String getTipoTrazione() {
//        return tipoTrazione;
//    }
//}
