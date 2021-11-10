package com.example.carBay;

public enum Carrozzeria {
	
	CITY("Carrozzeria City Car"),
	BERLINA("Carrozzeria Berlina"),
	CABRIO("Carrozzeria Cabrio"),
	COUPE("Carrozzeria Coupé"),
	SW("Carrozzeria Station wagon"),
	VAN("Carrozzeria Monovolume"),
	SUV_FS("Carrozzeria Suv e Fuoristrada");
	
	private String tipoCarrozzeria;
    
	Carrozzeria(final String tipoCarrozzeria) {
        this.tipoCarrozzeria = tipoCarrozzeria;
    }
    
    public String getTipoCarrozzeria() {
        return tipoCarrozzeria;
    }
}
