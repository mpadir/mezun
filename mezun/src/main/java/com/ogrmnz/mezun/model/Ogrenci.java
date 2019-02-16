package com.ogrmnz.mezun.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ogrenci", schema="public3")
public class Ogrenci {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(name="ogr_id")
	private String ogrId;
	
	@Column(name="ogr_ad")
	private String ogrAd;
	
	@Column(name="ogr_soyad")
	private String ogrSoyad;
	
	@Column(name="cinsiyet")
	private String cinsiyet;
	
	@Column(name="yas")
	private Date yas;
	
	@Column(name="ogr_tc")
	@Size(min = 11, max=11)
	private String ogrTc;
	
	@Column(name="ogr_mail")
	private String email;
	
	@Column(name="ogr_sifre")
	private String password;
	
	@Column(name="ogr_tel")
	@Size(min=11, max=11)
	private BigDecimal ogrTel;
	
	@Column(name="ogr_meztarih")
	private Date ogrMeztarihi;
	
	@Column(name="ogr_fakulte")
	
	private String ogrFakulte;
	
	@Column(name="ogr_bolum")
	private String ogrBolum;
	
	@Column(name="ogr_isdurumu")
	private String ogrIsdurumu;
	
	@Column(name="ogr_sirket")
	private String ogrSirket;

	

	public String getOgrId() {
		return ogrId;
	}

	public void setOgrId(String ogrId) {
		this.ogrId = ogrId;
	}

	public String getOgrAd() {
		return ogrAd;
	}

	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}

	public String getOgrSoyad() {
		return ogrSoyad;
	}

	public void setOgrSoyad(String ogrSoyad) {
		this.ogrSoyad = ogrSoyad;
	}

	public String getOgrTc() {
		return ogrTc;
	}

	public void setOgrTc(String ogrTc) {
		this.ogrTc = ogrTc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getOgrTel() {
		return ogrTel;
	}

	public void setOgrTel(BigDecimal ogrTel) {
		this.ogrTel = ogrTel;
	}

	public String getOgrFakulte() {
		return ogrFakulte;
	}

	public void setOgrFakulte(String ogrFakulte) {
		this.ogrFakulte = ogrFakulte;
	}

	public String getOgrBolum() {
		return ogrBolum;
	}

	public void setOgrBolum(String ogrBolum) {
		this.ogrBolum = ogrBolum;
	}

	public String getOgrIsdurumu() {
		return ogrIsdurumu;
	}

	public void setOgrIsdurumu(String ogrIsdurumu) {
		this.ogrIsdurumu = ogrIsdurumu;
	}

	public String getOgrSirket() {
		return ogrSirket;
	}

	public void setOgrSirket(String ogrSirket) {
		this.ogrSirket = ogrSirket;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public Date getYas() {
		return yas;
	}

	public void setYas(Date yas) {
		this.yas = yas;
	}

	public Date getOgrMeztarihi() {
		return ogrMeztarihi;
	}

	public void setOgrMeztarihi(Date ogrMeztarihi) {
		this.ogrMeztarihi = ogrMeztarihi;
	}
	
	
	

}
