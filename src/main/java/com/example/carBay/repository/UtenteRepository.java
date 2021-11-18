package com.example.carBay.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.carBay.model.Utente;




public interface UtenteRepository extends CrudRepository<Utente, Long> {
	
	 @Query("SELECT u FROM Utente u WHERE u.username = :username")
	    public Utente getUtenteByUsername(@Param("username") String username);


}
