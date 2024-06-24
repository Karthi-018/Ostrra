package com.example.mockitoLearn.mockitoLearn;

public class CourseManagement{

	private CoursesIF _courses;

	public CourseManagement(CoursesIF subIF) {
		super();
		this._courses = subIF;
	}
	
	public boolean check(String targetCourse) {
		String[] allCourses=_courses.getCourseList();
		for(String curr: allCourses) {
			if(curr.equalsIgnoreCase(targetCourse)) return true;
		}
		return false;
	}
}
