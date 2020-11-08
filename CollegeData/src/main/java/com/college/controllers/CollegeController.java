package com.college.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.exception.CollegeNotFoundException;
import com.college.model.College;
import com.college.service.CollegeService;
@RestController
@RequestMapping("/college-api")
public class CollegeController {
@Autowired
CollegeService collegeService;
@PostMapping("/colleges")
College addCollege(@RequestBody College college) {
	return collegeService.addCollege(college);
}
@GetMapping("/colleges")
List<College> getAllColleges(){
	return collegeService.getAllColleges();
}
@DeleteMapping("/colleges/delete-one/{collegecode}")
boolean deleteCollege(@PathVariable("collegecode")Integer collegeCode) throws CollegeNotFoundException{
	return collegeService.deleteCollegeByCode(collegeCode);
}
//@GetMapping("/colleges/get-one/{collegecode}")
//List<College> getCollegeByState(@PathVariable("collegeState")String collegeState) throws CollegeNotFoundException{
//	return collegeService.getCollegeByState(collegeState);
//}
//@GetMapping("/colleges/page/{page}")
//List<College> getCollegeByCity(@PathVariable("page")String page)throws CollegeNotFoundException{
//	return collegeService.getCollegeByName(page);
//}
}

