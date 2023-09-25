package com.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.details.AddressDetails;

@SpringBootTest
public class AddressServiceTest {

	@Autowired
	AddressService addresservice;
	@Autowired
	AddressDetails addressdetails;
	@Mock
	JdbcTemplate jdbcTemplate;
	
	@Mock
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Test
	public void addingAddress()
	{
		Mockito.when(namedParameterJdbcTemplate.update(Mockito.anyString(), Mockito.any(MapSqlParameterSource.class))).thenReturn(1);
		
		Map<String,Object> result = addresservice.addingAddress(addressDetailsrequestBody());
		
		assertEquals("inserted", result.get("msg"));
	}
	
	@Test
	public void addingAddressCase1()
	{
		Mockito.when(namedParameterJdbcTemplate.update(Mockito.anyString(), Mockito.any(MapSqlParameterSource.class))).thenReturn(0);
		
		Map<String,Object> result = addresservice.addingAddress(addressDetailsrequestBody());
		
		assertEquals("this data is mismatch", result.get("msg"));
	}
	
	@Test
	public void addingAddressExceptionCase()
	{
		Mockito.when(namedParameterJdbcTemplate.update(Mockito.anyString(), Mockito.any(MapSqlParameterSource.class))).thenThrow(NullPointerException.class);
		
		Map<String,Object> result = addresservice.addingAddress(addressDetailsrequestBody());
		
		assertTrue(result.isEmpty());
	}
	
	
	public AddressDetails addressDetailsrequestBody()
	{
		AddressDetails ad = new AddressDetails();
		ad.setId(111);
		ad.setAddress("Address");
		ad.setPincode(12345);
		return ad;
	}
   @Test
  public void updateAddress()
  {
	   Mockito.when(namedParameterJdbcTemplate.update(Mockito.anyString(), Mockito.any(MapSqlParameterSource.class))).thenReturn(1); 
		Map<String,Object> result = addressService.updateAddress(addressDetailsrequestBodyupdate());

	   assertEquals("updated", result.get("msg"));
	}
   public AddressDetails addressDetailsrequestBodyupdate()
	{
		AddressDetails ad1 = new AddressDetails();
		ad1.setId(111);
		ad1.setAddress("Address");
		//ad.setPincode(12345);
		return ad1;
	}
   @Test
	public void updateAddressCase()
	{
		Mockito.when(namedParameterJdbcTemplate.update(Mockito.anyString(), Mockito.any(MapSqlParameterSource.class))).thenReturn(0);
		
		Map<String,Object> result = addressService.updateAddress(addressDetailsrequestBodyupdate());
		
		assertEquals("update failed", result.get("msg"));
	}
	
   @Test
	public void updateAddressExceptionCase()
	{
		Mockito.when(namedParameterJdbcTemplate.update(Mockito.anyString(), Mockito.any(MapSqlParameterSource.class))).thenThrow(NullPointerException.class);
		
		Map<String,Object> result = addressService.updateAddress(addressDetailsrequestBodyupdate());
		
		assertTrue(result.isEmpty());
	}
   @Test
   public void 
	
	
  }

