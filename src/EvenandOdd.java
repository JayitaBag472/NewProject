import java.util.Scanner;

public class EvenandOdd {
	
	public static void main(String[] args){
		
		int num;
		System.out.println("enter a number1");
		Scanner scanner = new Scanner(System.in);
		 num = scanner.nextInt();
		 
		 if(num % 2==0){
			 System.out.println("entered number is even");
		 }
		 else{
			 System.out.println("entered number is odd");
		 }
		
	}

}
