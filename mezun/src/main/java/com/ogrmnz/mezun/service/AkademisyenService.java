package com.ogrmnz.mezun.service;

import org.springframework.http.ResponseEntity;

import com.ogrmnz.mezun.exception.AkademisyenNotFound;
import com.ogrmnz.mezun.exception.PasswordException;
import com.ogrmnz.mezun.model.Akademisyen;

public interface AkademisyenService {
	
ResponseEntity<Akademisyen> login(Akademisyen akademisyen) throws AkademisyenNotFound, PasswordException;
	
	Akademisyen save(Akademisyen akademisyen);

}
