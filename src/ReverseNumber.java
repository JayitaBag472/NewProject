
public class ReverseNumber {
	
	public static void main(String args[]){
		
		int num = 134567;
		 int reverseNumber = 0;
		 
		 while(num!=0){
			 
			 reverseNumber = reverseNumber *10;
			 reverseNumber= reverseNumber +num%10;
			 num = num/10;
			 
			 
		 }
		 
		 System.out.println("reverse number" + reverseNumber);
	}

}
