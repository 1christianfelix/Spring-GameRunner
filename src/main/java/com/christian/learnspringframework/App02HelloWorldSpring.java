package com.christian.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.christian.learnspringframework.game.GameRunner;
import com.christian.learnspringframework.game.MarioGame;
import com.christian.learnspringframework.game.PacmanGame;
import com.christian.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1: Launch a Spring Context 
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2: Configure the things that we want spring to manage - 
		// HelloWorldCOnfiguration - @Configuration
		// name - @Bean
		
		// 3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));

	}

}
