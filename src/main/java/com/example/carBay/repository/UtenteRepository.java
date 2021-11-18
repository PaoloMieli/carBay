package com.example.carBay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.carBay.model.Utente;


//import com.example.carBay.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {
	
	 @Query("SELECT u FROM Utente u WHERE u.username = :username")
	    public Utente getUtenteByUsername(@Param("username") String username);
	 
	
//	@Query("SELECT u FROM User u WHERE u.username = ?1")
	
//	public Utente findByUsername(String username);  //alternativa
	 
	 //List<Vendita> findAllByBuyerId(Long id);
	 
	 

}
