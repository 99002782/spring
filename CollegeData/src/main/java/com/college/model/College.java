package com.college.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="college")
@TypeAlias("College")
public class College {
	@Id
	String name;
    Integer totalstu;
    Integer code;
    Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalstu() {
		return totalstu;
	}
	public void setTotalstu(Integer totalstu) {
		this.totalstu = totalstu;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public College(String name, Integer totalstu, Integer code, Address address) {
		super();
		this.name = name;
		this.totalstu = totalstu;
		this.code = code;
		this.address = address;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", totalstu=" + totalstu + ", code=" + code + ", address=" + address + "]";
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	
	
}
