package com.casestudy.profileservice.entity;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UserProfile")
public class UserProfile {


	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";
	
	 
	@Id
	private int profileId;
	
	
	//user name should have at least 2 characters
	//user name should not be null or empty
	@NotEmpty
	@Size(min=2,message="username should have at least 2 characters")
	private String fullName;
	
	private String image;
	
	//email should be a valid email format
	//email should not be null or empty
	@NotEmpty
	@Email
	private String email;
	private long mobileNumber;
	private String about;
	private String  dateOfBirth;
	
	@NotEmpty
	private String gender;
	private Role role;
	
	@Size(min=6,message="password length should be at least 6")
	private String password;
	private Address address;

	public UserProfile() {
		super();
	}

	public UserProfile(int profileId, String fullName, String image, String email, long mobileNumber, String about,
			String dateOfBirth, String gender, Role role, String password, Address address) {
		super();
		this.profileId = profileId;
		this.fullName = fullName;
		this.image = image;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.about = about;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.role = role;
		this.password = password;
		this.address =  address;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserProfile [profileId=" + profileId + ", fullName=" + fullName + ", image=" + image + ", email="
				+ email + ", mobileNumber=" + mobileNumber + ", about=" + about + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", role=" + role + ", password=" + password + ", address=" + address + "]";
	}
}
