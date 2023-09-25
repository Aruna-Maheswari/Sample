package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cardetails.CarDetails;
import com.service.CarService;

@RestController
public class CarController
{
	@Autowired
	CarService carservice;
	@PostMapping("/CarInformation")
	public String addingCarDetails(@RequestBody CarDetails carDetails)
	{
		 carservice.addingCarDetails(carDetails);
		 return "inserted success";
	
	}
	@GetMapping("/CarInformation/{id}")
	public List<CarDetails> getCarDetails(@PathVariable int id)
	{
		return carservice.getCarDetails(id);
		
	}
	@DeleteMapping("/CarInformation/{id}")
	public String carDeletionById(@PathVariable int id)
	{
		carservice.carDeletionById(id);
		return "Record deleted";
	}
	
}