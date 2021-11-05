package com.example.carBay;

public enum Cambio {
	
	MANUALE("cambio manuale"),
	SEQUENZIALE("cambio sequenziale"),
	AUTOMATICO("cambio automatico");
	
	private String tipoCambio;
    
	Cambio(final String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
    
    public String getTipoCambio() {
        return tipoCambio;
    }
}
