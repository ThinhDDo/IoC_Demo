package vn.com.cyberlogitec.ioc;

public class Cat implements IAnimal {

	public Cat() {}
	
	@Override
	public void getname() {
		System.out.println("Cat");
	}

}
