package com.xwx.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xwx.entity.User;
import com.xwx.service.UserService;

@Controller
@RequestMapping("userController")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping(value="/getName")
	public ModelAndView getName(String name,HttpServletResponse response){
		/*List<String> list = userService.findAllName();
		for(String a : list){
			System.out.println(a);
		}*/
		User user = new User();
		user.setName("xwx11");
		user.setAge(22);
		userService.save(user);
		return new ModelAndView("userDetail");
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
