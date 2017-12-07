package flowers.launch.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class FlowersController 
{
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String Login(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		model.addAttribute("name");		
		return "Login";		
	}
	
}
