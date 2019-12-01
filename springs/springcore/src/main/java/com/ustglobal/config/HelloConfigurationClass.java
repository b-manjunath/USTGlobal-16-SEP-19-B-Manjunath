package com.ustglobal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.di.Cat;
import com.ustglobal.di.Dog;
import com.ustglobal.di.Hello;
import com.ustglobal.di.Pet;
@Configuration
public class HelloConfigurationClass {
	
	@Bean(name = "hello")
	//@Scope("prototype")
	public Hello getHello() {
		Hello hello =new Hello();
		hello.setMsg("I Like Music");
		return hello;		
	}
	
}
