package com.xmlformat;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.details.AddressDetails;

import com.service.AddressService;

@RestController
public class AddressController1 {
	@Autowired
	AddressService1 addressservice;

	@PostMapping("/addressdetails")
	public Map<String, Object> addingUser(@RequestBody AddressDetails12 addressdetails) {

		return addressservice.addingAddress(addressdetails);

	}
	@PutMapping("/addressDetails")
	public Map<String,Object> updateUser(@RequestBody AddressDetails12 addressdetails)
	 {
	
	   return addressservice.updateAddress(addressdetails);

    }
	@DeleteMapping("/addressDetails/{id}")
	public Map<String,Object> deleteaddressById(@PathVariable int id)
	 {
	
	   return addressservice.deleteaddressById(id);

    }
	@GetMapping("/addressDetails/{id}")
	public List<Map<String,Object>> getAddressById(@PathVariable int id)
	 {
	
	   return addressservice.getAddressById(id);

    }
	@GetMapping("/addressDetails")
	public Map<String, Object> retrieveAddress()
	 {
	
	   return addressservice.retrieveAddress();

	
}
}