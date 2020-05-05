package vn.com.cyberlogitec.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
	
	@Bean
	public Cat cat() {
		return new Cat();
	}
	
	@Bean
	public Dog dog() {
		return new Dog();
	}
	
	@Bean
	public Bird bird() {
		return new Bird();
	}
	
	@Bean
	public Room1 room1() {
		Room1 room1 = new Room1();
		room1.setAnimal(cat());
		return room1;
	}
	
	@Bean
	public Room2 room2() {
		return new Room2(dog());
	}
	
	@Bean
	public Room3 room3() {
		return new Room3();
	}
}
