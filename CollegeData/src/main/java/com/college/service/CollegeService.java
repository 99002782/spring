package com.college.service;
import java.util.List;

import com.college.exception.CollegeNotFoundException;
import com.college.model.College;
public interface CollegeService {
	College getCollegeByCode(Integer code) throws CollegeNotFoundException;
    College addCollege(College college);
    Boolean deleteCollegeByCode(Integer code) throws CollegeNotFoundException;
    List<College> getAllColleges();
 
    //List<College> getCollegeBycity(String city) throws CollegeNotFoundException;
    //List<College> getCollegeBystate(String state) throws CollegeNotFoundException;
	//College getAllStudents(Integer collegecode);
}
