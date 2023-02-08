package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfiguration implements WebMvcConfigurer{
	 @Override
	 public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		 registry.addResourceHandler("/**")
		 .addResourceLocations("classpath:/templates/"
											,"classpath:/templates/**/"
											,"classpath:/templates/assets/"
											,"classpath:/templates/assets/js"
											,"classpath:/templates/main"
											,"classpath:/templates/board"
											)
											
		 .setCacheControl(CacheControl.maxAge(50, TimeUnit.MINUTES));
		}

}
