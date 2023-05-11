package com.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.travel.entity.Country;
import com.travel.entity.CountryRepo;

@Controller
public class ApplicationController {

	@Autowired
	private CountryRepo countryRepo;
	
	@RequestMapping("/")
	public String homePage() {
		return "Interface";

	}
	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";

	}
	
	@RequestMapping("/customer")
	public String customerPage() {
		return "customer";
	}
	
//	@RequestMapping("/getId")
//	public String getCountryIdPage() {
//		return "UpdateCountry";
//	}
	
//	@RequestMapping("/updateRow")
//	public String updateRow() {
//		return "getRow";
//	}
	
	@RequestMapping(path="/adminlogin",method=RequestMethod.POST)
	public String adminLogin(@RequestParam("username") 	String uname,@RequestParam("password") String pwd) {
		if(uname.equals("admin") && pwd.equals("admin@123"))
			return "adminmodule";
		else
			return "adminloginunsuccess";
	}
	
	@RequestMapping("/AddCountry")
	public String addCountry() {
	      return "AddCountry";
	}
	
	@RequestMapping(path="/addcountry",method = RequestMethod.POST)
	public ModelAndView createCountry(@RequestParam("CountryName") String countryName, @RequestParam("CityName") String cityName,
	@RequestParam("HotelName") String hotelName, @RequestParam("HotelDesc") String hotelDesc) {


	ModelAndView mv = new ModelAndView();
	mv.addObject("countryName", countryName);
	mv.addObject("cityName", cityName);
	mv.addObject("hotelName", hotelName);
	mv.addObject("hotelDesc", hotelDesc);
	mv.setViewName("AddSuccess");

	//insert data in database
	Country cntr = new Country();
	cntr.setCountryName(countryName);
	cntr.setCityName(cityName);
	cntr.setHotelName(hotelName);
	cntr.setHotelDesc(hotelDesc);
	countryRepo.save(cntr);
	return mv;

	}
	
	@RequestMapping("/UpdateCountry")
	public String updateRow() {
		return "UpdateCountry";	
	}
	
	@RequestMapping("/putId")
	public String putId() {
		return "putId";	
	}
	
	@RequestMapping(path="/getrow",method=RequestMethod.POST)
	public ModelAndView getRow(@RequestParam("countryid") int id) {
		Country country=countryRepo.getById(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("getRow");
		mv.addObject("country", country);
		return mv;
	}
	
	@RequestMapping(path="/getRowCustomer",method=RequestMethod.POST)
	public ModelAndView customer(@RequestParam("countryid") int id) {
		Country country=countryRepo.getById(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("getRowCustomer");
		mv.addObject("country", country);
		return mv;
	}
	
	//Request mapping fro updates
	@RequestMapping(path="/displayupdation",method = RequestMethod.POST)
	public ModelAndView updatedCountry(@RequestParam("countryid") int countryId,@RequestParam("countryname") String countryName, @RequestParam("cityname") String cityName,
			@RequestParam("hotelname") String hotelName, @RequestParam("hoteldesc") String hotelDesc) {
	Country country=countryRepo.getById(countryId);
	country.setCountryName(countryName);
	country.setCityName(cityName);
	country.setHotelName(hotelName);
	country.setHotelDesc(hotelDesc);
	countryRepo.save(country);
	ModelAndView mv=new ModelAndView();
	List<Country> countries=countryRepo.findAll();
	mv.setViewName("displayupdation");
	mv.addObject("countries", countries);
	return mv;
	}
	
}