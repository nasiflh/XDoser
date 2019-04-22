package com.rans.demosite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    CourseDao courseDao;

    @GetMapping("course")
    public String greetingForm(Model model) {
        model.addAttribute("user", new CourseModel());
        return "course";
    }

    @PostMapping("course")
    public String userLogin(@ModelAttribute CourseModel courseModel) {
        try {
            CourseModel actualModel = courseDao.find(courseModel.getUsername());
            if (actualModel != null) {
                return "success";
            }
        } catch (Exception e) {
        }
        return "failed";
    }
}