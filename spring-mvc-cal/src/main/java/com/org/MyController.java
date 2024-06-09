package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/msg")
	public String getMessage() {
		return "msg.jsp";
	}
	
	@RequestMapping("/sendval")
	public String sendValue(Model m) {
		m.addAttribute("val", "value sent by using model");
		return "msg.jsp";
	}
	@RequestMapping("/sendviewmodel")
	public ModelAndView sendViewModel() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("msg.jsp");
		mav.addObject("val", "value sent by using model and view");
		return mav;
		
	}
	@RequestMapping("emp")
	public String getEmp(@RequestParam int eid, @RequestParam String ename, @RequestParam double sal) {
		//if we change order or change the name of parameter here then we have to give the value for fileds like-
		//@RequestParam(value="eid") int eid, @RequestParam (value="ename") String ename, @RequestParam double sal
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		return "employee.jsp";
	}
	
	@RequestMapping("emp1")
	public String getEmp(@ModelAttribute Employee e) {
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getSal());
		return "employee.jsp";
	}
}
