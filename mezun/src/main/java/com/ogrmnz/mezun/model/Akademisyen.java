package com.ogrmnz.mezun.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="akademisyen", schema="public3")
public class Akademisyen {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(name="akd_id")
	private String akdId;
	
	@Column(name="akd_ad")
	private String akdAd;
	
	@Column(name="akd_soyad")
	private String akdSoyad;
	
	@Column(name="cinsiyet")
	private String cinsiyet;
	
	@Column(name="yas")
	private BigDecimal yas;

	@Column(name="akd_tc")
	private String akdTc;
	
	@Column(name="akd_mail")
	private String akdMail;
	
	@Column(name="akd_sifre")
	private String akdSifre;
	
	@Column(name="akd_tel")
	private String akdTel;
	
	@Column(name="akd_fakulte")
	private String akdFakulte;
	
	@Column(name="akd_bolum")
	private String akdBolum;

	public String getakdId() {
		return akdId;
	}

	public void setakdId(String akdId) {
		this.akdId = akdId;
	}

	public String getAkdAd() {
		return akdAd;
	}

	public void setAkdAd(String akdAd) {
		this.akdAd = akdAd;
	}

	public String getAkdSoyad() {
		return akdSoyad;
	}

	public void setAkdSoyad(String akdSoyad) {
		this.akdSoyad = akdSoyad;
	}

	public String getAkdTc() {
		return akdTc;
	}

	public void setAkdTc(String akdTc) {
		this.akdTc = akdTc;
	}

	public String getAkdMail() {
		return akdMail;
	}

	public void setAkdMail(String akdMail) {
		this.akdMail = akdMail;
	}

	public String getAkdSifre() {
		return akdSifre;
	}

	public void setAkdSifre(String akdSifre) {
		this.akdSifre = akdSifre;
	}

	public String getAkdTel() {
		return akdTel;
	}

	public void setAkdTel(String akdTel) {
		this.akdTel = akdTel;
	}

	public String getAkdFakulte() {
		return akdFakulte;
	}

	public void setAkdFakulte(String akdFakulte) {
		this.akdFakulte = akdFakulte;
	}

	public String getAkdBolum() {
		return akdBolum;
	}

	public void setAkdBolum(String akdBolum) {
		this.akdBolum = akdBolum;
	}
	
	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public BigDecimal getYas() {
		return yas;
	}

	public void setYas(BigDecimal yas) {
		this.yas = yas;
	}
	
	

}
