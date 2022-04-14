package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;

@Controller
public class SimpleController {

	@GetMapping("/simple") //localhost:8080/simple
	public String simpleFunction()
	{
		System.out.println("connection made");
		return "home";
	}
	
	
	
	//1. izveidot savu kontrolejoso funkciju, lai varetu no backend nosutit uz frontendu String zinu
	@GetMapping("/msg")
	public String msgFunc(Model model)
	{
		model.addAttribute("package", "Sveiciens no backend");
		return "msg-page";
	}
	
	
	//2. izveidot hmtl lapu, kas so zinu sanem un attelo
	
	@GetMapping("/sendprod")
	public String sendProdFunc(Model model)
	{
		Product prodTest = new Product("Abols", "garsigs", 0.99f,10);
		model.addAttribute("package", prodTest);
		return "prod-page";	//ielē prod-page.html lapu
	}
	
	
}
