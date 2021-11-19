package com.example.carBay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.carBay.model.VenditaDiretta;

public interface VenditaDirettaRepository extends JpaRepository<VenditaDiretta, Long> {

		
	@Query(value = "select * from "
			+ "vendita v"
			+ " where "
			+ "v.alimentazione like %:keyword%"
			+ " or "
			+ "v.cambio like %:keyword%"
			+ " or "
			+ "v.carrozzeria like %:keyword%"
			+ " or "
			+ "v.colore like %:keyword%"
			+ " or "
			+ "v.marca like %:keyword%"
			+ " or "
			+ "v.modello like %:keyword%"
			+ " or "
			+ "v.prezzo like %:keyword%"
			+ " or "
			+ "v.trazione like %:keyword%", nativeQuery = true
			)
	List<VenditaDiretta> findByKeyword(@Param("keyword") String keyword);
}
