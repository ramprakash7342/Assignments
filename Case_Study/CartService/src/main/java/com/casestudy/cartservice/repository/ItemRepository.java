package com.casestudy.cartservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.cartservice.entity.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item,Integer> {

}
