package com.durgasoft.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.durgasoft.model.Product;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Component
public class ProductService {

	public List<Product> getService() {
		Product p = new Product(101,"M21","Samsung");
		Product p1 = new Product(102,"M31","Samsung");
		ArrayList<Product> a = new ArrayList<Product>();
		a.add(p);
		a.add(p1);
		return a;
	}
}
