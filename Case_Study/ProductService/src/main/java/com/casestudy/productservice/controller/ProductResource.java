package com.casestudy.productservice.controller;

import java.util.List;

import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.casestudy.productservice.entity.Product;
import com.casestudy.productservice.entity.SequenceGeneratorService;
import com.casestudy.productservice.exception.NotFoundException;
import com.casestudy.productservice.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/product")
public class ProductResource {

	Logger logger=LoggerFactory.getLogger(ProductResource.class);
	
	@Autowired
	private ProductService  productService;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@PostMapping("/save-product")
	@Operation(summary="Add a product to database!")
	public ResponseEntity<Product> addProducts(@RequestBody @Valid Product product) {
		
        product.setProductId(sequenceGeneratorService.generateSequence(Product.SEQUENCE_NAME));
		Product product2= productService.addProducts(product);
		logger.info("Product is saved in DB");
		return new ResponseEntity<>(product2,HttpStatus.CREATED);
	}
	
	@GetMapping("/all-products")
	@Operation(summary="Get all products from database!")
	public ResponseEntity<List<Product>> getAllProduct(){
		
		List<Product> product=  productService.getAllProducts();
		if(product.isEmpty())
		{
			logger.error("No Product is present in DB");
			throw new NotFoundException("Your Product List is completely empty. Please add something to Retrive it");
		}
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{productId}")
	@Operation(summary="Get a product by productId from database!")
	public ResponseEntity<Product> getProductById(@PathVariable int productId){
		
		Product product= productService.getProductById(productId)
				.orElseThrow(()->new NotFoundException(productId+" is not present in DB please Enter existing id"));
		logger.info("Product is fetched successfully with product id "+productId);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping("/getbytype/{type}")
	@Operation(summary="Get a product by productType from database!")
	public ResponseEntity<List<Product>> getProductByType(@PathVariable String type){
		
		List<Product> products= productService.getProductByType(type);
		logger.info("product is fetched successfully by type "+type);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/getbyname/{name}")
	@Operation(summary="Get a product by productName from database!")
	public ResponseEntity< Product> getProductByName(@PathVariable String name){
		
		Product product= productService.getProductByName(name)
				.orElseThrow(()->new NotFoundException("Product with name "+name+" is not present in DB please Enter existing name"));
		logger.info("Product is fetched successfully with name "+name);
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
	
	@GetMapping("/getbycategory/{category}")
	@Operation(summary="Get a product by productCategory from database!")
	public ResponseEntity< List<Product>> getProductByCategory(@PathVariable String category){
		
		List<Product> products= productService.getProductBycategory(category);
		if(products==null) {
			logger.error("No product is present with category "+category);
			throw new NotFoundException("No product is present with category "+category);
		}
		logger.info("products is fetched successfully with category "+category);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@PutMapping("/update/{productId}")
	@Operation(summary="Update product in  database!")
	public ResponseEntity< Product> updateProduct(@RequestBody Product product,@PathVariable int productId) {
		
		Product existingProduct=productService.getProductById(productId)
				.orElseThrow(()->new NotFoundException(productId+" is not present in DB please Enter existing id"));
		
		existingProduct.setProductName(product.getProductName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setProductType(product.getProductType());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setImage(product.getImage());
		existingProduct.setSpecificationKey(product.getSpecificationKey());
		existingProduct.setSpecificationValue(product.getSpecificationValue());
		existingProduct.setCategory(product.getCategory());
		
		productService.addProducts(existingProduct);
		
		logger.info("Product is updated successfully with id "+productId);
		return new ResponseEntity<>(existingProduct, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{productId}")
	@Operation(summary="Delete a product  from database!")
	public void deleteProduct(@PathVariable int productId) {
		
		productService.getProductById(productId)
		           .orElseThrow(()->new NotFoundException(productId+" is not present in DB please Enter existing id"));
		
		productService.deleteProductById(productId);
		logger.info("product is deleted successfully with id "+productId);
	}
}
