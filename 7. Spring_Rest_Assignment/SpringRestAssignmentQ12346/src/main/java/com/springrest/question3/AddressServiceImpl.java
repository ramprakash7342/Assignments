package com.springrest.question3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

	List<AddressQuestion3> list;
	
	@Override
	public List<AddressQuestion3> getAddress() {
		list=new ArrayList<>();
		list.add(new AddressQuestion3(243638,"Sahaswan","Utter Pradesh","India"));
		list.add(new AddressQuestion3(243637,"Bilsi","Madhya Pradesh","India"));
		list.add(new AddressQuestion3(99501,"ANCHORAGE","AK","US"));
		list.add(new AddressQuestion3(144411,"phagwara","Punjab","India"));
		
		return list;
	}

	@Override
	public AddressQuestion3 getAddress(long zipcode) {
		
		AddressQuestion3 add=null;
		
		for(AddressQuestion3 address:list)
		{
			if(address.getZipcode()==zipcode)
			{
				 add=address;
				 break;
			}
		}
		return add;
	}

}

