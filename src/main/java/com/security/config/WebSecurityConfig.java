package com.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/**
 *     定义安全拦截机制
 * @author gxli
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors()
		    .and()
		    .csrf()
		    .disable()
		    .authorizeRequests()
		    //user路径下都需要认证
		    .antMatchers("/user/**").authenticated()
		    .and()
		    .formLogin()
		    .loginProcessingUrl("/auth/login")
		    .successForwardUrl("/index.html");
	}
	
}
