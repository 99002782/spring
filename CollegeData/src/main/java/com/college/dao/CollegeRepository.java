package com.college.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.model.College;

@Repository
public interface CollegeRepository extends MongoRepository<College,Integer>{
College findCollegeBycode(Integer code);
College findCollegeByname(String name);
//List<College> findCollegeBycity(String city);
//College findAllStudents(Integer collegecode);

//@Query("{'totalstu':{$gt:?1000}}")
//List<College>findTotalstu(String collegename);
}
