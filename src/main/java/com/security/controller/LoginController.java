package com.security.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

@RequestMapping("/auth")
@RestController
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		Map<String, String> map = new HashMap<>();
		map.put("code", "000000");
		map.put("message", "成功！");
		return JSON.toJSONString(map);
	}
}
