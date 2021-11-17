package com.example.carBay.model.enumType;

public enum Alimentazione {
	
	BENZINA("alimentazione a benzina"),
	GASOLIO("alimentazione a gasolio"),
	IBRIDOELETTRICO("alimentazione ibrida"),
	GPL("alimentazione a gas"),
	ELETTRICO("alimentazione elettrica");
	
	
	private String tipoAlimentazione;
    
	Alimentazione(final String tipoAlimentazione) {
        this.tipoAlimentazione = tipoAlimentazione;
    }
    
    public String getTipoAlimentazione() {
        return tipoAlimentazione;
    }
}