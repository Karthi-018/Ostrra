package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.service.DataService;
import com.example.demo.service.FindingLargestFromTheList;

@ExtendWith(MockitoExtension.class)
public class FindingLargestFromTheListTestUsingMockito {
	
	@Mock
	private DataService service;
	
	@Mock
	private DataService service1;
	
	@InjectMocks
	FindingLargestFromTheList list;
	
	
	@Test
	public void TestCase()
	{
		when(service.dataList()).thenReturn(new int[] {10,20,30});
		int result = list.findLargest();
		assertEquals(30, result);
	}

	@Test
	public void TestCase2()
	{
		when(service.dataList()).thenReturn(new int[] {10});
		int result = list.findLargest();
		assertEquals(10, result);
	}
	
	@Test
	public void TestCase3()
	{
		when(service.dataList()).thenReturn(new int[] {});
		int result = list.findLargest();
		assertEquals(Integer.MIN_VALUE, result);
	}
}
