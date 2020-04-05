package com.spring.sample.form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.sample.form.domain.Project;

@Controller
public class ProjectController {

    @GetMapping("/")
    public String createProjectForm(Model model) {

        model.addAttribute("project", new Project());
        return "demoform";
    }

    @PostMapping("/save")
    public String saveProjectSubmission(@ModelAttribute Project project) {
        return "result";
    }
}
