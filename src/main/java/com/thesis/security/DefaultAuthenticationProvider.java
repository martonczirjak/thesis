package com.thesis.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thesis.modells.User;
import com.thesis.modells.dto.LoginDto;
import com.thesis.services.LoginService;

public class DefaultAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private LoginService loginService;

	@Override
	public Authentication authenticate(Authentication arg0) throws AuthenticationException {
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) arg0;

		LoginDto l = new LoginDto();
		l.setUsername((String) token.getPrincipal());
		l.setPassword((String) token.getCredentials());
		try {
			loginService.auth(l);
			arg0.setAuthenticated(true);
			return arg0;
		} catch (javax.naming.AuthenticationException e) {
			arg0.setAuthenticated(false);
			return arg0;
		}
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

}
