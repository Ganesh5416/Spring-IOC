package com.entity;

public class Company {

	int cID;
	String name;
	Employee e ;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int cID, String name, Employee e) {
		super();
		this.cID = cID;
		this.name = name;
		this.e = e;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Company [cID=" + cID + ", name=" + name + ", e=" + e + "]";
	}
	
	
	
	
	
}
