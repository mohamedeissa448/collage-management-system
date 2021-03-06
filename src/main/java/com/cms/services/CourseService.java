package com.cms.services;

import java.util.List;
import java.util.Optional;

import com.cms.entity.Course;


public interface  CourseService {

	void addCourse(Course course);
	void updateCourse(Course course);
	Optional<Course> getCourse(int id);
	List<Course> getAllCourses();
	void deleteCourse(int id);
    List<Course> getAllCoursesByTerm(String term);
    List<Course> getAllCoursesByYear(String year);
    List<Course> getAllCoursesByYearANDTermIgnoreCase(String year,String term);
	
}
