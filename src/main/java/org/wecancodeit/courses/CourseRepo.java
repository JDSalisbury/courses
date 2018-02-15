package org.wecancodeit.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CourseRepo {
	
	Map<String, Course> courses = new HashMap<>();
	
	
	public Collection<Course> courseList(){
		return courses.values();
	}
	
}
