package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Bags;
import com.springrest.springrest.services.bagService;

@RestController
public class MyController {
	
	@Autowired
	private bagService bagService;

	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	
	//Get all data
	@GetMapping("/bags")
	public List<Bags> getCourses()
	{
		return this.bagService.getCourses();
	}
	
	//get specified data
	@GetMapping("/bags/{bagId}")
	public Bags getCourses(@PathVariable String courseId)
	{
		return this.bagService.getCourses(Long.parseLong(courseId));
	}
	
	//add in the database
	@PostMapping("/bags")
	public Bags addCourse( @RequestBody Bags course)
	{
		return this.bagService.addCourse(course);
	}
	
	
	//delete a data
	@DeleteMapping("/bags/{bagId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId )
	{
		try {
			this.bagService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//update a data
	@PutMapping("/bags")
	public Bags updateCourse( @RequestBody Bags course)
	{
		return this.bagService.updateCourse(course);
	}
	
	
	
}
