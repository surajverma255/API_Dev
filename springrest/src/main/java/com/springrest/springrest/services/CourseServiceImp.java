package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImp implements CourseService {

	List<Course> list;
	public CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Course(145,"This is a java course to learn API Dev","Java"));
		list.add(new Course(150,"This is a Python course to learn API Dev","Python"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
