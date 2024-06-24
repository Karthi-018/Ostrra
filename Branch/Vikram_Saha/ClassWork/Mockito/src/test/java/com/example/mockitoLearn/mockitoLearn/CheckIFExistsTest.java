package com.example.mockitoLearn.mockitoLearn;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CheckIFExistsTest {

	@Mock
	private CoursesIF _courses;
	
	@InjectMocks
	private CourseManagement cie;
	@Test
	void test() {
		when(_courses.getCourseList()).thenReturn(new String[]{"mca","bca","bsc","bcom"});
		boolean found=cie.check("bca");
		assertEquals(true, found);
	}

}
