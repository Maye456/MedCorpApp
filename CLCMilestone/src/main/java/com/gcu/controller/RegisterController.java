package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.model.RegisterModel;

@Controller
@RequestMapping("/register")
public class RegisterController 
{
	@GetMapping("/")
	public String display(Model model)
	{
		// Display Register View
		model.addAttribute("title", "Register Form");
		model.addAttribute("registerModel", new RegisterModel());
		return "register";
	}
	
	@PostMapping("/doRegister")
	public String doRegister(@Valid RegisterModel registerModel, BindingResult bindingResult, Model model)
	{
		// Check for validation errors
		if (bindingResult.hasErrors())
		{
			model.addAttribute("title", "Register Form");
			return "register";
		}
		
		model.addAttribute("registerModel", registerModel);
		return "registerSuccess";
	}
}
