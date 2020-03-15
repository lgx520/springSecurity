package com.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.mapper.UserMapper;
import com.security.pojo.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//查询用户
		UserMapper mapper = new UserMapper();
		
		User user = new User();
		user.setUsername(username);
		
		User result = mapper.getUser(user);
		
		return result;
	}

}
