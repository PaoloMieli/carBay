package com.example.carBay;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

//import com.example.carBay.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {
	
//	 @Query("SELECT u FROM User u WHERE u.username = :username")
//	    public Utente getUtenteByUsername(@Param("username") String username);
//	 
 public Utente findByUsername(String username);  //alternativa

}
