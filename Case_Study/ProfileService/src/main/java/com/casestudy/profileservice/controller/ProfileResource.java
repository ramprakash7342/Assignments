package com.casestudy.profileservice.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.profileservice.entity.SequenceGeneratorService;
import com.casestudy.profileservice.entity.UserProfile;
import com.casestudy.profileservice.exception.NotFoundException;
import com.casestudy.profileservice.exception.ProfileAlreadyExistException;
import com.casestudy.profileservice.service.ProfileService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/profile")
@CrossOrigin(origins = "http://localhost:3000")
public class ProfileResource {
	
	private Logger logger=LoggerFactory.getLogger(ProfileResource.class);
	
	@Autowired
	private ProfileService  profileService;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
		
	
	@PostMapping("/add-customer")
	@Operation(summary="Add new customer into the DB!")
	public UserProfile addNewCustomerProfile(@RequestBody UserProfile customer) {
		
		UserProfile profile=profileService.getByEmail(customer.getEmail());
		
		if(profile!=null){
			
			logger.error("Error in addNewCustomerProfiel method : Customer Profile with "+customer.getEmail()+" email already present");
			throw new ProfileAlreadyExistException("Customer Profile with "+customer.getEmail()+" email already present");
		}
		
		customer.setProfileId(sequenceGeneratorService.generateSequence(UserProfile.SEQUENCE_NAME));
		logger.info("Customer Profile is save with email "+customer.getEmail());
		
		return profileService.addNewCustomerProfile(customer);
	}
	
	
	@GetMapping("/all-profiles")
	@Operation(summary="Get all the profiles present in the DB!")
	public List<UserProfile> getAllProfiles(){
		
		List<UserProfile> profiles=profileService.getAllProfiles();
		
		if(profiles.isEmpty())
		{
			logger.error("Error in getAllProfiles method : Not Profile is there in the DB");
			throw new NotFoundException("Not Profile is there in the DB");
		}
		
		logger.info("Profile are fetched successfully");
		return profiles;
	}
	
	
	@GetMapping("/getbyid/{profileId}")
	@Operation(summary="Get specific profile with given profileId!")
	public UserProfile getByProfileId(@PathVariable int profileId){
		
		UserProfile profile=profileService.getByProfileId(profileId).get();
		if(profile==null) {
			
			logger.error("Error in getByProfileId method : No such profile exists with profileId "+profileId);
			throw new NotFoundException("No such profile exists with profileId "+profileId);
		}
		
		logger.info("Profile is fetched successfully with id "+profileId);
		return profile;
	}
	
	
	@PutMapping("/update/{profileId}")
	@Operation(summary="Update the profile with given id if exist in db!")
	public void updateProfile(@RequestBody UserProfile userProfile ,@PathVariable int profileId) {
		
		UserProfile profile=profileService.getByProfileId(profileId).get();
		if(profile==null) {
			
			logger.error("Error in updateProfile method : No such profile exists with profileId "+profileId);
			throw new NotFoundException("No such profile exists with profileId "+profileId);
		}
		
		logger.info("Profile is updated successfully with id "+profileId);
		profileService.updateProfile(userProfile);
		
	}
	
	
	@DeleteMapping("/delete/{profileId}")
	@Operation(summary="Delete the profile with given id if present in db!")
	public void deleteProfile(@PathVariable int profileId) {
		
		UserProfile profile=profileService.getByProfileId(profileId).get();
		if(profile==null) {
			
			logger.error("Error in deleteProfile method "+"No such profile exists with profileId "+profileId);
			throw new NotFoundException("No such profile exists with profileId "+profileId);
		}
		
		profileService.deleteProfile(profileId);
		logger.info("Profile is deleted successfully with id "+profileId);
	}
	
	
	@PostMapping("/add-merchant")
	@Operation(summary="Add  new merchant profile into the DB!")
	public UserProfile addNewMerchantProfile(@RequestBody UserProfile merchant) {
		
       UserProfile profile=profileService.getByEmail(merchant.getEmail());
		
		if(profile!=null) {
			
			logger.error("Error in addNerMerchantProfile method :"+"Merchant Profile with "+merchant.getEmail()+" email already present");
			throw new ProfileAlreadyExistException("Merchant Profile with "+merchant.getEmail()+" email already present");
		}
		
		merchant.setProfileId(sequenceGeneratorService.generateSequence(UserProfile.SEQUENCE_NAME));
		logger.info("New Merchant profile is saved successfully");
		
		return profileService.addNewMerchantProfile(merchant);
	}
	
	
	@PostMapping("/add-delivery-agent")
	@Operation(summary="Add new delivery agent's profile into the DB!")
	public UserProfile addNewDeliveryProfile(@RequestBody UserProfile deliveryagent) {
		
		 UserProfile profile=profileService.getByEmail(deliveryagent.getEmail());
			
			if(profile!=null) {
				
				logger.error("Error in addNerMerchantProfile method :"+"Delivery Agent Profile with "+deliveryagent.getEmail()+" email already present");
				throw new ProfileAlreadyExistException("Delivery Agent Profile with "+deliveryagent.getEmail()+" email already present");
			}
			
			deliveryagent.setProfileId(sequenceGeneratorService.generateSequence(UserProfile.SEQUENCE_NAME));
			logger.info("Delivery Agent Profile saved successfully");
			
			return profileService.addNewDeliveryProfile(deliveryagent);
	}
	
	
	@GetMapping("/getbymobile/{mobileNumber}")
	@Operation(summary="Get the profile with given mobile number!")
	public UserProfile getByMobileNumber(@PathVariable Long mobileNumber) {
		
		UserProfile profile=profileService.getByMobileNumber(mobileNumber);
		
		if(profile==null)
		{
			logger.error("Error in getByMobileNumber method : "+"No profile Exist with given mobile number "+ mobileNumber);
			throw new NotFoundException("No profile Exist with given mobile number "+ mobileNumber);
		}
		
		logger.info("Profile is fetched successfully with mobile number "+mobileNumber);
		
		return profile;
	}
	
	
	@GetMapping("/getbyemail/{email}")
	@Operation(summary="Get the profile with given email!")
	public UserProfile getByEmail(@PathVariable String email) {
		
		UserProfile profile= profileService.getByEmail(email);

		if(profile==null) {
			
			logger.error("Error in getByEmail method : "+"No profile Exist with given email "+ email);
			throw new NotFoundException("No profile Exist with given email "+ email);
		}
		
		logger.info("Profile is fetched successfully with email "+email);
		return profile;
	}
	
	
	@GetMapping("/getbyname/{fullName}")
	@Operation(summary="get the profile with the given name!")
	public UserProfile getByFullName(@PathVariable String fullName) {
		
		UserProfile profile=profileService.getByFullName(fullName);
		
		if(profile==null) {
			
			logger.error("Error in getByFullname method : "+"No profile Exist with given email "+ fullName);
			throw new NotFoundException("No profile Exist with given email "+ fullName);
		}
		
		logger.info("Profile is fetched successfully with name "+fullName);
		
		return profile;
	}
}
