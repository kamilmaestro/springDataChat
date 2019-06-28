package pl.kamilmarnik.springdatachat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kamilmarnik.springdatachat.domain.User;
import pl.kamilmarnik.springdatachat.services.UserService;


@Controller
@RequestMapping("/chat")
public class ChatApiController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
}
