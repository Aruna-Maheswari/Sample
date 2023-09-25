package com.model;

public class AddressDetails {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int usrid;
	private String address;
	private String state;
	private int pincode;
	public int getUsrid() {
		return usrid;
	}
	public void setUsrid(int usrid) {
		this.usrid = usrid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public AddressDetails() {
		super();
		
		this.usrid = usrid;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
		this.id=id;
	}
	
	

}



