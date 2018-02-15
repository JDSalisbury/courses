package org.wecancodeit.courses;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	@Resource
	CourseRepository courseRepo;
	
	@RequestMapping("/courses")
	public String getAllCourses(Model model) {
		
		model.addAttribute("courses", courseRepo.findAll());
		return "courses";
	}

}
