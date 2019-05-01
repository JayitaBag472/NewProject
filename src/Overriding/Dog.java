package Overriding;

public class Dog extends Animal {
	
	public void move(){
		super.move();
		System.out.println("dog can move");
		
		
	}
	
	public void bark(){
		System.out.println("dog can bark");
	}

}
