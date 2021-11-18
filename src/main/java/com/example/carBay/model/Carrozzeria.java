package com.example.carBay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carrozzeria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String carrozzeria;

	public String getCarrozzeria() {
		return carrozzeria;
	}

	public void setCarrozzeria(String carrozzeria) {
		this.carrozzeria = carrozzeria;
	}

	public Long getId() {
		return id;
	}
	
	
}
