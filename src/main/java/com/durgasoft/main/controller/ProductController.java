package com.durgasoft.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durgasoft.main.service.ProductService;
import com.durgasoft.model.Product;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@RestController
public class ProductController {

	@Autowired
	public ProductService pservice;
	
	@GetMapping("/product")
	public List<Product> getProducts(){
		return pservice.getService();
		
	}
	
}
