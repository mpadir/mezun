package com.ogrmnz.mezun.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ogrmnz.mezun.exception.OgrenciNotFound;
import com.ogrmnz.mezun.exception.PasswordException;
import com.ogrmnz.mezun.model.Ogrenci;

public interface OgrenciService {
	
	ResponseEntity<Ogrenci> login(Ogrenci ogrenci) throws OgrenciNotFound, PasswordException;
	
	Ogrenci save(Ogrenci ogrenci);
	
	List<Ogrenci> getAll();

}
