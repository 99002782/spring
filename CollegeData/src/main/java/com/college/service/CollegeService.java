package com.college.service;
import java.util.List;

import com.college.exception.CollegeNotFoundException;
import com.college.model.College;
public interface CollegeService {
	College getCollegeByCode(Integer collegecode) throws CollegeNotFoundException;
    College addCollege(College college);
    Boolean deleteCollege(Integer collegecode) throws CollegeNotFoundException;
    List<College> getAllColleges();
 
    List<College> getCollegeByName(String CollegeName) throws CollegeNotFoundException;
    List<College> getCollegeByState(String CollegeState) throws CollegeNotFoundException;
	College getToatalStu(Integer collegecode);
}
