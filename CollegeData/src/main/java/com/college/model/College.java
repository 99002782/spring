package com.college.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="college")
@TypeAlias("College")
public class College {
	@Id
	String collegeName;
    Integer totalstu;
    Integer collegeCode;
    Address address;
    
	public College(String collegeName, Integer totalstu, Integer collegeCode, Address address) {
		super();
		this.collegeName = collegeName;
		this.totalstu = totalstu;
		this.collegeCode = collegeCode;
		this.address = address;
	}
	public Integer getTotalstu() {
		return totalstu;
	}
	public void setTotalstu(Integer totalstu) {
		this.totalstu = totalstu;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Integer getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(Integer collegeCode) {
		this.collegeCode = collegeCode;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", totalstu=" + totalstu + ", collegeCode=" + collegeCode
				+ ", address=" + address + "]";
	}
	
	
}
