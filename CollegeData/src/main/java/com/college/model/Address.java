package com.college.model;

public class Address {
String collegecity;
String collegestate;

public Address(String collegecity, String collegestate) {
	super();
	this.collegecity = collegecity;
	this.collegestate = collegestate;
}
public String getCollegecity() {
	return collegecity;
}
public void setCollegecity(String collegecity) {
	this.collegecity = collegecity;
}
public String getCollegestate() {
	return collegestate;
}
public void setCollegestate(String collegestate) {
	this.collegestate = collegestate;
}
@Override
public String toString() {
	return "Address [collegecity=" + collegecity + ", collegestate=" + collegestate + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}

}
