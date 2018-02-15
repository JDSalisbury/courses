package org.wecancodeit.courses;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	@RequestMapping("/course")
	public String showCourses(Model model) {
		Course courses = new Course("1234", "Java", "Intro to java");
		model.addAttribute("courses", courses);
		return "courses";
	}

}
