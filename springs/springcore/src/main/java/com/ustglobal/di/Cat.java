package com.ustglobal.di;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("meeaoooooo...........");

	}


}
