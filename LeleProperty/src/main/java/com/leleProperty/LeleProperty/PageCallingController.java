package com.leleProperty.LeleProperty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageCallingController {
	
	
	@RequestMapping("/")
	public String getNavbar() {
        return "index"; // Returns the navbar.html template
    }
	
	@RequestMapping("/productlist")
	public String getpropertpage() {
        return "fragment/property"; // Returns the navbar.html template
    }
	@RequestMapping("/addproperty")
	public String getaddProperty() {
        return "addproperty"; // Returns the navbar.html template
    }
	
	@RequestMapping("/ad")
	public String getadminpage() {
        return "sidebar"; // Returns the navbar.html template
    }
	
	@RequestMapping("/registration")
	public String getRegisternpage() {
        return "fragment/registration"; // Returns the navbar.html template
    }
	
	@RequestMapping("/userdetail")
	public String getuseDetail() {
        return "userdetail"; // Returns the navbar.html template
    }
	
	@RequestMapping("/contact")
	public String getcontactpage() {
        return "contact"; // Returns the navbar.html template
    }
	@RequestMapping("/service")
	public String getservicepage() {
        return "service"; // Returns the navbar.html template
    }
	
	
	@GetMapping("/login")
    public String login() {
        return "fragment/login"; // Return the name of your login HTML file
    }

}
