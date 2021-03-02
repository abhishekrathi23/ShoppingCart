package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Filters;
import com.student.model.Product;
import com.student.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo prodrepo;
	
	public List<Product> listAll()
	{
		return prodrepo.findAll();
	}
	
	public List<Product> saveProducts(List<Product> products)
	{
		return prodrepo.saveAll(products);
	}
	
	public Product saveProduct(Product product)
	{
		System.out.println("In service");
		return prodrepo.save(product);
	}
	
	public Product getProductByName(String name)
	{
		return prodrepo.findByproductName(name);
	}
	
	public Product getProductByFilter(Filters filter)
	{
		return prodrepo.findByfilter(filter);
	}
}
