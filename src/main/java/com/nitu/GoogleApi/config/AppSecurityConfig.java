package com.nitu.GoogleApi.config;

import java.io.IOException;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.google.api.client.extensions.java6.auth.oauth2.VerificationCodeReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleOAuthConstants;

@Configuration
@EnableWebSecurity
@EnableOAuth2Sso
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	// only for google authentication

	protected void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/test").permitAll().anyRequest().authenticated();
	}

}
