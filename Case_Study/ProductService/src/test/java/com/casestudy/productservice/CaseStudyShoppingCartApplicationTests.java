package com.casestudy.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.casestudy.productservice.entity.Product;
import com.casestudy.productservice.repository.ProductRepository;
import com.casestudy.productservice.service.ProductServiceImpl;


@SpringBootTest
class CaseStudyShoppingCartApplicationTests {

	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@MockBean
	private ProductRepository productRepository;
	
	
	@Test
	void getAllProductTest() {
		when(productRepository.findAll()).thenReturn(Stream.of(
				                                     new Product(11, "watch","sony", "hand-watch", null, null,null,2000,"sony watch","color","white"),
				                                     new Product(12, "Laptop","acer", "computer", null, null,null,40000,"acer Laptop", "Ram","8GB")
				                                     ).collect(Collectors.toList()));
		                          
		assertEquals(2,productServiceImpl.getAllProducts().size());
	}
	
	
	@Test
	void getProductByCategoryTest() {
		when(productRepository.findByCategory("computer")).thenReturn(Stream.of(
				                                     new Product(12, "Laptop","acer", "computer", null, null,null,40000,"acer Laptop", "RAM","8GB")
				                                     ).collect(Collectors.toList()));
		
	    assertEquals(1,productServiceImpl.getProductBycategory("computer").size());	
	}
	
	@Test
	void getByProductTypeTest() {
		when(productRepository.findByProductType("acer")).thenReturn(Stream.of(
                new Product(12, "Laptop","acer", "computer", null, null,null,40000,"acer Laptop", "RAM","8GB")
                ).collect(Collectors.toList()));
		
		assertEquals(1,productServiceImpl.getProductByType("acer").size());
		
	}
	
	
	
//	@Test
//	void getByIdTest() {
//		when(productRepository.findById(12).get()).thenReturn( 
//				new Product(12, "Laptop","acer", "computer", null, null,null,40000,"acer Laptop","RAM","8GB" ));
//		
//		assertEquals(
//				new Product(12, "Laptop","acer", "computer", null, null,null,40000,"acer Laptop", "RAM","8GB"),
//				productServiceImpl.getProductById(12)
//				);
//
//	}
//	
//	@Test
//	void getByNameTest() {
//		when(productRepository.findByProductName("sony").get()).thenReturn( 
//			  new Product(11, "watch","sony", "hand-watch", null, null,null,2000,"sony watch","color","white"));
//		
//		assertEquals(
//				 new Product(11, "watch","sony", "hand-watch", null, null,null,2000,"sony watch","color","white"),
//				productServiceImpl.getProductByName("sony")
//				);
//
//	}
	
	
		
	
	private Product pro=new Product();
	
	@Test
	void getProductIdTest() {
		pro.setProductId(111);
		assertEquals(111,pro.getProductId());
	}
	
	@Test
	void getProductName() {
		pro.setProductName("watch");
		assertEquals("watch",pro.getProductName());
	}
	
}
