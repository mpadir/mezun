package com.ogrmnz.mezun.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ogrmnz.mezun.model.Akademisyen;

@Repository
public interface AkademisyenRepository extends JpaRepository<Akademisyen, Long> {
	
	@Query("select al from Akademisyen al where mail = ?1 ")
	Optional<Akademisyen> findByEmail(String mail);
	
	@Query("select al from Akademisyen al where mail = ?1")
	Akademisyen login(String mail);

}
