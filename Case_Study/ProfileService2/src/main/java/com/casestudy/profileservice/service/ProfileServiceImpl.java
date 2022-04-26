package com.casestudy.profileservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.profileservice.entity.Role;
import com.casestudy.profileservice.entity.UserProfile;
import com.casestudy.profileservice.repository.ProfileRepository;


@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	public ProfileServiceImpl() {
		super();
	}

	@Override
	public UserProfile addNewCustomerProfile(UserProfile customer) {
		
		customer.setRole(Role.ROLE_CUSTOMER);
		profileRepository.save(customer);
		return customer;
		
	}

	@Override
	public List<UserProfile> getAllProfiles() {
		
		return profileRepository.findAll();
	}

	@Override
	public Optional<UserProfile> getByProfileId(int profileId) {
		
		return profileRepository.findById(profileId);
	}

	@Override
	public void updateProfile(UserProfile userProfile) {
	
         profileRepository.save(userProfile);
	}

	@Override
	public void deleteProfile(int profileId) {
		
           profileRepository.deleteById(profileId);
	}

	@Override
	public UserProfile addNewMerchantProfile(UserProfile merchant) {
		
		merchant.setRole(Role.ROLE_MERCHANT);
		profileRepository.save(merchant);
		return merchant;
	}

	@Override
	public UserProfile addNewDeliveryProfile(UserProfile deliveryagent) {
		
		deliveryagent.setRole(Role.ROLE_DELIVERYAGENT);
		profileRepository.save(deliveryagent);
		return deliveryagent;
	}

	@Override
	public UserProfile getByMobileNumber(Long mobileNumber) {
		
		return profileRepository.findAllByMobileNumber(mobileNumber);
	}

	@Override
	public UserProfile getByEmail(String email) {
		
		return profileRepository.findByEmail(email);
	}

	@Override
	public UserProfile getByFullName(String fullname) {
		
		return profileRepository.findByfullName(fullname);
	}

}
