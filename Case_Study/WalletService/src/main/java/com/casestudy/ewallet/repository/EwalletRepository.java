package com.casestudy.ewallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.ewallet.pojo.Ewallet;

@Repository
public interface EwalletRepository extends MongoRepository<Ewallet, Integer> {

}
