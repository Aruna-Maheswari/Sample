package com.userdetails;

public class UserDetails {
	private int id;
	private String name;
	private String mail;
	private String password;
	 private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UserDetails() {
		super();
		this.name = name;
		this.mail = mail;
		this.age = age;
		this.id=id;
		
	}
	
	
	

}



