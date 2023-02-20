package com.javaprog.copfriendlyapp;

public class Violator {
private int id;
private String name,email,violence;
private int fine,paid,due;
private String address,city,state,country,contactno;


public Violator() {}

public Violator(String name, String email, String violence, int fine, int paid, int due, String address, String city,
		String state, String country, String contactno) {
	super();
	
	this.name = name;
	this.email = email;
	this.violence = violence;
	this.fine = fine;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.city = city;
	this.state = state;
	this.country = country;
	this.contactno = contactno;
}

public Violator(int id, String name, String email, String violence, int fine, int paid, int due, String address,
		String city, String state, String country, String contactno) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.violence = violence;
	this.fine = fine;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.city = city;
	this.state = state;
	this.country = country;
	this.contactno = contactno;
}

public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getviolence() {
	return violence;
}
public void setviolence(String violence) {
	this.violence = violence;
}
public int getfine() {
	return fine;
}
public void setfine(int fine) {
	this.fine = fine;
}
public int getPaid() {
	return paid;
}
public void setPaid(int paid) {
	this.paid = paid;
}
public int getDue() {
	return due;
}
public void setDue(int due) {
	this.due = due;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}

}
