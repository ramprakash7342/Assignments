package com.springrest.question3;

import java.util.List;



public interface AddressService {

	public List<AddressQuestion3> getAddress();
	public AddressQuestion3 getAddress(long zipcode);
}
