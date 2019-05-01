package Inheritance;

public class My_Calculation extends calculation{
int z= 0;
	
	public void multiplication(int x, int y){
		z= x+y;
		
		System.out.println("multiply"+z);
	}
	
	public static void main(String args[]){
		int a=10;
		int b=20;
		
		My_Calculation cal = new My_Calculation();
		cal.addition(a, b);
		cal.multiplication(a,b);
		cal.subtraction(a, b);
	}
}
