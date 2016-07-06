package com.thesis.services;

import javax.naming.AuthenticationException;

import com.thesis.modells.User;
import com.thesis.modells.dto.LoginDto;

public interface LoginService {
	public User auth(LoginDto loginDto) throws AuthenticationException;
}
