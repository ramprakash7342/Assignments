package com.casestudy.profileservice.service;

import java.util.List;
import java.util.Optional;

import com.casestudy.profileservice.entity.UserProfile;

public interface ProfileService {

	public UserProfile addNewCustomerProfile(UserProfile customer);
	public List<UserProfile> getAllProfiles();
	public Optional<UserProfile> getByProfileId(int profileId);
	public void updateProfile(UserProfile userProfile);
	public void deleteProfile(int profileId);
	public UserProfile addNewMerchantProfile(UserProfile merchant);
	public UserProfile addNewDeliveryProfile(UserProfile deliveryagent);
	public UserProfile getByMobileNumber(Long mobileNumber);
	public UserProfile getByEmail(String email);
	public UserProfile getByFullName(String fullName);
	
	
}
