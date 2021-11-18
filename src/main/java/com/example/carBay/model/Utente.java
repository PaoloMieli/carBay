package com.example.carBay.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
//import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
//import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "utenti")
public class Utente {

	@Id
	@Column(name = "utente_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	

  
	@Column(name = "nome", nullable = false, length = 20)
	private String nome;
	@Column(name = "cognome", nullable = false, length = 20)
	private String cognome;
	
	@Column(nullable = false, unique = true, length = 45)
	private String username;
	
	@Column(nullable = false, length = 45)
	private String dataNascita;
	
	@Column(nullable = false, unique = true, length = 45)
	private String codiceFiscale;
	
	@Column(nullable = false, length = 64)
	private String indirizzo;
	
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	
	@Column(nullable = false, length = 20)
	private String telefono;
	
	@Column(nullable = false, length = 64)
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "utenti_ruoli",
            joinColumns = @JoinColumn(name = "utente_id"),
            inverseJoinColumns = @JoinColumn(name = "ruolo_id")
            )
    private Set<Ruolo> ruoli = new HashSet<>();
	
	
	
	@OneToMany(mappedBy = "utente")
	private List<VenditaDiretta> annunci;
	
	
	
	public Long getId() {
		return id;
	}
	//-----------------
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//-----------------
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	//-----------------
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//-----------------
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	//-----------------
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	//-----------------
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	//-----------------
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//-----------------
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//-----------------
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//-----------------
	public Set<Ruolo> getRuoli() {
			return ruoli;
		}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
