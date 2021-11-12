package com.example.carBay;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ruoli")
public class Ruolo {

	@Id
    @Column(name = "ruolo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false, length = 45)
	private String ruolo;
	
	
	
	
	public Ruolo() {}
	
	public Ruolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	public Ruolo(Long id, String ruolo) {
		this.id = id;
		this.ruolo = ruolo;
	}
	
	
	
    public Long getId() {
        return id;
    }

    @Override
	public String toString() {
		return this.ruolo;
	}

}