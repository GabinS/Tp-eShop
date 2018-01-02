package com.tact.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tact.eshop.entity.Product;
import com.tact.eshop.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@RequestMapping("/product")
	public String Index(Model model) {
		
		List<Product> products = (List<Product>) productRepo.findAll();
		model.addAttribute("products", products);
		return "/product";
	}

}
