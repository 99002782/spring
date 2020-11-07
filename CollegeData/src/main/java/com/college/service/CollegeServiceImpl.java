package com.college.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.dao.CollegeRepository;
import com.college.exception.CollegeNotFoundException;
import com.college.model.College;

@Service
public class CollegeServiceImpl implements CollegeService {
    
	@Autowired
    CollegeRepository collegeRepository;

	@Override
	public College getCollegeByCode(Integer collegecode) throws CollegeNotFoundException{
		return collegeRepository.findById(collegecode)
				.orElseThrow(()->new CollegeNotFoundException("College with specified id not found"));
	}
	
	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		College newCollege=collegeRepository.save(college);
	return newCollege;
}

	@Override
	public Boolean deleteCollege(Integer collegecode) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		 collegeRepository.deleteById(collegecode);
		 return true;
 	}

	@Override
	public List<College> getAllColleges() {
		// TODO Auto-generated method stub
		return collegeRepository.findAll();
	}

	@Override
	public List<College> getCollegeByName(String CollegeName) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findCollegeByName(CollegeName);
	}

	@Override
	public List<College> getCollegeByState(String CollegeState) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findCollegeByState(CollegeState);
	}

	@Override
	public College getToatalStu(Integer collegecode) {
	// TODO Auto-generated method stub
	return collegeRepository.findAllStudents(collegecode);
}

	
	

	
	
	

}
