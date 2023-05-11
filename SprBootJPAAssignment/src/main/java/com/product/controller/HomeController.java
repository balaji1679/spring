package com.product.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.product.dao.ProductRepo;
import com.product.model.Product;
@Controller
public class HomeController {
	@Autowired
	ProductRepo prdRepo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}

	@RequestMapping("/addproduct")
	public String add() {
		return "add";
	}
		
	@RequestMapping("/deleteproduct")
	public String delete() {
		return "delete";
	}
	@RequestMapping("/updateproduct")
	public String update() {
		return "update";
	}

	
	  @RequestMapping("/GetAllproduct")
	  public String getall() {
	  
	 
	  return "GetAll";
	  
	  }
	 
	@RequestMapping("/GetbyIdproduct")
	public String Getbyid() {
		return "GetbyId";
	}
	
	@RequestMapping(path="/addprd",method=RequestMethod.POST)
	public ModelAndView addop(@RequestParam("pname") String pname,
			@RequestParam("brandname") String brandname,
			@RequestParam("price") int price) {
		ModelAndView  mv = new ModelAndView ();
		mv.addObject("pname", pname);
		mv.addObject("brandname", brandname);
		mv.addObject("price", price);
		mv.setViewName("addsuccess");
		
		Product prd = new Product();
		prd.setPname(pname);
 	    prd.setBrandname(brandname);
		prd.setPrice(0);

       prdRepo.save(prd);
		
		return mv;
	}
	
	@RequestMapping(path="/updateprod",method=RequestMethod.POST)
	public ModelAndView updateProduct(@ModelAttribute Product product) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("updatesuccess");
		Optional<Product> prd=prdRepo.findById(product.getPid());
		product=prd.get();
		product.setPname(product.getPname());
		mv.addObject("product", product);
		return mv;		
	}
	@RequestMapping(path="/deleteprd",method=RequestMethod.POST)
	public ModelAndView deleteop(
			@ModelAttribute Product product) {
		ModelAndView  mv = new ModelAndView ();
		mv.setViewName("deletesuccess");
		
		prdRepo.deleteById(product.getPid());
		System.out.println(" Deleted");
		return mv;
	}
	@RequestMapping(path="/getbyid",method=RequestMethod.POST)
	public ModelAndView getbyidop(
			@RequestParam("price") int price) {
		ModelAndView  mv = new ModelAndView ();
		mv.setViewName("GetbyIdsuccess");
	
		Optional<Product> opt= prdRepo.findById(3);
		
		Product prd = opt.get();
		mv.addObject("price", price);
		 System.out.println("Your  Details are ="+prd);
		 return mv;

}
	@RequestMapping("/getall")
	public String getallop(Model model) {
		List<Product> prodlist=new ArrayList<Product>();
		Iterable<Product> list=prdRepo.findAll();
		Iterator<Product> itr=list.iterator();
		while(itr.hasNext()) {
			Product p=itr.next();
			prodlist.add(p);
		}
		model.addAttribute("products",prodlist);
		return "GetAllsuccess" ;
	
	
}
}

