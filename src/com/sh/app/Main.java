package com.sh.app;

import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Snake;

public class Main {
	public static void main(String args[]) {
		System.out.println("hello world!");
		System.out.println("hello Git");
		
		new Dog().bark();
		new Cat().jump();
		new Snake().bite();
	}
}
