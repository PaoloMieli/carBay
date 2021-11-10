package com.example.carBay;

public class Auto extends Veicolo{
	
	private String porte;
	private Carrozzeria carrozzeria;

	public Auto(String marca, String modello, String dataImmatricolazione, String colore, String posti, String marce,
			String cilindrata, String km, String descrizione, Alimentazione alimentazione, Trazione trazione,
			Cambio cambio, String porte, Carrozzeria carrozzeria) {
		super(marca, modello, dataImmatricolazione, colore, posti, marce, cilindrata, km, descrizione, alimentazione, trazione,
				cambio);
		
		this.porte = porte;
		this.carrozzeria = carrozzeria;
		
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public Carrozzeria getCarrozzeria() {
		return carrozzeria;
	}

}
