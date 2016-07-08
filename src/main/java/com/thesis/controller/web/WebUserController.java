package com.thesis.controller.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thesis.modells.Band;
import com.thesis.modells.User;
import com.thesis.services.impl.BandServiceImp;
import com.thesis.services.impl.UserSErviceImp;

@Controller
@RequestMapping(value="/users")
public class WebUserController {

	@Autowired
	UserSErviceImp userService;
	
	@Autowired
	BandServiceImp bandService;

	// @RequestMapping(method = RequestMethod.GET, value = "/fakk")
	// public ModelAndView test() {
	// Map<String, String> map = new HashMap<>();
	// map.put("message", "alma");
	// return new ModelAndView("welcome", map);
	// }	

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public String submitForm(@ModelAttribute User user, Model model) {
		userService.regUser(user);
		model.addAttribute("user", user);
		return "result";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public String regUser(Model model) {
		return "user_reg";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/bandregister")
	public String submitForm(@ModelAttribute Band band, Model model) {
		bandService.regBand(band);
		model.addAttribute("band", band);
		return "result";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/bandregister")
	public String regBand(Model model) {
		return "band_reg";
	}
	
	
	

	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public String listUsers(@ModelAttribute User user, Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", (ArrayList<User>) users);
		return "list_users";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/bands")
	public String listBands(@ModelAttribute Band band, Model model) {
		List<Band> bands = bandService.getBands();
		model.addAttribute("bands", (ArrayList<Band>) bands);
		return "list_bands";
	}
}
