package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AllInOne {
	
	@RequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp ) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>SUM IS : " +(n1+n2)+"</h1>");
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub(@RequestParam int n1, @RequestParam int n2) {
		ModelAndView mav = new ModelAndView("display.jsp");
		mav.addObject("res", "SUB IS : "+(n1-n2));
		return mav;
		
	}
	
	@RequestMapping("/mul")
	public void mul(HttpServletRequest req, HttpServletResponse resp ) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>MUL IS : " +(n1*n2)+"</h1>");
	}
	
	@RequestMapping("/div")
	public ModelAndView div(@RequestParam int n1, @RequestParam int n2) {
		ModelAndView mav = new ModelAndView("display.jsp");
		mav.addObject("res", "DIV IS : "+(n1/n2));
		return mav;
	}	
	

}
