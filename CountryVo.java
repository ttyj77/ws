package com.kong.model;

import org.springframework.stereotype.Component;

@Component("countryVo")
public class CountryVo {
	private int countryNo;
	private String country;
	private String city;
	
	
	public CountryVo() {
		  
	}
	
	
	
	public CountryVo(int countryNo, String country, String city) {
		this.countryNo = countryNo;
		this.country = country;
		this.city = city;
	}
	public int getCountryNo() {
		return countryNo;
	}
	public void setCountryNo(int countryNo) {
		this.countryNo = countryNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
