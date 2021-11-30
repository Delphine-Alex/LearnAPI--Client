package com.ynov.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ynov.client.model.Product;
import com.ynov.client.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public String productsPage(Model model) {
		List<Product> products = productService.getProducts();
		model.addAttribute("products", products);
 		return "products";
	}
	
	@GetMapping("/product/{id}")
	public String productPage(@PathVariable(name = "id") Integer id, Model model) {
		Product product = productService.getProductById(id);
		model.addAttribute("product", product);
 		return "product";
	}
}
