package com.cardetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CarInformation")
public class CarDetails {
	@Id
	private int carId;
	private String carName;
	private int carCost;
	public int getCarId() {
		return carId;
	