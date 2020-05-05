package vn.com.cyberlogitec.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfiguration.class);
		
		// Get Room Beans
		Room1 room1 = ctx.getBean(Room1.class);
		Room2 room2 = ctx.getBean(Room2.class);
		Room3 room3 = ctx.getBean(Room3.class);
		
		System.out.print("Room1 info:");
		room1.getRoom();
		room1.getAnimal().getname();
		System.out.print("Room2 info:");
		room2.getRoom();
		room2.getAnimal().getname();
		System.out.print("Room3 info:");
		room3.getRoom();
		room3.getAnimal().getname();
	}
}
