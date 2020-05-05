package vn.com.cyberlogitec.ioc;

public class Room2 implements IRoom {

	private IAnimal animal;
	
	public Room2() {}
	
	public Room2(IAnimal animal) {
		this.animal = animal;
	}
	
	@Override
	public IAnimal getAnimal() {
		// TODO Auto-generated method stub
		return animal;
	}

	@Override
	public void setAnimal(IAnimal animal) {
		this.animal = animal;
	}
	
	@Override
	public void getRoom() {
		System.out.println("Room 2");
	}

}
