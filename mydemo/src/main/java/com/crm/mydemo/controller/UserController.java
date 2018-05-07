package com.crm.mydemo.controller;


import com.crm.mydemo.entity.User;
import com.crm.mydemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private IUserService service;


    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/getuser")
    public String getuser(HttpServletRequest request, HttpServletResponse response) {

        User u = service.findUserByUserid("1");
        System.out.print(u.getName());
        request.setAttribute("u",u);
        return "test.jsp";
    }
}
