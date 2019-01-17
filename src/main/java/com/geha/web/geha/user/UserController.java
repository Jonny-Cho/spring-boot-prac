package com.geha.web.geha.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/info")
    public String getUserInfo(Model model){

        User user = new User();
        user.setId("kenny");
        user.setName("dongkyoon");
        user.setEmail("kenny@email.com");

        model.addAttribute(user);

        return "user";
    }

    @GetMapping("/hello")
    public String hello(Model model){

        model.addAttribute("hello", "hello");

        return "Hello";
    }

}
