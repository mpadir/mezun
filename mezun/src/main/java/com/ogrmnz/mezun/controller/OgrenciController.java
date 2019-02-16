package com.ogrmnz.mezun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ogrmnz.mezun.exception.OgrenciNotFound;
import com.ogrmnz.mezun.exception.PasswordException;
import com.ogrmnz.mezun.model.Ogrenci;
import com.ogrmnz.mezun.service.OgrenciService;

@CrossOrigin
@RestController
@Controller
public class OgrenciController {
	
	@Autowired
	OgrenciService ogrenciService;
	
	@PostMapping("/ologin")
	public ResponseEntity<Ogrenci> login(@RequestBody Ogrenci ogrenci) throws OgrenciNotFound, PasswordException{
		return ogrenciService.login(ogrenci);
	}
	
	@PostMapping("/createOgrenci")
	public Ogrenci save(@RequestBody Ogrenci ogrenci) {
		return ogrenciService.save(ogrenci);
	}
	
	@GetMapping("/ogrenciler")
	public List<Ogrenci> getAll(){
		return ogrenciService.getAll();
	}

}
