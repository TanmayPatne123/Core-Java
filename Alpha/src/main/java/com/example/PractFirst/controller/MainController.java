package com.example.PractFirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.PractFirst.entity.User2;
import com.example.PractFirst.service.UserService;



@Controller
public class MainController {

	@Autowired
	private UserService service;
	
	@GetMapping("/login")
	public String showPage() {
		return "login";
	}
	
	
	@PostMapping("/login")
	public String loginUser(@RequestParam String username,
	                        @RequestParam String password,
	                        Model model) {

	    boolean isValid = service.validateUser(username, password);

	    if (!isValid) {
	        model.addAttribute("error", "Invalid username or password");
	        return "login";
	    }
	    return "redirect:/dashboard";
	}
	
	
	 	@GetMapping("/dashboard")
	    public String dashboard()
	 	{
	        return "dashboard";
	    }
	 
	 	
	 	@GetMapping("/register")
	 	public String showRegister(Model model) 
	 	{
		     model.addAttribute("user", new User2());
		     return "register";
		 }
	 	
	 	
	 	 @PostMapping("/register")
		    public String registerUser(@ModelAttribute User2 user2, Model model) {

		        User2 existingUser = service.findByUsername(user2.getUsername());

		        if (existingUser != null) 
		        {
		            model.addAttribute("error", "Username already exists!");
		            return "register";
		        }

		        service.registerUser(user2);
		        return "redirect:/login";
		    }
	 	
	 	
	
	
	
	
	
	
}
