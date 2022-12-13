package com.spring.study.controller;

import com.spring.study.dto.User;
import com.spring.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String listUsers(Model model, @RequestParam(value="page", defaultValue="0") int page) {
        List<User> list = userService.list();
        model.addAttribute("list", list);
        return "user_list";
    }
}
