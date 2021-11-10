package com.example.carBay;

public class Furgone extends Veicolo{
	
	private String capacitaCarico;
	private boolean tetto; //true= chiuso, false= aperto

	public Furgone(String marca, String modello, String dataImmatricolazione, String colore, String posti, String marce,
			String cilindrata, String km, String descrizione, Alimentazione alimentazione, Trazione trazione,
			Cambio cambio, String capacitaCarico, boolean tetto) {
		super(marca, modello, dataImmatricolazione, colore, posti, marce, cilindrata, km, descrizione, alimentazione, trazione,
				cambio);
		
		this.capacitaCarico = capacitaCarico;
		this.tetto = tetto;
	}

	public String getCapacitaCarico() {
		return capacitaCarico;
	}

	public void setCapacitaCarico(String capacitaCarico) {
		this.capacitaCarico = capacitaCarico;
	}
	//---------------------
	public boolean isTetto() {
		return tetto;
	}
	//---------------------
	public void setTetto(boolean tetto) {
		this.tetto = tetto;
	}

}
