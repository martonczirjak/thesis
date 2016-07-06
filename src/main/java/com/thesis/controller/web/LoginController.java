package com.thesis.controller.web;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thesis.modells.dto.LoginDto;
import com.thesis.services.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String login(@ModelAttribute LoginDto user, Model model) {
		try {
			model.addAttribute(loginService.auth(user));
			return "user_landing_page";
		} catch (AuthenticationException e) {
			return "login_failed";
		}
	}
}
