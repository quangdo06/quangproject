package projectcoffe.cofffeDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import projectcoffe.cofffeDemo.dto.User;

@Controller
public class LoginController{
	@GetMapping("/login")
	public String login() {
		return "/views/CofeShopProject/index.html";
	}
	@PostMapping("/login")
	public String login(@ModelAttribute User user) {
		System.out.println(user.getPassword());
		System.out.println(user.getUsername());
		return "/views/CofeShopProject/login.html";
	}
	
}
