package com.xmlformat;

public class AddressDetails12 {
	private int id;
	private String address;
	private String state;
	public AddressDetails12(int id, String address, String state, int pincode) {
		super();
		this.id = id;
		this.address = address;
		this.state = state;
		this.pincode = pincode;
	}
	public AddressDetails12() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int pincode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	

}
