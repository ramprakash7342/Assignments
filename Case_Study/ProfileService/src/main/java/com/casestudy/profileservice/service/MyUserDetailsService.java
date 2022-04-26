package com.casestudy.profileservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.casestudy.profileservice.authentication.CustomUserDetails;
import com.casestudy.profileservice.entity.UserProfile;
import com.casestudy.profileservice.repository.ProfileRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private ProfileRepository profileRepository;
	
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    	Optional<UserProfile> userProfile =Optional.empty();
    	
    	UserProfile userProfile1 =  profileRepository.findByEmail(username); 
        
    	userProfile=Optional.of(userProfile1);
    	
    	userProfile.orElseThrow(()-> new UsernameNotFoundException("User with email " + username + " not found!"));
    	
        return userProfile.map(CustomUserDetails::new).get();        	
      
 
    }
}