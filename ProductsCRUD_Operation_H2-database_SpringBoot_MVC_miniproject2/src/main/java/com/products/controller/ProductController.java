package com.products.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.products.dao.ProductRepository;
import com.products.entities.Product;

@Controller
//or
//@RestController
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	// @RequestMapping(value="/products",method = RequestMethod.GET)
	// @ResponseBody
	// or
	// get all product
	@RequestMapping("/")
	public String home(Model m) {
		Iterable<Product> list = productRepository.findAll();
		m.addAttribute("lists", list);
		return "home";
	}

	@RequestMapping("/add-prod")
	public String addProd() {
		return "addprod";

	}

	// add product to database and views
	@RequestMapping("/products")
	public ModelAndView createProduct(@RequestParam("pName") String pName, @RequestParam("pDes") String pDes,
			@RequestParam("pBrand") String pBrand, @RequestParam("pPrice") double pPrice) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("pName", pName);
		mv.addObject("pDes", pDes);
		mv.addObject("pBrand", pBrand);
		mv.addObject("pPrice", pPrice);
		mv.setViewName("pAddViews");

		// insert data in database
		Product prod = new Product();
		prod.setProduct_Name(pName);
		prod.setProduct_Description(pDes);
		prod.setProduct_Brand(pBrand);
		prod.setProduct_Price(pPrice);
		productRepository.save(prod);
		return mv;

	}

	// delete question by id
	@RequestMapping("/Delete-prod/{product_Id}")
	public RedirectView deleteProduct(@PathVariable("product_Id") int product_Id, HttpServletRequest request) {
		productRepository.deleteById(product_Id);
		RedirectView redirect = new RedirectView();
		redirect.setUrl(request.getContextPath() + "/");
		return redirect;
	}

	// view one product
	@RequestMapping("/View-one/{product_Id}")
	public String viewProd(@PathVariable("product_Id") int product_Id, Model m) {
		Product prods = this.productRepository.findById(product_Id);
		m.addAttribute("prods", prods);
		return "viewprod";
	}

//update product
	@RequestMapping("/Update-prod/{product_Id}")
	public String updateProd(@PathVariable("product_Id") int product_Id, Model m) {
		Product prods = this.productRepository.findById(product_Id);
		m.addAttribute("prods", prods);
		return "updateprod";
	}

	// handler for form tag
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleQue(@ModelAttribute Product pro, HttpServletRequest request) {
		System.out.println(pro);
		productRepository.save(pro);
		RedirectView redirect = new RedirectView();
		redirect.setUrl(request.getContextPath() + "/");
		return redirect;
	}

}
