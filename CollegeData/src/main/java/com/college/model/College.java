package com.college.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="college")
@TypeAlias("college")
public class College {
       @Autowired
	String collegeName;
    Integer totalstu;
    Integer collegeCode;
    Address address;
	public Integer getTotalstu() {
		return totalstu;
	}
	public void setTotalstu(Integer totalstu) {
		this.totalstu = totalstu;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeCode=" + collegeCode + "]";
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
	
}
