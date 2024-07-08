package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.service.FindingLargestFromTheList;

public class FindingLargestFromTheListTestUsinfStub {
	
	@Test
	public void TestCase()
	{
		FindingLargestFromTheListStub stub = new FindingLargestFromTheListStub();
		FindingLargestFromTheList list = new FindingLargestFromTheList(stub);
		
		int result = list.findLargest();
		assertEquals(30, result);
	}

}
