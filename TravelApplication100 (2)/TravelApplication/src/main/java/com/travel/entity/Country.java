package com.travel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CountryDetails")

public class Country{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private int CountryId;
    private String CountryName;
    private String CityName;
    private String HotelName;
    private String HotelDesc;
	public int getCountryId() {
		return CountryId;
	}
	public void setCountryId(int countryId) {
		CountryId = countryId;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public String getHotelDesc() {
		return HotelDesc;
	}
	public void setHotelDesc(String hotelDesc) {
		HotelDesc = hotelDesc;
	}
	@Override
	public String toString() {
		return "Country [CountryId=" + CountryId + ", CountryName=" + CountryName + ", CityName=" + CityName
				+ ", HotelName=" + HotelName + ", HotelDesc=" + HotelDesc + "]";
	}
	public Country(int countryId, String countryName, String cityName, String hotelName, String hotelDesc) {
		super();
		CountryId = countryId;
		CountryName = countryName;
		CityName = cityName;
		HotelName = hotelName;
		HotelDesc = hotelDesc;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
}
