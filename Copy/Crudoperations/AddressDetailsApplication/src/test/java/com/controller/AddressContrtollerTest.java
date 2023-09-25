package com.controller;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.details.AddressDetails;
import com.service.AddressService;

@SpringBootTest
public class AddressContrtollerTest {

	@InjectMocks
	AddressController addressController;
	
	@Mock
	AddressService addressService;
	
	@Test
	public void addingUser()
	{
		Mockito.when(addressService.addingAddress(Mockito.any())).thenReturn(response());
		
		Map<String, Object> result = addressController.addingUser(addressDetailsrequestBody());
		
		assertEquals("Inserted",result.get("Msg"));
	}
	
	public Map<String, Object> response()
	{
		Map<String, Object> r = new HashMap<>();
		
		r.put("Msg", "Inserted");
		
		return r;
	}
	
	public AddressDetails addressDetailsrequestBody()
	{
		AddressDetails ad = new AddressDetails();
		ad.setId(111);
		ad.setAddress("Address");
		ad.setPincode(76876);
		return ad;
	}
	@Test
	public void updateUser()
	{
		Mockito.when(addressService.updateAddress(Mockito.any())).thenReturn(response());
		
		Map<String, Object> result = addressController.updateUser(addressDetailsrequestBody1());
		
		assertEquals("Updated",result.get("Msg"));
	}
	public Map<String, Object> response1()
	{
		Map<String, Object> r = new HashMap<>();
		
		r.put("Msg", "Updated");
		
		return r;
	}
	public AddressDetails addressDetailsrequestBody1()
	{
		AddressDetails ad = new AddressDetails();
		ad.setId(111);
		
		
		ad.setAddress("Addess");
		//ad.setPincode(12);
		return ad;
	}
	
}
	
	
