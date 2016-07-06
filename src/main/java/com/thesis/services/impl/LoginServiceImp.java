package com.thesis.services.impl;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thesis.modells.User;
import com.thesis.modells.dto.LoginDto;
import com.thesis.repositories.BandRepository;
import com.thesis.repositories.UserRepository;
import com.thesis.services.LoginService;

@Service
public class LoginServiceImp implements LoginService {
	@Autowired
	private UserRepository userrepo;
		
	@Override
	public User auth(LoginDto loginDto) throws AuthenticationException
	{
		User user = userrepo.findByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword());
		if (user == null)
			throw new AuthenticationException();
		
		return user;
	}
}
