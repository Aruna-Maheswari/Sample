package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardetails.CarDetails;

public interface CarRepository extends JpaRepository<CarDetails,Integer >{

 
	List<CarDetails> findAllById(int id);

	String carDeletionById(int id);
       
}
