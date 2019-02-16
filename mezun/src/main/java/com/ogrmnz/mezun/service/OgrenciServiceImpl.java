package com.ogrmnz.mezun.service;

import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ogrmnz.mezun.dao.OgrenciRepository;
import com.ogrmnz.mezun.exception.OgrenciNotFound;
import com.ogrmnz.mezun.exception.PasswordException;
import com.ogrmnz.mezun.model.Ogrenci;

@Service
public class OgrenciServiceImpl implements OgrenciService {
	
	@Autowired
	OgrenciRepository ogrenciRepository;
	
	
	
	public Ogrenci save(@RequestBody Ogrenci ogrenci) {
		return ogrenciRepository.save(ogrenci);
	}
	
	public List<Ogrenci> getAll(){
		return ogrenciRepository.findAll();
	}

	@Override
	public ResponseEntity<Ogrenci> login(Ogrenci ogrenci) throws OgrenciNotFound, PasswordException {
		Optional<Ogrenci> newOgrenci = ogrenciRepository.findByEmail(ogrenci.getEmail());
		if(newOgrenci.isPresent()) {
			if(StringUtils.equals(newOgrenci.get().getPassword(), ogrenci.getPassword())) {
				return new ResponseEntity<Ogrenci>(newOgrenci.get(), HttpStatus.OK);
			}else {
				throw new PasswordException("hatalı Şifre");
			}
		}else {
			throw new OgrenciNotFound("Ogrenci Bulunamadı");
		}
	}


}
