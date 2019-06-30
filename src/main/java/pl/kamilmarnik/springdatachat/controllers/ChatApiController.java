package pl.kamilmarnik.springdatachat.controllers;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.kamilmarnik.springdatachat.domain.Post;
import pl.kamilmarnik.springdatachat.domain.User;
import pl.kamilmarnik.springdatachat.services.PostService;
import pl.kamilmarnik.springdatachat.services.UserService;

import javax.validation.Valid;


@Controller
@RequestMapping("/chat")
public class ChatApiController {
    private UserService userService;
    private PostService postService;
    private User currentUser;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("")
    public String redirToLogin(){
        return "redirect:/chat/login";
    }

    @RequestMapping("/login")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public String saveOrUpdateUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "login";
        }
        userService.saveUser(user);
        currentUser = user;

        return "redirect:/chat/posts";
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String getPosts(Model model){
        model.addAttribute("posts", postService.getPosts());
        return "posts";
    }

    @RequestMapping(value = "/post/new")
    public String newPost(Model model) {
        model.addAttribute("post", new Post());

        return "post";
    }

    @RequestMapping(value = "/post/save", method = RequestMethod.POST)
    public String savePost(@Valid Post post, BindingResult bindingResult){
        if(bindingResult.hasErrors()) {
            return "post";
        }
        post.setDate(postService.getDate());
        post.setUserLogin(currentUser.getLogin());
        post.setUser(currentUser);
        postService.savePost(post);

        return "redirect:/chat/posts";
    }

    @RequestMapping(value = "/post/{id}")
    public String showPost(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.getPostById(id));

        return "showpost";
    }

    @RequestMapping(value = "/post/edit/{id}")
    public String editPost(@PathVariable Long id, Model model){
        model.addAttribute("post", postService.getPostById(id));

        return "post";
    }
}
