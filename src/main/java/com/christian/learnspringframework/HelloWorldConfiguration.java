package com.christian.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {
	
}

record Address (String firstLine, String city) {

}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Christian";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		return new Person("Guy", 20,  new Address("Street", "Vallejo"));

	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //name, age

	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) { // name, age, address2
		return new Person(name, age, address2); //name, age
		
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Street", "Vallejo");
		
	}

}
