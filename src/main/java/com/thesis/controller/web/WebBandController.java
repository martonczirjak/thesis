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
import com.thesis.services.UserService;
import com.thesis.services.impl.BandServiceImp;

@Controller
@RequestMapping(value="/bands")
public class WebBandController {

	@Autowired
	UserService userService;
	
	@Autowired
	BandServiceImp bandService;

	// @RequestMapping(method = RequestMethod.GET, value = "/fakk")
	// public ModelAndView test() {
	// Map<String, String> map = new HashMap<>();
	// map.put("message", "alma");
	// return new ModelAndView("welcome", map);
	// }
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public String submitForm(@ModelAttribute Band band, Model model) {
		bandService.regBand(band);
		model.addAttribute("band", band);
		return "result";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public String regBand(Model model) {
		return "band_reg";
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String listBands(@ModelAttribute Band band, Model model) {
		List<Band> bands = bandService.getBands();
		model.addAttribute("bands", (ArrayList<Band>) bands);
		return "list_bands";
	}
}
