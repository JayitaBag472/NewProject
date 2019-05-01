
public class palindrom {
	
	public static void main(String args[]){
		int temp,b,c = 0;
		
		int a= 787;
		
		temp =a;
		
		while (a>0){
			b= a%10;//7
			 c= (c*10)+b; //7
			a=a/10; //78
			
			
		}
		
		if(temp==c)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			
		
		
		
	}


