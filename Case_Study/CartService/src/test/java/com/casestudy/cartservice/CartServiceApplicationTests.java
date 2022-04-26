package com.casestudy.cartservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.casestudy.cartservice.repository.CartRepository;
import com.casestudy.cartservice.service.CartService;

@SpringBootTest
class CartServiceApplicationTests {

	@MockBean
	private CartRepository cartRepository;
	
	@Autowired
	private CartService cartService;
	
	

}
