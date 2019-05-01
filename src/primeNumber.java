
public class primeNumber {

	public static void main(String args[]){
		int i,m=0;
		int flag=0;
		
		int n=10;
		m= n/2;
		
		if(n==0||n==1){
			System.out.println("number is not prime number");
		
		}
		else{
			for (i=2;i<=m;i++){
				if(n%i==0){
					
					System.out.println("number is  prime number");
					
					flag=1;
					break;
				
				}
				
				
			}
			
			if(flag==0){
				
				System.out.println("number is prime number");
			}
		}
		
	}
}
