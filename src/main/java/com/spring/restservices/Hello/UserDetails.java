package com.spring.restservices.Hello;

public class UserDetails {

	private String Firstname;
	private String Lastname;
	private String City;
	public UserDetails(String firstname, String lastname, String city) {
		Firstname = firstname;
		Lastname = lastname;
		City = city;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "UserDetails [Firstname=" + Firstname + ", Lastname=" + Lastname + ", City=" + City + "]";
	}
	
}
