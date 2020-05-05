package vn.com.cyberlogitec.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Room3 implements IRoom {
	
	@Autowired
	@Qualifier("bird")
	private IAnimal animal;
	
	public Room3() {}
	
	public Room3(IAnimal animal) {
		this.animal = animal;
	}
	
	@Override
	public IAnimal getAnimal() {
		return animal;
	}
	
	@Override
	public void setAnimal(IAnimal animal) {
		this.animal = animal;
	}

	@Override
	public void getRoom() {
		System.out.println("Room 3");
	}
}
