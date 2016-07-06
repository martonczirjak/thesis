package com.thesis.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesis.modells.User;
import com.thesis.repositories.UserRepository;
import com.thesis.services.UserService;


@Service
public class UserSErviceImp implements UserService{
	
	@Autowired
	private UserRepository userRepo;
	
	
	public List<User> getUsers()
	{
		return userRepo.findAll(); 
	}
	
	public User regUser(User user)
	{
		return userRepo.save(user);
	}
	
	
	public void delUser(Long userId)
	{
		userRepo.delete(userId);
	}
}
