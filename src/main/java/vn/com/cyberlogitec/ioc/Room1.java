package vn.com.cyberlogitec.ioc;

public class Room1 implements IRoom {

	private IAnimal animal;
	
	public Room1() {}
	
	public Room1(IAnimal animal) {
		this.animal = animal;
	}
	
	@Override
	public void setAnimal(IAnimal animal) {
		this.animal = animal;
	}
	
	@Override
	public IAnimal getAnimal() {
		return animal;
	}

	@Override
	public void getRoom() {
		System.out.println("Room 1");
	}
}
