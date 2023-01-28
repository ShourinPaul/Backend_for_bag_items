package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.BagDao;
import com.springrest.springrest.entity.Bags;


@Service
public class BagServiceImpl implements bagService {
	
//	List<Courses>list;
	
	@Autowired
	private BagDao bagDao;
	
	public BagServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Courses(145,"Java Core Course","Rhis Course Contain basic of java"));
//		list.add(new Courses(146,"Spring boot course","creating rest api using spring boot"));

	}

	@Override
	public List<Bags> getCourses() {
		
		return bagDao.findAll();
	}

	@Override
	public Bags getCourses(long bagId) {
//		Courses c=null;
//		for(Courses course: list)
//		{
//			if(course.getId()==courseId)
//			{
//				c = course;
//				break;
//			}
//		}
		return bagDao.getReferenceById(bagId);
	}

	@Override
	public Bags addCourse(Bags bag) {
//		list.add(course);
		
		bagDao.save(bag);
		return bag;
	}

	@Override
	public void deleteCourse(long parseLong) {
		//list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Bags entity = bagDao.getReferenceById(parseLong);
		bagDao.delete(entity);
	}

	@Override
	public Bags updateCourse(Bags bag) {
		
		
//		int index = 0;
//		for(Courses c: list)
//		{
//			if(c.getId()==course.getId())
//			{
//				index = list.indexOf(c);
//				list.set(index,course);
//				
//			}
//		}
		bagDao.save(bag);
		return bag;
	}

}
