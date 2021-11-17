package com.example.carBay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import com.example.carBay.model.enumType.Alimentazione;
import com.example.carBay.model.enumType.Cambio;
import com.example.carBay.model.enumType.Carrozzeria;
import com.example.carBay.model.enumType.Trazione;


@Entity
@Table(name = "vendita")
public class VenditaDiretta {
	@Id
    @Column(name = "vendita_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = true, length = 45)
	private Double prezzo;
	
	
	@Column(name = "marca", nullable = true, length = 20)
	private String marca;
	@Column(name = "modello", nullable = true, length = 20)
	private String modello;
	
	@Column(nullable = true, length = 45)
	private String dataImmatricolazione;
	
	@Column(nullable = true, length = 20)
	private String colore;
	@Column(nullable = true, length = 20)
	private String posti;
	@Column(nullable = true, length = 20)
	private String marce;
	@Column(nullable = true, length = 20)
	private String cilindrata;
	@Column(nullable = true, length = 20)
	private String km; 
	
	
	@Column(nullable = true)
	//@Enumerated(EnumType.STRING)
	//private Alimentazione alimentazione;
	private String alimentazione;
	@Column(nullable = true)
//	@Enumerated(EnumType.STRING)
//	private Trazione trazione;
	private String trazione;
	@Column(nullable = true)
//	@Enumerated(EnumType.STRING)
//	private Cambio cambio; 
	private String cambio;
	
	@Column(nullable = true, length = 10)
	private String porte;
	@Column(nullable = true, length = 20)
//	@Enumerated(EnumType.STRING)
//	private Carrozzeria carrozzeria;
	private String carrozzeria;
	

	@Lob
	//@Column(name = "immagine", columnDefinition="BLOB")
	private byte[] immagine;
	
//	@Column(nullable = true, length = 64)
//	private String immagini;
	
	//private MultipartFile multipartFile;
	

	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;	
	
	
//	public VenditaDiretta (Long id,
//			String marca, String modello, String dataImmatricolazione,
//			String colore, String posti, String marce, String cilindrata,
//			String km, Alimentazione alimentazione,
//			Trazione trazione, Cambio cambio, String porte, Carrozzeria carrozzeria,
//			Double prezzo){
//
//this.id = id;
//this.marca = marca;
//this.modello = modello;
//this.dataImmatricolazione = dataImmatricolazione;
//this.colore = colore;
//this.posti = posti;
//this.marce = marce;
//this.cilindrata = cilindrata;
//this.km = km;
//
//this.alimentazione = alimentazione;
//this.trazione = trazione;
//this.cambio = cambio;
//
//this.porte = porte;
//this.carrozzeria = carrozzeria;
//
//this.prezzo = prezzo;
//}

	
	
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	//-------------------------
	
	public Long getId() {
		return id;
		}
		//----------------------
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
		public String getKm() {
		return km;
		}
		public void setKm(String km) {
		this.km = km;
		}
		//----------------------
//		public Trazione getTrazione() {
//		return trazione;
//		}
		//----------------------
//		public Alimentazione getAlimentazione() {
//		return alimentazione;
//		}
		//----------------------
//		public Cambio getCambio() {
//		return cambio;
//		}
		//----------------------
		public String getPorte() {
		return porte;
		}

		public void setPorte(String porte) {
		this.porte = porte;
		}
		//----------------------
//		public Carrozzeria getCarrozzeria() {
//		return carrozzeria;
//		}
		//--------------
	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	//------------
	public byte[] getImmagine() {
		return immagine;
	}
	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}
	//------------
//	public MultipartFile getMultipartFile() {
//		return multipartFile;
//	}
//	public void setMultipartFile(MultipartFile multipartFile) {
//		this.multipartFile = multipartFile;
//	}
//	public String getImmagini() {
//		return immagini;
//	}
//	public void setImmagini(String immagini) {
//		this.immagini = immagini;
//	}
	//---------------------
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public String getTrazione() {
		return trazione;
	}
	public void setTrazione(String trazione) {
		this.trazione = trazione;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getCarrozzeria() {
		return carrozzeria;
	}
	public void setCarrozzeria(String carrozzeria) {
		this.carrozzeria = carrozzeria;
	}
	//------------------------
}
