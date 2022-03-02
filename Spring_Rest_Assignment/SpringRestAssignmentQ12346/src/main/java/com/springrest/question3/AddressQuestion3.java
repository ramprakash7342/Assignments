package com.springrest.question3;

public class AddressQuestion3 {

	private long zipcode;
	private String city;
	private String state;
	private String country;
	
	
	public AddressQuestion3() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AddressQuestion3(long zipcode, String city, String state, String country) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public long getZipcode() {
		return zipcode;
	}


	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "AddressQuestion3 [zipcode=" + zipcode + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
	
	
}
