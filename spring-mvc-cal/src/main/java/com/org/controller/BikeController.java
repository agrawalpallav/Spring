package com.org.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.BikeCRUD;
import com.org.dto.Bike;

@Controller
public class BikeController {
	
	@RequestMapping("/save")
	public String saveBike(@ModelAttribute Bike b) {
		BikeCRUD.saveBike(b);
		return "bike.jsp";
	}
	
	@RequestMapping("/get")
	public ModelAndView getBikes() {
		ModelAndView mav = new ModelAndView("displaybikes.jsp");
		List<Bike> bikes = BikeCRUD.getBikes();
		mav.addObject("bikes", bikes);
		return mav;
	}
}
