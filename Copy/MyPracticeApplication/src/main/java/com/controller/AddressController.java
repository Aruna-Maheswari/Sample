package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.AddressDetails;
import com.service.AddressService;
@RestController
public class AddressController {
	@Autowired
	AddressService addressservice;

	@PostMapping("/addressdetails")
	public Map<String, Object> addingUser(@RequestBody AddressDetails addressdetails) {

		return addressservice.addingAddress(addressdetails);

	}
	@PutMapping("/addressdetails")
	public Map<String,Object> updateUser(@RequestBody AddressDetails addressdetails)
	 {
	
	   return addressservice.updateAddress(addressdetails);

    }
	@DeleteMapping("/addressdetails/{id}")
	public Map<String,Object> deleteaddressById(@PathVariable int id)
	 {
	
	   return addressservice.deleteaddressById(id);

    }
	@GetMapping("/addressdetails/{id}")
	public List<Map<String,Object>> getAddressById(@PathVariable int id)
	 {
	
	   return addressservice.getAddressById(id);

    }
	@GetMapping("/addressdetails")
	public Map<String, Object> retrieveAddress()
	 {
	
	   return addressservice.retrieveAddress();

	
}


}
