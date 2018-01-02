package com.tact.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tact.eshop.entity.Customer;
import com.tact.eshop.repository.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@RequestMapping("/customer")
	public String Index(Model model) {
		
		List<Customer> customers = (List<Customer>) customerRepo.findAll();
		model.addAttribute("customers", customers);
		return "/customer";
	}
	
	
}
