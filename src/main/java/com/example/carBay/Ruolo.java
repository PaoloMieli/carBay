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
	
	private String ruolo;
	
    public Long getId() {
        return id;
    }

	public String getRuolo() {
		return ruolo;
	}

}