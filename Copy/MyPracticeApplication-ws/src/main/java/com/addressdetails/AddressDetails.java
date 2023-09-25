package com.addressdetails;

public class AddressDetails {
	private int id;
	private int usrid;
	private String address;
	private String state;
	private int pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		// TODO Auto-generated constructor stub
	}
	public AddressDetails(int id, int usrid, String address, String state, int pincode) {
		super();
		this.id = id;
		this.usrid = usrid;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
	}
	
	
	
	
	

}



