package com.college.model;

public class Address {
String collegecity;
String collegeState;
public String getCollegecity() {
	return collegecity;
}
public void setCollegecity(String collegecity) {
	this.collegecity = collegecity;
}
public String getCollegeState() {
	return collegeState;
}
public void setCollegeState(String collegeState) {
	this.collegeState = collegeState;
}
@Override
public String toString() {
	return "Address [collegecity=" + collegecity + ", collegeState=" + collegeState + "]";
}

}
