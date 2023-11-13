package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Monkey;
import com.sh.app.animal.Snake;

public class Main {
	public static void main(String args[]) {
		System.out.println("HELLO WORLD!"); // ctrl+shift+x 대문자로 수정
		System.out.println("HELLO GIT");

		new Dog().bark();
		new Cat().jump();
		new Snake().bite();
		new Bird().fly();
		new Monkey().walk();
	}
}
