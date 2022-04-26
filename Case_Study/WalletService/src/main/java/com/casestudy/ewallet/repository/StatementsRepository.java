package com.casestudy.ewallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.ewallet.pojo.Statement;

@Repository
public interface StatementsRepository extends MongoRepository<Statement, Integer> {

}
