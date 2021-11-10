package com.example.carBay;


public class Veicolo {
	

	private String marca;
	private String modello;
	private String dataImmatricolazione;
	private String colore;
	private String posti;
	private String marce; 
	private String cilindrata;
	private String km; 
	private String descrizione;
	private Alimentazione alimentazione;
	private Trazione trazione;
	private Cambio cambio; 

	
	
	public Veicolo (String marca, String modello, String dataImmatricolazione,
					String colore, String posti, String marce, String cilindrata,
					String km, String descrizione, Alimentazione alimentazione,
					Trazione trazione, Cambio cambio){
		
		this.marca = marca;
		this.modello = modello;
		this.dataImmatricolazione = dataImmatricolazione;
		this.colore = colore;
		this.posti = posti;
		this.marce = marce;
		this.cilindrata = cilindrata;
		this.km = km;
		this.descrizione = descrizione;
		this.alimentazione = alimentazione;
		this.trazione = trazione;
		this.cambio = cambio;
	}
	
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	//----------------------
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	//----------------------
	public String getDataImmatricolazione() {
		return dataImmatricolazione;
	}
	public void setDataImmatricolazione(String dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}
	//----------------------
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	//----------------------
	public String getPosti() {
		return posti;
	}
	public void setPosti(String posti) {
		this.posti = posti;
	}
	//----------------------
	public String getMarce() {
		return marce;
	}
	public void setMarce(String marce) {
		this.marce = marce;
	}
	//----------------------
	public String getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(String cilindrata) {
		this.cilindrata = cilindrata;
	}
	//----------------------
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	//----------------------
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	//----------------------
	public Trazione getTrazione() {
		return trazione;
	}
	//----------------------
	public Alimentazione getAlimentazione() {
		return alimentazione;
	}
	//----------------------
	public Cambio getCambio() {
		return cambio;
	}

}
