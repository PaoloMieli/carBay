package com.example.carBay;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendita")
public class VenditaDiretta implements Vendita{
	@Id
    @Column(name = "vendita_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private long prezzo;

	public long getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(long prezzo) {
		this.prezzo = prezzo;
	}

}
