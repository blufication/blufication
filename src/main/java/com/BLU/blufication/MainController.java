package com.BLU.blufication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BLU.blufication.dao.UserRepo;
import com.BLU.blufication.model.User;


@Controller
public class MainController {
	
	@RequestMapping("home")
	public ModelAndView home()
	{	
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home.jsp");		
		return mv; 
	}
	@Autowired 
	UserRepo repo;
	@RequestMapping("login")	
	public ModelAndView Login(User user)
	{	
		ModelAndView mv=new ModelAndView();
		User Duser = repo.findByUsername("lokeshB");
		if (Duser==user) {
		mv.setViewName("sucess.jsp");
		}
		else
			mv.setViewName("error.jsp");
		return mv; 
		
	}

}
