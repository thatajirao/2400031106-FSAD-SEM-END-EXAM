package com.klu.__FSAD_SKILL_EXAM_main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Welcome to FSAD Skill Exam Application!";
	}

}
