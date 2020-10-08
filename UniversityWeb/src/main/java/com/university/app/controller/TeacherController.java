package com.university.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.university.app.model.service.ITeacherService;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private ITeacherService teacherService;
	
	@GetMapping("/access")
    public String getAll(Model model) {
        model.addAttribute("teachers", teacherService.findAll());
        return "teachers";
	}    
}
