package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.student.model.Filters;
import com.student.model.Product;
import com.student.service.ProductService;

@RestController
//@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> findAll()
	{
		return productService.listAll();
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product getProductByName(@PathVariable String name)
	{
		return productService.getProductByName(name);
	}
	
	@GetMapping("/getProductByFiltersApplied")
	public Product getProductByFiltersApplied(@RequestBody Filters filter)
	{
		return productService.getProductByFilter(filter);
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		System.out.println("In controller");
		return productService.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products)
	{
		return productService.saveProducts(products);
	}
	
	
}
