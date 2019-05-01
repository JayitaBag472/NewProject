package Overriding;

public class TestDog {
	
	public static void main(String args[]){
		
		Animal a = new Animal();
		Animal d= new Dog();
		Dog o= new Dog();
		a.move();
		d.move();
		o.bark();
	}

}
