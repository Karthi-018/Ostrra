package training.demo2;

import java.util.List;
import java.util.Scanner;

public class Cources {
	

	    private service s;
	    public void Courses(service s) {
	        this.s=s;
	    }
	    public boolean isThere() {
	        String[] arr= s.course();
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Which course");
	        String sec= sc.nextLine();
	        for(String x : arr)
	        {
	            if(sec.equals(x))
	                return true;
	        }
	        return false;
	    }
	}

