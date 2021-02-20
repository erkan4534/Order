package com.order.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.order.business.IProductService;
import com.order.entities.Product;

@RestController
public class ProductsController {

	@Autowired
	IProductService productService;
	
	@GetMapping(path = "findAll")
	public List<Product> findAll() {
		return productService.findAll();
	}
	

	
}
