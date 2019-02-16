package com.ogrmnz.mezun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ogrmnz.mezun.exception.AkademisyenNotFound;
import com.ogrmnz.mezun.exception.PasswordException;
import com.ogrmnz.mezun.model.Akademisyen;
import com.ogrmnz.mezun.service.AkademisyenService;

@CrossOrigin
@Controller
@RestController
public class AkademisyenController {
	
	@Autowired
	AkademisyenService akademisyenService;
	
	@PostMapping("/alogin")
	public ResponseEntity<Akademisyen> login(@RequestBody Akademisyen akademisyen) throws AkademisyenNotFound, PasswordException{
		return akademisyenService.login(akademisyen);
	}
	
	@PostMapping("/createAkademisyen")
	public Akademisyen save(@RequestBody Akademisyen akademisyen) {
		return akademisyenService.save(akademisyen);
	}

}
