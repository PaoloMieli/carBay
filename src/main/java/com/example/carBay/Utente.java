package com.example.carBay;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utenti")
public class Utente {
//	nome, cognome, data di nascita, codice fiscale, indirizzo, email, telefono, password
	@Id
	@Column(name = "utente_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cognome;
	private String dataNascita;
	private String codiceFiscale;
	private String indirizzo;
	private String email;
	private String telefono;
	private String password;
	
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "utente_ruolo",
//            joinColumns = @JoinColumn(name = "utente_id"),
//            inverseJoinColumns = @JoinColumn(name = "ruolo_id")
//            )
    //private Set<Role> roles = new HashSet<>();
	
	
	
//	public User(Long id, String nome, String cognome, String dataNascita,
//				String codiceFiscale, String indirizzo, String email,
//				String telefono, String password) {
//		this.id = id;
//		this.nome = nome;
//		this.cognome = cognome;
//		this.dataNascita = dataNascita;
//		this.codiceFiscale = codiceFiscale;
//		this.indirizzo = indirizzo;
//		this.email = email;
//		this.telefono = telefono;
//		this.password = password;
//	}
	
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
