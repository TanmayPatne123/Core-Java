package com.example.PractFirst.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	
	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/register","/login","/style.css","/edit-expense/**","/delete-expense/**").permitAll()
                    .anyRequest().authenticated()
            )
            .userDetailsService(userDetailsService)
            .formLogin(login -> login
                    .loginPage("/login")
                    .defaultSuccessUrl("/dashboard", true)
                    .permitAll()
            )
            .logout(logout -> logout.permitAll());

        return http.build();
	}
}
