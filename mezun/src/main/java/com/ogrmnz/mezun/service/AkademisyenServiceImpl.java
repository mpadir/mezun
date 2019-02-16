package com.ogrmnz.mezun.service;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.ogrmnz.mezun.dao.AkademisyenRepository;
import com.ogrmnz.mezun.exception.AkademisyenNotFound;
import com.ogrmnz.mezun.exception.PasswordException;
import com.ogrmnz.mezun.model.Akademisyen;

@Service
public class AkademisyenServiceImpl implements AkademisyenService {
	
	@Autowired
	AkademisyenRepository akademisyenRepository;
	
	@Override
	public ResponseEntity<Akademisyen> login(@RequestBody Akademisyen akademisyen) throws AkademisyenNotFound, PasswordException{
		Optional<Akademisyen> newAkademisyen = akademisyenRepository.findByEmail(akademisyen.getAkdMail());
		if(newAkademisyen.isPresent()) {
			if(StringUtils.equals(newAkademisyen.get().getAkdSifre(), akademisyen.getAkdSifre())) {
				return new ResponseEntity<Akademisyen>(newAkademisyen.get(),HttpStatus.OK);
			}else {
				throw new PasswordException("Hatalı Şifre");
			}
		}else {
			throw new AkademisyenNotFound("Akademisyen Bulunamadı");
		}
	}
	
	public Akademisyen save(@RequestBody Akademisyen akademisyen) {
		return akademisyenRepository.save(akademisyen);
	}

}
