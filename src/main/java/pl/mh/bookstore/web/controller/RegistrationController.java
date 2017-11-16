package pl.mh.bookstore.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mh.bookstore.domain.User;
import pl.mh.bookstore.domain.UserDto;
import pl.mh.bookstore.service.RegisterService;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    @Autowired
    private RegisterService registerService;

    @ModelAttribute("user")
    public UserDto userRegistrationDTO(){
        return new UserDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") @Valid UserDto userDto, BindingResult result){
        User emailExist = registerService.findByEmail(userDto.getEmail());
        if(emailExist!=null){
            result.rejectValue("email", null, "There is already an account registered with this email");
        }

        User loginExist = registerService.findByLogin(userDto.getLogin());
        if(loginExist!=null){
            result.rejectValue("login", null, "There is already an account registered with this username");
        }

        if(result.hasErrors()){
            return "registration";
        }

        registerService.save(userDto);
        return "redirect:/login";
    }

}