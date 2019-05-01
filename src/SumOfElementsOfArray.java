

public class SumOfElementsOfArray {
	
	public static void main(String args[]){
		
		int[] array= {2,5,6,7,10,11};
		
		int sum =0;
		
		for (int num :array){
			
			sum = sum+num;	
			
		}
		System.out.println("total "+sum);
	}

}
