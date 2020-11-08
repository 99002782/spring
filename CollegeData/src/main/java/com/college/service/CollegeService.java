package com.college.service;
import java.util.List;

import com.college.exception.CollegeNotFoundException;
import com.college.model.College;
public interface CollegeService {
	College getCollegeByCode(Integer collegecode) throws CollegeNotFoundException;
    College addCollege(College college);
    Boolean deleteCollegeByCode(Integer collegecode) throws CollegeNotFoundException;
    List<College> getAllColleges();
 
    List<College> getCollegeBycity(String collegecity) throws CollegeNotFoundException;
    List<College> getCollegeBystate(String collegestate) throws CollegeNotFoundException;
	//College getAllStudents(Integer collegecode);
}
