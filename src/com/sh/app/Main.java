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

		System.out.println("동물기능 시작~");
		System.out.println("Animal Go~");
		new Dog().bark();
		new Cat().jump();
		new Snake().bite();
		new Bird().fly();
		new Monkey().walk();
	}
	
	public void test() {
		System.out.println("Main#test");
	}
}
