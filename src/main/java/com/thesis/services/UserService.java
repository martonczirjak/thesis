package com.thesis.services;

import java.util.List;

import com.thesis.modells.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User regUser(User user);
	
	public void delUser(Long userId);
	

}
