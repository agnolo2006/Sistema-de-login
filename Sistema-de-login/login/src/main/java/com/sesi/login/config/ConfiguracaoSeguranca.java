package com.sesi.login.config;

import java.beans.JavaBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ConfiguracaoSeguranca {
	
	@Bean
	public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception{
		http
			.authorizeHttpRequests((authorize) ->
				authorize
					.requestMatchers("/login", "/registrar").permitAll()
					.anyRequest().authenticated()
				);
		
		
		return http.build();
	}
}
