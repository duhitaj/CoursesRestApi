package com.springtest.springtest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springtest.springtest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		
		list.add(new Course(22,"Java","it has java basics"));
		list.add(new Course(12,"SpringBoot","it has spring boot contents"));
	
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:list) {
			if(course.getId() == courseId){
		         c=course ;
			}
		}
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
		
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		list.forEach(e ->{
			
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public Course deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		//list.remove(course);
		return null;
	}

	
	

	
}
