package pl.kamilmarnik.springdatachat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kamilmarnik.springdatachat.domain.User;

@Controller
public class ChatApiController {

    @RequestMapping("/user")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
}
