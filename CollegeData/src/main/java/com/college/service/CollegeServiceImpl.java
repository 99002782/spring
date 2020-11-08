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
	public College getCollegeByCode(Integer collegecode) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
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
	public Boolean deleteCollegeByCode(Integer collegecode) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		collegeRepository.deleteById(collegecode);
		return true;
	}

	@Override
	public List<College> getAllColleges() {
        return collegeRepository.findAll();
	}

	@Override
	public List<College> getCollegeBystate(String collegeState) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findCollegeBystate(collegeState);
	}

	@Override
	public List<College> getCollegeBycity(String collegecity) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findCollegeBycity(collegecity);
	}
}
