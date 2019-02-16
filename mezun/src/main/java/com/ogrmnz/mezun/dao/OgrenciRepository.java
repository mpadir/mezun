package com.ogrmnz.mezun.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ogrmnz.mezun.model.Ogrenci;

@Repository
public interface OgrenciRepository extends JpaRepository<Ogrenci, Long> {
	
	@Query("select al from Ogrenci al where email = ?1")
	Optional<Ogrenci> findByEmail(String email);
	
	@Query("select u from Ogrenci u where email = ?1")
	Ogrenci login(String email);

}
