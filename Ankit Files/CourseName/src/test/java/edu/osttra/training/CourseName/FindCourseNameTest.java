package edu.osttra.training.CourseName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import edu.osttra.training.CourseName.service.DataService;
import edu.osttra.training.CourseName.service.FindCourseName;

@ExtendWith(MockitoExtension.class)
public class FindCourseNameTest {
	@Mock
	private DataService service;
	
	@InjectMocks
	FindCourseName courses;
	
	@Test
	public void TestCase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course name you want to find");
		String courseName = sc.next();
		
		when(service.listData()).thenReturn(List.of("Java", "Python", "c++", "ReactJs"));
		
		boolean result = courses.findCourse(courseName);
		assertEquals(true, result);
	}
	
}
