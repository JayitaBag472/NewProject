import java.util.Scanner;

public class numerictodecimal
	{
	    public static void main(String[] args) 
	    {
	        int n=45, count = 0, a;
	        int x = 0;
	        
	        while(n > 0)
	        {
	            a = n % 2;
	            
	            x = x  + a;
	            n = n / 2;
	        }
	        System.out.println("Binary number:"+x);
	        
	    }
	}


