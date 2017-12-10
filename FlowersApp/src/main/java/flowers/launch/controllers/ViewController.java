package flowers.launch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import flowers.launch.models.User;

<<<<<<< HEAD:FlowersApp/src/main/java/flowers/launch/controllers/MainController.java
@RestController
public class MainController {
=======
@Controller
public class ViewController {
>>>>>>> 74ddf33215abfb9f5909e4472d6d173521cf55a0:FlowersApp/src/main/java/flowers/launch/controllers/ViewController.java
	
	@GetMapping("/")
    public String home1() {
        return "/login";
    }

    @GetMapping("/main")
    public String home() {
        return "/main";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("User", new User(null, "", "", ""));
    	return "login";
    }
    
    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute User user)
    {        	
    	return "main.html";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}