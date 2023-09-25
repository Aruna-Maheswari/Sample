package com.userdetails;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
	@Autowired 
	UserService userservice;
	@PostMapping("/userdetails")
	 public Map<String,Object> addingUser(@RequestBody UserDetails userdetails)
	 {
	
	   return userservice.addingUser(userdetails);

     }
	@PutMapping("/userdetails")
	public Map<String,Object> updateUser(@RequestBody UserDetails userdetails)
	 {
	
	   return userservice.updateUser(userdetails);

    }
	@DeleteMapping("/userdetails/{id}")
	public Map<String,Object> deleteUserById(@PathVariable int id)
	 {
	
	   return userservice.deleteUserById(id);

    }
	@GetMapping("/userdetails/{mail}")
	public List<Map<String,Object>> getEmail(@RequestBody UserDetails userdetails)
	 {
	
	   return userservice.getEmail(userdetails);

    }
	
	
	
}


