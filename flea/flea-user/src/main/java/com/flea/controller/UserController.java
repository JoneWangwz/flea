package com.flea.controller;

import com.flea.service.UserService;
import com.flea.util.PageResult;
import com.flea.util.Params;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test() {
        try {
            String test = userService.test();
            return test;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
