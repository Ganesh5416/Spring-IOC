package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("102")
	int empid;
	@Value("Mahesh")
	String name;
	@Value("Mumbai")
	String city;
	public Employee() {
		
	}
	public Employee(int empid, String name, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", city=" + city + "]";
	}

	
	
}
