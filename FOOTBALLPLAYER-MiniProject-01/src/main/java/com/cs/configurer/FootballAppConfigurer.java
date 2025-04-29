package com.cs.configurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Component
public class FootballAppConfigurer implements WebMvcConfigurer {
	
	
	public FootballAppConfigurer() {
		System.out.println("Hue Hue Zero Param Constructor");
	}
	
	@Autowired
	private LocaleChangeInterceptor localeInterceptors;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeInterceptors);
	}
	
}
