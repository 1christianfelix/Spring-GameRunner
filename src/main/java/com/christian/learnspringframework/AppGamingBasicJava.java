package com.christian.learnspringframework;

import com.christian.learnspringframework.game.GameRunner;
import com.christian.learnspringframework.game.MarioGame;
import com.christian.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();

	}

}
