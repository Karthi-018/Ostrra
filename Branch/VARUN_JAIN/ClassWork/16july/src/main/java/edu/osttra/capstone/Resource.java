package edu.osttra.capstone;

import java.util.*;

public class Resource {

	  private String id;
	  private String name;
	  private String rtn;
	  private Map<String, List<String>> attributes;


	  public Resource(String id, String name, String rtn, Map<String, List<String>> attributes) {
	    this.id = id;
	    this.name = name;
	    this.rtn = rtn;
	    this.attributes = attributes;
	  }

	}
