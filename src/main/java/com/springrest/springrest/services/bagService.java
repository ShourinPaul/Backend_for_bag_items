package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Bags;

public interface bagService {
	public List<Bags>getCourses();
	
	public Bags getCourses(long bagId);
	
	public Bags addCourse(Bags bag);
	
	public void deleteCourse(long parseLong);
	
	public Bags updateCourse(Bags bag);
}
