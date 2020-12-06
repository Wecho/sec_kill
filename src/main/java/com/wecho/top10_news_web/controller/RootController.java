package com.wecho.top10_news_web.controller;

import com.wecho.top10_news_web.entity.User;
import com.wecho.top10_news_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller("/")
public class RootController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("homepage");
    }

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        User user = userService.getUserById(id);
        return Objects.requireNonNullElseGet(user, User::new);
    }
}
