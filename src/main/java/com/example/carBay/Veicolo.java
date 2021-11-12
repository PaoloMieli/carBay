//package com.example.carBay;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "veicolo")
////public class Veicolo {
//abstract class Veicolo {
//	
//	@Id
//	@Column(name = "veicolo_id")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
//	
//	@Column(name = "marca", nullable = false, length = 20)
//	private String marca;
//	@Column(name = "modello", nullable = false, length = 20)
//	private String modello;
//	
//	@Column(nullable = false, length = 45)
//	private String dataImmatricolazione;
//	
//	@Column(nullable = false, length = 20)
//	private String colore;
//	@Column(nullable = false, length = 20)
//	private String posti;
//	@Column(nullable = false, length = 20)
//	private String marce;
//	@Column(nullable = false, length = 20)
//	private String cilindrata;
//	@Column(nullable = false, length = 20)
//	private String km; 
//	
//	@Column(nullable = false)
//	private Alimentazione alimentazione;
//	@Column(nullable = false)
//	private Trazione trazione;
//	@Column(nullable = false)
//	private Cambio cambio; 
//	
//	@Column(nullable = false, length = 10)
//	private String porte;
//	@Column(nullable = false, length = 20)
//	private Carrozzeria carrozzeria;
//
//	
//	
//	public Veicolo (Long id,
//					String marca, String modello, String dataImmatricolazione,
//					String colore, String posti, String marce, String cilindrata,
//					String km, Alimentazione alimentazione,
//					Trazione trazione, Cambio cambio, String porte, Carrozzeria carrozzeria){
//		
//		this.id = id;
//		this.marca = marca;
//		this.modello = modello;
//		this.dataImmatricolazione = dataImmatricolazione;
//		this.colore = colore;
//		this.posti = posti;
//		this.marce = marce;
//		this.cilindrata = cilindrata;
//		this.km = km;
//		
//		this.alimentazione = alimentazione;
//		this.trazione = trazione;
//		this.cambio = cambio;
//		
//		this.porte = porte;
//		this.carrozzeria = carrozzeria;
//	}
//	
//	
//	public Long getId() {
//		return id;
//	}
//	//----------------------
//	public String getMarca() {
//		return marca;
//	}
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//	//----------------------
//	public String getModello() {
//		return modello;
//	}
//	public void setModello(String modello) {
//		this.modello = modello;
//	}
//	//----------------------
//	public String getDataImmatricolazione() {
//		return dataImmatricolazione;
//	}
//	public void setDataImmatricolazione(String dataImmatricolazione) {
//		this.dataImmatricolazione = dataImmatricolazione;
//	}
//	//----------------------
//	public String getColore() {
//		return colore;
//	}
//	public void setColore(String colore) {
//		this.colore = colore;
//	}
//	//----------------------
//	public String getPosti() {
//		return posti;
//	}
//	public void setPosti(String posti) {
//		this.posti = posti;
//	}
//	//----------------------
//	public String getMarce() {
//		return marce;
//	}
//	public void setMarce(String marce) {
//		this.marce = marce;
//	}
//	//----------------------
//	public String getCilindrata() {
//		return cilindrata;
//	}
//	public void setCilindrata(String cilindrata) {
//		this.cilindrata = cilindrata;
//	}
//	//----------------------
//	public String getKm() {
//		return km;
//	}
//	public void setKm(String km) {
//		this.km = km;
//	}
//	//----------------------
//	public Trazione getTrazione() {
//		return trazione;
//	}
//	//----------------------
//	public Alimentazione getAlimentazione() {
//		return alimentazione;
//	}
//	//----------------------
//	public Cambio getCambio() {
//		return cambio;
//	}
//	//----------------------
//	public String getPorte() {
//		return porte;
//	}
//
//	public void setPorte(String porte) {
//		this.porte = porte;
//	}
//	//----------------------
//	public Carrozzeria getCarrozzeria() {
//		return carrozzeria;
//	}
//}
