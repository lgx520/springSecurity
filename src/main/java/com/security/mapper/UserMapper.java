package com.security.mapper;

import java.util.ArrayList;
import java.util.List;

import com.security.pojo.User;

public class UserMapper {
	
	public User getUser(User user) {
		if (!"gxli".equals(user.getUsername())) {
			return null;
		}
		
		User result = new User();
		result.setUsername("gxli");
		result.setPassword("liguoxing");
		
		return result;
	}
	
	public List<String> getAuthorities(String id) {
		List<String> list = new ArrayList<>();
		list.add("superAdmin");
		
		return list;
	}
}
