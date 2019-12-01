package com.ustglobal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.ustglobal.di.Cat;
import com.ustglobal.di.Dog;
import com.ustglobal.di.Pet;
@Configuration
@Import(HelloConfigurationClass.class)
public class PenConfigurationClass {

	@Bean(name="dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean(name="Cat")
	public Cat getCat() {
		return new Cat();
	}
	
	@Bean(name = "pet")
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Bittu");
		//pet.setAnimal(getDog());   ------------->Wired
		return pet;
	}
}
