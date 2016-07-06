package com.thesis.controller.api;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thesis.modells.User;
import com.thesis.services.impl.UserSErviceImp;

@RestController
@RequestMapping("/api/users")
//@Configuration
//@ComponentScan("com.thesis.services")
public class UserController {
	
	
	@Autowired
	private UserSErviceImp us;
	
	
	
	@RequestMapping (method=RequestMethod.GET, value="")
	public List<User> getusers() {
		return us.getUsers();
	}
	
	@RequestMapping (method=RequestMethod.POST, value= "")
	public int regUser(@RequestBody User user) {	
		us.regUser(user);
		return HttpServletResponse.SC_CREATED;
	}
	
	@RequestMapping (method=RequestMethod.DELETE, value= "/{userId}")
	public void delUser(@PathVariable("userId") Long userId) {
		 us.delUser(userId);
	}
	
	
	

}
