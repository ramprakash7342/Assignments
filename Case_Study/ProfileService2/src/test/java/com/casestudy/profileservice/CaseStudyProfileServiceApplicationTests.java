package com.casestudy.profileservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.casestudy.profileservice.entity.Address;
import com.casestudy.profileservice.entity.Role;
import com.casestudy.profileservice.entity.UserProfile;
import com.casestudy.profileservice.repository.ProfileRepository;
import com.casestudy.profileservice.service.ProfileServiceImpl;


@SpringBootTest
class CaseStudyProfileServiceApplicationTests {

	@Autowired
	private ProfileServiceImpl profileServiceImpl;
	
	@MockBean
	private ProfileRepository profileRepository;
	
	@Test
	public void getAllProfilesTest() {
		Address address=new Address(121,"streetName","colonyName","city","state",2342);
		
		
		when(profileRepository.findAll()).thenReturn(Stream.of(
				new UserProfile(1,"fullname1","image1","email1",12143123L,"about1","dob1","gender1",Role.ROLE_CUSTOMER,"password1",address),
				new UserProfile(2,"fullname2","image2","email2",12143123L,"about2","dob2","gender2",Role.ROLE_DELIVERYAGENT,"password2",address),
				new UserProfile(3,"fullname3","image3","email3",12143123L,"about3","dob3","gender3",Role.ROLE_MERCHANT,"password3",address),
				new UserProfile(4,"fullname4","image4","email4",12143123L,"about4","dob4","gender4",Role.ROLE_MERCHANT,"password4",address)
				).collect(Collectors.toList()));
		
		assertEquals(4, profileServiceImpl.getAllProfiles().size());
	}
	
	@Test 
	public void getByMobileNumberTest() {
		
		Address address=new Address(121,"streetName","colonyName","city","state",2342);
		
		when(profileRepository.findAllByMobileNumber(12143125L)).thenReturn(
				new UserProfile(112,"fullname","image","email",12143125L,"about","dob","gender",Role.ROLE_DELIVERYAGENT,"password",address)
				);
		
		assertEquals(112,profileServiceImpl.getByMobileNumber(12143125L).getProfileId() );
	}
	
	@Test
	public void getByEmailTest() {
		
        Address address=new Address(121,"streetName","colonyName","city","state",2342);
		
		when(profileRepository.findByEmail("ram123@email.com")).thenReturn(
				new UserProfile(1134,"ramprakash","image","email",12143125L,"about","dob","gender",Role.ROLE_MERCHANT,"password",address)
				);
		
		assertEquals("ramprakash", profileServiceImpl.getByEmail("ram123@email.com").getFullName());
		
	}
	
	@Test
	public void getByFullName() {
		
        Address address=new Address(121,"streetName","colonyName","city","state",2342);

        when(profileRepository.findByfullName("ramprakashsingh")).thenReturn(
        		
				new UserProfile(1134,"ramprakashsingh","image","email",12143125L,"about","dob","gender",Role.ROLE_MERCHANT,"password",address)
        		);
        
        assertEquals("email", profileServiceImpl.getByFullName("ramprakashsingh").getEmail());
	}
	
	@Test
	public void getByMobileTest() {
		
        Address address=new Address(121,"streetName","colonyName","city","state",2342);
        
        when(profileRepository.findAllByMobileNumber(1245463543L)).thenReturn(
        		
				new UserProfile(1134,"ramprakashsingh","image","email",1245463543L,"about","dob","gender",Role.ROLE_MERCHANT,"password",address)

        		);
        
        assertEquals(1134, profileServiceImpl.getByMobileNumber(1245463543L).getProfileId());
	}
	
	
	

}
