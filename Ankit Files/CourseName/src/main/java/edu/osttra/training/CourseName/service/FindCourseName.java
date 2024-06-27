package edu.osttra.training.CourseName.service;

import java.util.List;

public class FindCourseName {
	
	private DataService service;
	
	public FindCourseName(DataService service) {
		super();
		this.service = service;
	}
	
	public boolean findCourse(String course) {
		List<String> courses = service.listData();
		boolean found = false;
		if(courses.contains(course)) {
			found = true;
		}
		return found;
	}
}
