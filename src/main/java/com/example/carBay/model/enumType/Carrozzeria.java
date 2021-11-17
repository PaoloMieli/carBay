package com.example.carBay.model.enumType;

public enum Carrozzeria {
	
	CITY("Carrozzeria City Car"),
	BERLINA("Carrozzeria Berlina"),
	CABRIO("Carrozzeria Cabrio"),
	COUPE("Carrozzeria Coupé"),
	SW("Carrozzeria Station wagon"),
	VAN("Carrozzeria Monovolume"),
	SUV_FS("Carrozzeria Suv e Fuoristrada"),
	
	FURGONEAPERTO("Furgone con cassone aperto"),
	FURGONECHIUSO("Furgone con cassone chiuso");
	
	private String tipoCarrozzeria;
    
	Carrozzeria(final String tipoCarrozzeria) {
        this.tipoCarrozzeria = tipoCarrozzeria;
    }
    
    public String getTipoCarrozzeria() {
        return tipoCarrozzeria;
    }
}
