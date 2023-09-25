package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardetails.CarDetails;
import com.repository.CarRepository;

@Service
public class CarService {
	@Autowired 
	CarRepository carrepository;
	
	public CarDetails addingCarDetails(CarDetails carDetails)
	{
		
		return carrepository.save(carDetails);
	}
	public List<CarDetails> getCarDetails(int id)
	{
		return carrepository.findAllById(id);
	}
	public String carDeletionById(int id)
	{
		return carrepository.carDeletionById(id); 
	}
	
	

}
