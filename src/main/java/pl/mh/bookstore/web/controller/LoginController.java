package pl.mh.bookstore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}