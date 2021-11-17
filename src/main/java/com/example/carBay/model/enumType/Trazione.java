package com.example.carBay.model.enumType;

public enum Trazione {
	ANTERIORE("trazione anteriore"),
	POSTERIORE("trazione posteriore"),
	INTEGRALE("trazione integrale");
	
	private String tipoTrazione;
    
	Trazione(final String tipoTrazione) {
        this.tipoTrazione = tipoTrazione;
    }
    
    public String getTipoTrazione() {
        return tipoTrazione;
    }
}
