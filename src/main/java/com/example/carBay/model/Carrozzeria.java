package com.example.carBay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carrozzeria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String carrozzeria;

	public String getCarrozzeria() {
		return carrozzeria;
	}

	public void setCarrozzeria(String carrozzeria) {
		this.carrozzeria = carrozzeria;
	}

	public Long getId() {
		return id;
	}
	
	
}


//public enum Carrozzeria {
//	
//	CITY("Carrozzeria City Car"),
//	BERLINA("Carrozzeria Berlina"),
//	CABRIO("Carrozzeria Cabrio"),
//	COUPE("Carrozzeria Coupé"),
//	SW("Carrozzeria Station wagon"),
//	VAN("Carrozzeria Monovolume"),
//	SUV_FS("Carrozzeria Suv e Fuoristrada"),
//	
//	FURGONEAPERTO("Furgone con cassone aperto"),
//	FURGONECHIUSO("Furgone con cassone chiuso");
//	
//	private String tipoCarrozzeria;
//    
//	Carrozzeria(final String tipoCarrozzeria) {
//        this.tipoCarrozzeria = tipoCarrozzeria;
//    }
//    
//    public String getTipoCarrozzeria() {
//        return tipoCarrozzeria;
//    }
//}
