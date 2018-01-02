package com.tact.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tact.eshop.entity.Order;
import com.tact.eshop.repository.OrderRepository;


@Controller
public class OrderController {
	@Autowired
	private OrderRepository orderRepo;
	
	@RequestMapping("/order")
	public String Index(Model model) {
		
		List<Order> orders = (List<Order>) orderRepo.findAll();
		model.addAttribute("orders", orders);
		return "/order";
	}
}
