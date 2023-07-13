package com.christian.learnspringframework;

import com.christian.learnspringframework.game.GameRunner;
import com.christian.learnspringframework.game.MarioGame;
import com.christian.learnspringframework.game.PacmanGame;
import com.christian.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); //1: Object Creation
		var gameRunner = new GameRunner(game); 
		//2: Object Creation + Wiring of Dependencies
		// game is a Dependency of GameRunner
		gameRunner.run();

	}

}
