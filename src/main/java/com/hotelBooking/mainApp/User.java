package com.hotelBooking.mainApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class User {
	@Autowired
	HRepository h_repo;
	@RequestMapping("/")
	public String homePage(){
		return "out.jsp";		
	}
	@RequestMapping("/addUser")
	public String addUser(Register user){
		h_repo.save(user);
		return "welcome.jsp";
	}
	@GetMapping("/login")
	public ModelAndView home_page(){
		ModelAndView mv=new ModelAndView("login.jsp");
		mv.addObject("user",new User());
		return mv;
	}
	@GetMapping("/verify")
	public String verify(String email, String password){
		Register user=h_repo.findByEmail(email);
		if(user!=null){
			if(user.getPassword().equals(password)){
				return "welcome.jsp";
			}
			return "loginfail.jsp";
		}
		return "out.jsp";
	}
	
}
//@Controller
//public class User {
//	HRepository h_repo;
//	@Autowired
//	public ModelAndView home_page(User user){
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("User",user);
//		mv.setViewName("out.jsp");
//		h_repo.save(user);
//		return "welcome.jsp;
//	}


//@Controller
//	public class User {
//		@Autowired
//		HRepository h_repo;
//		
//		@RequestMapping("/home")
//		//@ResponseBody
//		public String print(){
//			System.out.println("hi");
//			return "out.jsp";
//		}
//	}
	


