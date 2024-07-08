package com.example.demo.service;

public class FindingLargestFromTheList {
	
	private DataService service;

	public FindingLargestFromTheList(DataService service) {
		super();
		this.service = service;
	}
	
	public int findLargest()
	{
		int[] dataArray = service.dataList();
		
		int largest = Integer.MIN_VALUE;
		
		for(int number : dataArray)
		{
			if(number>largest)
			{
				largest=number;
			}
		}
		
		return largest;
	}

}
