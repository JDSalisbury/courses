package org.wecancodeit.courses;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class CourseRepository {
	
	
	
	Map<String, Course> courses = new HashMap<>();
	
	public CourseRepository() {
		Course java = new Course("1L", "Java", "Java Description");
		Course javascript = new Course("2L", "JS", "JS Description");
		Course spring = new Course("3L", "Spring", "Spring Description");
		
		courses.put(java.getId(), java);
		courses.put(javascript.getId(), javascript);
		courses.put(spring.getId(), spring);
	}

	public CourseRepository(Course course) {
		courses.put(course.getId(), course);
	}
	
	public CourseRepository(List<Course> asList) {
		for(Course course : asList) {
			courses.put(course.getId(), course);
		}
	}
	
	public Course findOne(String id) {
		return courses.get(id);
		
	}
	
	public Collection<Course> findAll(){
		return courses.values();
	}
}
