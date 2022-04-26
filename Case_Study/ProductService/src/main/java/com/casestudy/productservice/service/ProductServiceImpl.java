package com.casestudy.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.productservice.entity.Product;
import com.casestudy.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProducts(Product product) {
		
		return	productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return  productRepository.findAll();
	}

	@Override
	public Optional<Product> getProductById(int id) {
		return  productRepository.findById(id);
	}

	@Override
	public Optional<Product> getProductByName(String name) {
		return  productRepository.findByProductName(name);
	}

	@Override
	public Product updateProducts(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProductById(int id) {
		
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> getProductBycategory(String category) {
		
		return productRepository.findByCategory(category);
	}

	@Override
	public List<Product> getProductByType(String type) {
	
		return productRepository.findByProductType(type);
	}

}
