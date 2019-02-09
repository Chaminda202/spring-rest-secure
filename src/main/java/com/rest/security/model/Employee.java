package com.rest.security.model;

public class Employee {
	private Integer empId;
	private String name;
	private Integer age;
	private String address;
	
	public Employee() {
		super();
	}
	
	public Employee(Integer empId, String name, Integer age, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
