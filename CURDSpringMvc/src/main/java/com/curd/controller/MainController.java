package com.curd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.curd.Dao.ProductDao;
import com.curd.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping(path = { "/" })
	public String Home(Model model) {
		List<Product> products = productDao.products();
		model.addAttribute("products", products);
		return "index";
	}

	// show add product
	@RequestMapping("/addproduct")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "addproduct";
	}

	// add product
	@RequestMapping(path = "/handleproduct", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	//delete product
	@RequestMapping("/delete/{id}")
	public RedirectView deleteProduct(@PathVariable("id") int id ,HttpServletRequest request) {
		this.productDao.deleteProduct(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	//Update product
	@RequestMapping(path = "/update/{id}")
	public String updateProduct(@PathVariable("id") int id ,Model model) {
		Product product = this.productDao.getProduct(id);
		model.addAttribute("product",product);
		return "updateproduct";
	}
	
}
