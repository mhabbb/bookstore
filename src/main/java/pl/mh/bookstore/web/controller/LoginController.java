package pl.mh.bookstore.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user")
    public String userPanel(){
        return "user";
    }

    @GetMapping("/")
    public String guestPage(){
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String adminPanel(){
        return "admin";
    }

}