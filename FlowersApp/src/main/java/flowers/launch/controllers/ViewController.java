package flowers.launch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import flowers.launch.models.Package;
import flowers.launch.models.User;
import flowers.launch.services.PackageService;

@Controller
@SessionAttributes({"prodList", "itemTotal", "itemCount", "itemList"})
public class ViewController {

	@Autowired
	private PackageService packageService;	

	public ViewController(PackageService packageService) {
		this.packageService = packageService;		
	}
		
	@RequestMapping({ "/" })
	public String index(ModelMap model) {
		model.addAttribute("prodList", this.packageService.findAll());
		model.addAttribute("product", new Package());	
		return "/main";
	}

    @GetMapping("/main")
    public String mainB(ModelMap model) {
    	model.addAttribute("prodList", this.packageService.findAll());
		model.addAttribute("product", new Package());	
    	return "/main";
    }

    @GetMapping("/admin")
    public String admin(ModelMap model) {
        return "/admin";
    }

    @GetMapping("/user")
    public String user(ModelMap model) {
        return "/user";
    }

    @GetMapping("/about")
    public String about(ModelMap model) {
        return "/about";
    }
    
    @GetMapping("/packages")
    public String packages(ModelMap model) {        
        return "/packages";
    }
    
    @GetMapping("/contact")
    public String contact(ModelMap model) {        
        return "/contact";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("User", new User(null, "", "", ""));
        return "/main";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute User user)
    {
        return "/login";
    }

    @GetMapping("/403")
    public String error403(ModelMap model) {
        return "/error/403";
    }
} 
