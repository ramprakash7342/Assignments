package com.casestudy.productservice.service;

import java.util.List;
import java.util.Optional;

import com.casestudy.productservice.entity.Product;


public interface ProductService {

	public Product addProducts(Product product);
	public List<Product> getAllProducts();
	public Optional<Product> getProductById(int id);
	public Optional<Product> getProductByName(String name);
	public Product updateProducts(Product product);
	public void deleteProductById(int id);
	public List<Product> getProductBycategory(String category);
	public List<Product> getProductByType(String type);
}
