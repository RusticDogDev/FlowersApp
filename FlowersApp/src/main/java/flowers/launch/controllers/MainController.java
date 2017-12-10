package flowers.launch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import flowers.launch.models.User;

@Controller
public class MainController {
	
	@GetMapping("/")
    public String home1() {
        return "/main";
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
    	return "main";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
