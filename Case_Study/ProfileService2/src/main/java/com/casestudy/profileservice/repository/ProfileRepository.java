package com.casestudy.profileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.profileservice.entity.UserProfile;

@Repository
public interface ProfileRepository extends MongoRepository<UserProfile,Integer> {

	public UserProfile findAllByMobileNumber(Long mobileNumber);
	public UserProfile findByfullName(String fullName);
	public UserProfile findByEmail(String email);
}
