package com.casestudy.cartservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.casestudy.cartservice.entity.Item;
import com.casestudy.cartservice.entity.Product;
import com.casestudy.cartservice.entity.UserProfile;


@Service
public class RestTemplateCalls {
	

	@Autowired
	public RestTemplate restTemplate;
	
	
	public Item getProductDetails(int productId) {
		
		Product product=restTemplate.getForObject("http://PRODUCT-SERVICE/product/getbyid/"+productId, Product.class);
		
		Item item =new Item();
		 
		item.setItemId(product.getProductId());
		item.setProductName(product.getProductName());
		item.setPrice(product.getPrice());
		item.setQuantity(1);
		
		return item;
	}
	
	
	public int getCartId(String email) {
		UserProfile profile=restTemplate.getForObject("http://PROFILE-SERVICE/profile/getbyemail/"+email, UserProfile.class);
		
		return profile.getProfileId();
	}
}
