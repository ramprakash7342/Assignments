package com.casestudy.cartservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.cartservice.entity.Cart;

@Repository
public interface CartRepository extends MongoRepository<Cart,Integer> {

}
