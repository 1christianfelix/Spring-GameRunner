package com.christian.learnspringframework.game;

public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("crouch");
	}
	
	public void left() {
		System.out.println("back");
	}
	
	public void right() {
		System.out.println("shoot");
	}
}
